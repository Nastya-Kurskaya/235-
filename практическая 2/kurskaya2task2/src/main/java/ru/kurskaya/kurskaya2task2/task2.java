package ru.kurskaya.kurskaya2task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task2 {

    @FXML
    private TextField nField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nField.getText());
        if (N >= 0) {
            int M = 3600;
            int T = N % M;
            resultLabel.setText("Секунд с начала последнего часа: " + T);
        } else {
            resultLabel.setText("Введите неотрицательное число!");
        }
    }
}
