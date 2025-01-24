package ru.kurskaya.kurskaya2task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task3 {

    @FXML
    private TextField kField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        int K = Integer.parseInt(kField.getText());
        int M = 6;
        int N = (M + (K - 1)) % 7;
        if (N == 0) {
            N = 7;
        }
        resultLabel.setText("День недели: " + N);
    };
}

