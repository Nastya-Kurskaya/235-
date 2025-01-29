package ru.kurskaya.kurskaya4task6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task6 {

    @FXML
    private TextField nField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nField.getText());
        boolean T = false;
        while (N > 0) {
            if (N % 10 == 2) {
                T = true;
                break;
            }
            N /= 10;
        }
        resultLabel.setText(Boolean.toString(T));
    }
}
