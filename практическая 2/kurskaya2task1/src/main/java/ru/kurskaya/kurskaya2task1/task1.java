package ru.kurskaya.kurskaya2task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task1 {

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        int A = Integer.parseInt(aField.getText());
        int B = Integer.parseInt(bField.getText());
        if (A > B) {
            int count = A / B;
            resultLabel.setText("Количество отрезков B: " + count);
        } else {
            resultLabel.setText("A должно быть больше B!");
        }
    }
}
