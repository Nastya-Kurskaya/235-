package ru.kurskaya.kurskaya5task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task5 {

    @FXML
    private TextField nField;

    @FXML
    private Label resultLabel;

    public static double calculateVn(int n) {
        double v1 = 0;
        double v2 = 0;
        double v3 = 1.5;
        double vn = 0;
        for (int i = 4; i <= n; i++) {
            vn = ((double) (i + 1) / (i * i + 1)) * v3 - v2 - v1;
            v1 = v2;
            v2 = v3;
            v3 = vn;
        }
        return vn;
    }
    @FXML
    void ButtonOnAction(ActionEvent event) {
        try {
            int n = Integer.parseInt(nField.getText());
            double vn = calculateVn(n);
            resultLabel.setText("v" + n + " = " + vn);
        } catch (NumberFormatException e) {
            resultLabel.setText("Введите корректное число.");
        }
    }
}

