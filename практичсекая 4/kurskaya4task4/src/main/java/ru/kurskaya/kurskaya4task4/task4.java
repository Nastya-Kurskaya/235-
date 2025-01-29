package ru.kurskaya.kurskaya4task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task4 {

    @FXML
    private TextField nField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nField.getText());
        boolean isPowerOfThree = false;
        int power = 1;
        while (power < N) {
            power *= 3;
        }
        if (power == N) {
            isPowerOfThree = true;
        }
        resultLabel.setText(String.valueOf(isPowerOfThree));
    }
}
