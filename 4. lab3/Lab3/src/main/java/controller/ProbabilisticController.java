package controller;

import domain.Probabilistic;
import domain.Vector;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProbabilisticController
{
    @javafx.fxml.FXML
    private ComboBox comboBox;
    @javafx.fxml.FXML
    private TextArea textArea;
    @javafx.fxml.FXML
    private TextField textField;
    private  Alert alert;

    @javafx.fxml.FXML
    public void initialize() {

        comboBox.getItems().addAll("Rabin-Miller", "Birthday paradox");
        alert = new Alert(Alert.AlertType.ERROR);
    }

    private boolean isValid() {
        return !textField.getText().isEmpty()
                &&Integer.valueOf(this.textField.getText())>0;
    }

    @javafx.fxml.FXML
    public void calculateOnAction(ActionEvent actionEvent) {
        if (isValid()) {
            long num = Long.parseLong(textField.getText());//tomo numero del textField

            if (num > 0 && num <= 120) {
                double probability = Probabilistic.birthdayParadox((int) num)*100;
                textArea.setText("Birthday Paradox Probability for " + num + " people: \n " +
                        "For " + num + " people, the probability is: " + String.format("%.2f",probability) + "%");
            } else {
                boolean prime = Probabilistic.rabinMiller(num, 5);
                if (prime)
                    textArea.setText("Rabin-Miller Probability for Big Number " + num + ": \n " +
                            "The big number: " + num + " is probably prime.");
                else
                    textArea.setText("Rabin-Miller Probability for Big Number " + num + ": \n " +
                            "The big number: " + num + " is probably composite.");
            }
        }
        else{
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Try again \n Enter a positive number");
            alert.showAndWait();
        }
    }

    @javafx.fxml.FXML
    public void clearOnAction(ActionEvent actionEvent) {
        textArea.clear();
        textField.clear();
        comboBox.getSelectionModel().clearSelection();

    }

}