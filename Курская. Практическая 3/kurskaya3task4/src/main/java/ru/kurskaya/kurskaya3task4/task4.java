package ru.kurskaya.kurskaya3task4;

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
            if (x >= -15 && x <= 0 && y >= -15 && y <= 0) {
                if (x == -15 || x == 0 || y == -15 || y == 0) {
                    resultLabel.setText("На границе");
                } else {
                    resultLabel.setText("Да");
                }
            } else {
                resultLabel.setText("Нет");
            }
        }
    }



