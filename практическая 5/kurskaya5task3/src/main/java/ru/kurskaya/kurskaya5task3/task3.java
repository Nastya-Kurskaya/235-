package ru.kurskaya.kurskaya5task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task3 {

    @FXML
    private TextField priceField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        try {
            double priceKg = Double.parseDouble(priceField.getText().trim());
            StringBuilder result = new StringBuilder();
            for (double weight = 0.1; weight <= 1.0; weight += 0.1) {
                double cost = weight * priceKg;
                System.out.printf("Стоимость за %.1f кг: %.2f рублей%n", weight, cost);
            }
            resultLabel.setText(result.toString());
        } catch (NumberFormatException e) {
            resultLabel.setText("Введите корректную цену.");
        }
    }
}
