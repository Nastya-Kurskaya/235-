package ru.kurskaya.kurskaya3task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task1 {

    @FXML
    private Button Button;

    @FXML
    private Label numberLabel;

    @FXML
    private TextField numberTextField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        String input = numberTextField.getText();
        if (input.length() == 2) {
            int firstDigit = Character.getNumericValue(input.charAt(0));
            int secondDigit = Character.getNumericValue(input.charAt(1));

            if (firstDigit > secondDigit) {
                resultLabel.setText("Первая цифра больше: " + firstDigit);
            } else if (secondDigit > firstDigit) {
                resultLabel.setText("Вторая цифра больше: " + secondDigit);
            } else {
                resultLabel.setText("Цифры равны: " + firstDigit);
            }
        } else {
            resultLabel.setText("Введите двузначное число.");
        }
    }
}
