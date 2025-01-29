package ru.kurskaya.kurskaya4task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task3 {

    @FXML
    private TextField nField;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField vField;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(nField.getText());
        double value = Double.parseDouble(vField.getText());
        double a, c, h, S;
        switch (number) {
            case 1:
                a = value;
                c = a * Math.sqrt(2);
                h = c / 2;
                S = (c * h) / 2;
                break;
            case 2:
                c = value;
                a = c / Math.sqrt(2);
                h = c / 2;
                S = (c * h) / 2;
                break;
            case 3:
                h = value;
                c = h * 2;
                a = c / Math.sqrt(2);
                S = (c * h) / 2;
                break;
            case 4:
                S = value;
                c = Math.sqrt(2 * S);
                h = c / 2;
                a = c / Math.sqrt(2);
                break;
            default:
                resultLabel.setText("Некорректный номер элемента!");
                return;
        }
        resultLabel.setText("a: " + a + ", c: " + c + ", h: " + h + ", S: " + S);
    }
}
