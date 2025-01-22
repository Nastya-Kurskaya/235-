package ru.kurskaya.kurskaya3task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task3 {

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
        double A = Double.parseDouble(aField.getText());
        double B = Double.parseDouble(bField.getText());
        double C = Double.parseDouble(cField.getText());
        if (A <= B && B <= C) {
            A *= 2;
            B *= 2;
            C *= 2;
        } else {
            A = -A;
            B = -B;
            C = -C;
        }
        resultLabel.setText("Новые значения: A=" + A + ", B=" + B + ", C=" + C);
    }
}



