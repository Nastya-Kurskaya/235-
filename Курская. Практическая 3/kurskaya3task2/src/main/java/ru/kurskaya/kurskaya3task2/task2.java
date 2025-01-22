package ru.kurskaya.kurskaya3task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task2 {

    @FXML
    private TextField firstNumber;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField secondNumber;

    @FXML
    private TextField thirdNumber;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        try {
            int num1 = Integer.parseInt(firstNumber.getText());
            int num2 = Integer.parseInt(secondNumber.getText());
            int num3 = Integer.parseInt(thirdNumber.getText());
            int positiveCount = countPositiveNumbers(num1, num2, num3);
            resultLabel.setText("Количество положительных чисел: " + positiveCount);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Введите корректные целые числа.");
        }
    }

    private int countPositiveNumbers(int num1, int num2, int num3) {
        int count = 0;
        if (num1 > 0) count++;
        if (num2 > 0) count++;
        if (num3 > 0) count++;
        return count;
    }
}





