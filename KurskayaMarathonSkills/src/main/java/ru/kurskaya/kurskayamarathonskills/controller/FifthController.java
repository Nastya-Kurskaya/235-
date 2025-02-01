package ru.kurskaya.kurskayamarathonskills.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import static ru.kurskaya.kurskayamarathonskills.util.Manager.*;

public class FifthController {

    @FXML
    private Button backButton;

    @FXML
    private Button cancelButton;

    @FXML
    private ComboBox<String> fondBox;

    @FXML
    private Button logoutButton;

    @FXML
    private CheckBox polBox;

    @FXML
    private CheckBox poluBox;

    @FXML
    private Button regButton;

    @FXML
    private TextField sumField;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showFourthScene("fourth.fxml","Marathon Skills 2016 - registration");
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        showFourthScene("fourth.fxml","Marathon Skills 2016 - registration");
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml","Marathon Skills 2016");
    }

    private void showMainStage(String s, String s1) {
    }

    @FXML
    void regButtonOnAction(ActionEvent event) {
        showSixthScene("sixth.fxml","Marathon Skills 2016 - registration");
    }
    public void initialize() {
        fondBox.getItems().addAll("фонд кошек", "фонд собак", "фонд помощи людям", "фонд Синяя птица", "фонд Оранжевое солнце");
    }
}
