package ru.kurskaya.kurskaya1task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task4 {

    @FXML
    private Label resultLabel;

    @FXML
    private TextField xField;

    @FXML
    private TextField yField;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        double x = Double.parseDouble(xField.getText());
        double y = Double.parseDouble(yField.getText());
        double a = x + y;
        double b = x * x + y * y;
        double p = Math.pow(a + b, 2) + a * Math.cos(a + b) + (a * Math.sqrt(b)) / (a + b);
        resultLabel.setText("Значение выражения: " + p);
    }
}
