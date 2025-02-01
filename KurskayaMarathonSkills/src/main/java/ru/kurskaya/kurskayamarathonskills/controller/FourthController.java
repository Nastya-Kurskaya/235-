package ru.kurskaya.kurskayamarathonskills.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import static ru.kurskaya.kurskayamarathonskills.util.Manager.*;

public class FourthController {

    @FXML
    private Button backButton;

    @FXML
    private Button cancelButton;

    @FXML
    private ComboBox<String> countryBox;

    @FXML
    private Button logoutButton;

    @FXML
    private ComboBox<String> polBox;

    @FXML
    private Button regButton;

    @FXML
    private Button vhodButton;

    @FXML
    private Button viewButton;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showSecondScene("second.fxml","Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        showSecondScene("second.fxml","Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml","Marathon Skills 2016");
    }

    private void showMainStage(String s, String s1) {

    }

    @FXML
    void regButtonOnAction(ActionEvent event) {
        showFifthScene("fifth.fxml","Marathon Skills 2016 - Registration");
    }

    @FXML
    void vhodButtonOnAction(ActionEvent event) {
        showThirdScene("third.fxml","Marathon Skills 2016 - login");
    }

    @FXML
    void viewButtonOnAction(ActionEvent event) {

    }
    public void initialize() {
        polBox.getItems().addAll("мужской", "женский");
        countryBox.getItems().addAll("Russia", "Ukraine", "Belarus", "Kazakhstan", "America", "Spain", "Japan");
    }
}
