package ru.kurskaya.kurskaya4task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task5 {

    @FXML
    private TextField pField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        double P = Double.parseDouble(pField.getText());
        double D = 10.0;
        double S = 0.0;
        int K = 0;
        while (S <= 200) {
            S += D;
            D += D * (P / 100);
            K++;
        }
        resultLabel.setText("Days: " + K + ", Total Distance: " + S);
    }
}
