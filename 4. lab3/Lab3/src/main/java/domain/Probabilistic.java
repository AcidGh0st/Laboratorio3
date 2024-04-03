package domain;

import java.math.BigInteger;
import java.util.Random;

public class Probabilistic {

    // Algoritmo de Rabin-Miller
    public static boolean rabinMiller(long n, int k) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0) return false;

        long d = n - 1;
        int r = 0;
        while (d % 2 == 0) {
            d /= 2;
            r++;
        }

        Random rand = new Random();
        for (int i = 0; i < k; i++) {
            long a = rand.nextInt((int)(n - 3)) + 2;
            long x = modPow(a, d, n);
            if (x == 1 || x == n - 1) continue;

            boolean probablePrime = false;
            for (int j = 0; j < r - 1; j++) {
                x = modPow(x, 2, n);
                if (x == 1) return false;
                if (x == n - 1) {
                    probablePrime = true;
                    break;
                }
            }
            if (!probablePrime) return false;
        }
        return true;
    }

    // Método para calcular (base^exponent) % modulus
    private static long modPow(long base, long exponent, long modulus) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % modulus;
            }
            base = (base * base) % modulus;
            exponent /= 2;
        }
        return result;
    }

    // Paradoja del cumpleaños
    public static double birthdayParadox(int n) {
        double probability = 1.0;
        for (int i = 1; i < n; i++) {
            probability *= (366 - i) / 365.0;
        }
        return 1 - probability;
    }

}
