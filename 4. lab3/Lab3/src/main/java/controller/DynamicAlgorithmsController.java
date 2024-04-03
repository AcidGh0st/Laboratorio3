package controller;

import domain.Dynamic;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class DynamicAlgorithmsController
{


    Dynamic dm= new Dynamic();
    @javafx.fxml.FXML
    private ComboBox comboBox_Selected;
    @javafx.fxml.FXML
    private TextField text_EnterValue;
    @javafx.fxml.FXML
    private TextArea textA_result;
    @javafx.fxml.FXML
    private Button calculateButton;
    @javafx.fxml.FXML
    private Button btn_clear;


    @javafx.fxml.FXML
    public void initialize() {

        comboBox_Selected.getItems().addAll("Factorial", "Fibonacci", "CoinChange");

    }


    @javafx.fxml.FXML
    public void clearButton(ActionEvent actionEvent) {

        //Limpia los campos de cada entrada
        btn_clear.setOnAction( event->{

            text_EnterValue.clear();
            textA_result.clear();
            comboBox_Selected.getSelectionModel().clearSelection();

        });
    }

    private final int[] monedasPredeterminadas = {1, 2, 5, 10}; //Arreglo de las monedas

    @Deprecated
    public void calculateButton(ActionEvent actionEvent) {

        String selectedMethod = (String) comboBox_Selected.getValue(); //Obtener el resultado del comboBox y castearlo a String
        long result; //Almacena el resultado de cada metodo

        switch (selectedMethod) {

            case "Factorial":
                result = dm.factorial(Integer.parseInt(text_EnterValue.getText()));

                break;
            case "Fibonacci":
                result = dm.fibonacci(Integer.parseInt(text_EnterValue.getText()));
                break;
            case "CoinChange":

                result = dm.coinChange(monedasPredeterminadas, Integer.parseInt(text_EnterValue.getText()));
                break;

            default:
                // Manejar un caso de selección no válida
                textA_result.setText("Debe seleccionar un algoritmo de las opciones que se le presentan");
                return;

        }

        textA_result.setText(String.valueOf(result)); //Muestra el resultado de cada metodo en el testArea

        /*
    dm.fibonacci(Integer.parseInt(text_EnterValue.getText()));
    dm.factorial(Integer.parseInt(text_EnterValue.getText()));
    dm.coinChange(monedasPredeterminadas,Integer.parseInt(text_EnterValue.getText()));


         */
    }


}