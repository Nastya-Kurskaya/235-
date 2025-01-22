package ru.kurskaya.kurskaya1task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task2 {

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(aField.getText());
        double b = Double.parseDouble(bField.getText());
        double c = Double.parseDouble(cField.getText());
        double ac = Math.abs(a - c);
        double bc = Math.abs(b - c);
        double sum = ac + bc;
        resultLabel.setText("Длина AC: " + ac + ", Длина BC: " + bc + ", Сумма: " + sum);
    };
}



