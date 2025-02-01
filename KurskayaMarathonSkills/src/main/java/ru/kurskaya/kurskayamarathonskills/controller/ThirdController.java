package ru.kurskaya.kurskayamarathonskills.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import static ru.kurskaya.kurskayamarathonskills.util.Manager.*;

public class ThirdController {

    @FXML
    private Button backButton;

    @FXML
    private Button cancelButton;

    @FXML
    private TextField emailField;

    @FXML
    private Button logiButton;

    @FXML
    private Button logoutButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showSecondScene("second.fxml","Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        showSecondScene("second.fxml","Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void logiButtonOnAction(ActionEvent event) {
        showTenScene("ten.fxml","Marathon Skills 2016 - Menu");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml","Marathon Skills 2016");
    }

    private void showMainStage(String s, String s1) {

    }

}
