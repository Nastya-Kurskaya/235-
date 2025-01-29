package ru.kurskaya.kurskaya4task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task1 {

    @FXML
    private TextField mField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        int month = Integer.parseInt(mField.getText());
        int days;
        switch (month) {
            case 1: // январь
            case 3: // март
            case 5: // май
            case 7: // июль
            case 8: // август
            case 10: // октябрь
            case 12: // декабрь
                days = 31;
                break;
            case 2: // февраль
                days = 28;
                break;
            case 4: // апрель
            case 6: // июнь
            case 9: // сентябрь
            case 11: // ноябрь
                days = 30;
                break;
            default:
                days = 0;
                break;
        }
        String result = (days > 0) ? "Количество дней: " + days : "Некорректный месяц!";
        resultLabel.setText(result);
    }
}


