package ru.kurskaya.kurskayamarathonskills.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.kurskaya.kurskayamarathonskills.util.Manager.*;

public class SecondController {

    @FXML
    private Button backButton;

    @FXML
    private Button loginButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button newButton;

    @FXML
    private Button yetButton;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml","Marathon Skills 2016");
    }

    private void showMainStage(String s, String s1) {
    }

    @FXML
    void loginButtonOnAction(ActionEvent event) {
        showThirdScene("third.fxml","Marathon Skills 2016 - login");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml","Marathon Skills 2016");
    }

    @FXML
    void newButtonOnAction(ActionEvent event) {

        showFourthScene("fourth.fxml","Marathon Skills 2016 - registration");
    }

    @FXML
    void yetButtonOnAction(ActionEvent event) {

        showThirdScene("third.fxml","Marathon Skills 2016 - login");
    }
}
