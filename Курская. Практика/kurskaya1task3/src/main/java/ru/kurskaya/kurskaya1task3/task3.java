package ru.kurskaya.kurskaya1task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task3 {

    @FXML
    private Label resultLabel;

    @FXML
    private TextField sField;

    @FXML
    private TextField tField;

    @FXML
    private TextField v1Field;

    @FXML
    private TextField v2Field;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        double v1 = Double.parseDouble(v1Field.getText());
        double v2 = Double.parseDouble(v2Field.getText());
        double s = Double.parseDouble(sField.getText());
        double t = Double.parseDouble(tField.getText());
        double totalDistance = s + t * (v1 + v2);
        resultLabel.setText("Расстояние через T часов: " + totalDistance + " км");
    }
}


