package ru.kurskaya.kurskayamarathonskills.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import static ru.kurskaya.kurskayamarathonskills.util.Manager.showMainStage;
import static ru.kurskaya.kurskayamarathonskills.util.Manager.showSeventhScene;

public class  EighthController {

    @FXML
    private Button bButton;

    @FXML
    private Button backButton;

    @FXML
    private Label countryLabel;

    @FXML
    private Label fondLabel;

    @FXML
    private Label imyaLabel;

    @FXML
    private Button logoutButton;

    @FXML
    private Label summaLabel;

    @FXML
    void bButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml","Marathon Skills 2016");
    }

    private void showMainStage(String s, String s1) {
    }

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showSeventhScene("seventh.fxml","Marathon Skills 2016 - sponsor");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml", "Marathon Skills 2016");
    }

}
