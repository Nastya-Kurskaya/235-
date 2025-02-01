package ru.kurskaya.kurskayamarathonskills.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import static ru.kurskaya.kurskayamarathonskills.util.Manager.*;

public class SeventhController {

    @FXML
    private Button backButton;

    @FXML
    private ComboBox<String> blagoBox;

    @FXML
    private Button cancelButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button payButton;

    @FXML
    private Button plusButton;

    @FXML
    private ComboBox<String> runnrBox;

    @FXML
    private TextField summaField;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml", "Marathon Skills 2016");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml", "Marathon Skills 2016");
    }

    private void showMainStage(String s, String s1) {
    }

    @FXML
    void minusButtonOnAction(ActionEvent event) {
        updateAmount(-10);
    }

    @FXML
    void payButtonOnAction(ActionEvent event) {
        showEighthScene("Eighth.fxml","Marathon Skills 2016 - sponsor");
    }

    @FXML
    void plusButtonOnAction(ActionEvent event) {
        updateAmount(10);
    }

    private void updateAmount(int delta) {
        try {
            int currentAmount = Integer.parseInt(summaField.getText());
            currentAmount += delta;
            if (currentAmount < 10) {
                currentAmount = 10;
            }
            summaField.setText(String.valueOf(currentAmount));
        } catch (NumberFormatException e) {
            summaField.setText("10");
        }
    }
    @FXML
   public void initialize() {
        runnrBox.getItems().addAll("Артемий Камнев 201", "Максим Конаков 202", "Кудрявцева Екатерина 203", "Курская Анастасия204", "Ларионова Ангелина 205", "Магин Илья 206", "Нефедова Виктория 207", "Нигаматуллин Линар 208","Никитин Владислав 209");
        blagoBox.getItems().addAll("фонд кошек", "фонд собак", "фонд помощи людям", "фонд Синяя птица", "фонд Оранжевое солнце");
    }
}
