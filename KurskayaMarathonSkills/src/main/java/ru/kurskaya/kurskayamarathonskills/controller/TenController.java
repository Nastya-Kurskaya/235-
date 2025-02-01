package ru.kurskaya.kurskayamarathonskills.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import static ru.kurskaya.kurskayamarathonskills.util.Manager.showMainStage;
import static ru.kurskaya.kurskayamarathonskills.util.Manager.showThirdScene;

public class TenController {

    @FXML
    private Button backButton;

    @FXML
    private Button contactButton;

    @FXML
    private Button logoutButton;

    @FXML
    void backButtonOnAction(ActionEvent event) {
        showThirdScene("third.fxml","Marathon Skills 2016 - login");
    }

    @FXML
    void contactButtonOnAction(ActionEvent event) {
        showContactsInfo();
    }

    private void showContactsInfo() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Контакты");
        alert.setHeaderText(null);
        alert.setContentText("Для получения дополнительной информации, пожалуйста, свяжитесь с координаторами:"
                + "Телефон: +55 11 9988 7766"
                + "Email: coordinators@marathonskills.org");
        alert.showAndWait();
    }

    @FXML
    void logoutButtonOnAction(ActionEvent event) {
        showMainStage("hello-view.fxml", "Marathon Skills 2016");
    }

    private void showMainStage(String s, String s1) {
    }
}
