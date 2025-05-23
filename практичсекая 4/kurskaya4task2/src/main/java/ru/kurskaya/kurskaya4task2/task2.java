package ru.kurskaya.kurskaya4task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class task2 {

    @FXML
    private TextField aField;

    @FXML
    private Label resultLabel;

    @FXML
    void ButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(aField.getText());
        String description;
        switch (a) {
            case 20:
                description = "двадцать лет";
                break;
            case 21:
                description = "двадцать один год";
                break;
            case 22:
                description = "двадцать два года";
                break;
            case 23:
                description = "двадцать три года";
                break;
            case 24:
                description = "двадцать четыре года";
                break;
            case 25:
                description = "двадцать пять лет";
                break;
            case 26:
                description = "двадцать шесть лет";
                break;
            case 27:
                description = "двадцать семь лет";
                break;
            case 28:
                description = "двадцать восемь лет";
                break;
            case 29:
                description = "двадцать девять лет";
                break;
            case 30:
                description = "тридцать лет";
                break;
            case 31:
                description = "тридцать один год";
                break;
            case 32:
                description = "тридцать два года";
                break;
            case 33:
                description = "тридцать три года";
                break;
            case 34:
                description = "тридцать четыре года";
                break;
            case 35:
                description = "тридцать пять лет";
                break;
            case 36:
                description = "тридцать шесть лет";
                break;
            case 37:
                description = "тридцать семь лет";
                break;
            case 38:
                description = "тридцать восемь лет";
                break;
            case 39:
                description = "тридцать девять лет";
                break;
            case 40:
                description = "сорок лет";
                break;
            case 41:
                description = "сорок один год";
                break;
            case 42:
                description = "сорок два года";
                break;
            case 43:
                description = "сорок три года";
                break;
            case 44:
                description = "сорок четыре года";
                break;
            case 45:
                description = "сорок пять лет";
                break;
            case 46:
                description = "сорок шесть лет";
                break;
            case 47:
                description = "сорок семь лет";
                break;
            case 48:
                description = "сорок восемь лет";
                break;
            case 49:
                description = "сорок девять лет";
                break;
            case 50:
                description = "пятьдесят лет";
                break;
            case 51:
                description = "пятьдесят один год";
                break;
            case 52:
                description = "пятьдесят два года";
                break;
            case 53:
                description = "пятьдесят три года";
                break;
            case 54:
                description = "пятьдесят четыре года";
                break;
            case 55:
                description = "пятьдесят пять лет";
                break;
            case 56:
                description = "пятьдесят шесть лет";
                break;
            case 57:
                description = "пятьдесят семь лет";
                break;
            case 58:
                description = "пятьдесят восемь лет";
                break;
            case 59:
                description = "пятьдесят девять лет";
                break;
            case 60:
                description = "шестьдесят лет";
                break;
            case 61:
                description = "шестьдесят один год";
                break;
            case 62:
                description = "шестьдесят два года";
                break;
            case 63:
                description = "шестьдесят три года";
                break;
            case 64:
                description = "шестьдесят четыре года";
                break;
            case 65:
                description = "шестьдесят пять лет";
                break;
            case 66:
                description = "шестьдесят шесть лет";
                break;
            case 67:
                description = "шестьдесят семь лет";
                break;
            case 68:
                description = "шестьдесят восемь лет";
                break;
            case 69:
                description = "шестьдесят девять лет";
                break;
            default:
                description = "Некорректный возраст!";
                break;
        }
        resultLabel.setText(description);
    };
}
