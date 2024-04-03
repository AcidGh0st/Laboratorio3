package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilisticTest {

    @Test
    void testPrimality() {
        int[] numbers = {29341, 131071, 214748, 483647, 2147483647};

        System.out.println("Test de Primalidad:");
        for (int num : numbers) {
            System.out.println(num + " es probablemente primo: " + Probabilistic.rabinMiller(num, 5));
        }
        System.out.println();
    }

    @Test
    void testBirthdayParadox() {
        int[] populations = {30, 23, 57, 10, 85, 5};

        System.out.println("Paradoja del Cumpleaños:");
        for (int pop : populations) {
            System.out.println("Probabilidad de que al menos dos personas compartan cumpleaños entre " +
                    pop + " personas: " + String.format("%.2f", Probabilistic.birthdayParadox(pop) * 100) + "%");
        }
    }
}