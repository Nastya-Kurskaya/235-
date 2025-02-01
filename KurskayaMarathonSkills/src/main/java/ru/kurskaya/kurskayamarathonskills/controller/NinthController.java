package ru.kurskaya.kurskayamarathonskills.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.kurskaya.kurskayamarathonskills.util.Manager.*;

public class NinthController {

    @FXML
    private Button backButton;

    @FXML
    private Button logoutButton;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showTenScene("ten.fxml","Marathon Skills 2016 - menu");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml", "Marathon Skills 2016");
    }

    private void showMainStage(String s, String s1) {
    }

}
