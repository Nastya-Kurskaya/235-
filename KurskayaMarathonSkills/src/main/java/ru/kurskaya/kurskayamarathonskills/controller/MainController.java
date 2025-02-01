package ru.kurskaya.kurskayamarathonskills.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.kurskaya.kurskayamarathonskills.util.Manager.*;

public class MainController {

    @FXML
    private Button backButton;

    @FXML
    private Button eventButton;

    @FXML
    private Button loginButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button runnerButton;

    @FXML
    private Button sponsorButton;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void eventButtonOnAction(ActionEvent event) {
    }

    @FXML
    void loginButtonOnAction(ActionEvent event) {
        showThirdScene("third.fxml","Marathon Skills 2016 - login");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void runnerButtonOnAction(ActionEvent event) {
        showSecondScene("second.fxml","Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void sponsorButtonOnAction(ActionEvent event) {
        showSeventhScene("seventh.fxml","Marathon Skills 2016 - sponsor");
    }

}
