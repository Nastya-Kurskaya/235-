package ru.kurskaya.kurskaya3task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task5 {

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonONAction(ActionEvent event) {
        int a = Integer.parseInt(aField.getText());
        int b = Integer.parseInt(bField.getText());
        int c = Integer.parseInt(cField.getText());
        double M = (a + Math.pow(b, 2)) / c;
        int k = (int) (M % 3);
        double y;
        if (k == 1) {
            y = Math.exp(M) + c;
        } else if (k == 0) {
            y = Math.log(a / (double) b);
        } else {
            y = Math.sqrt(Math.abs(Math.pow((a + b), 2) + c));
        }

        resultLabel.setText("Value of y: " + y);
    }
}



