package ru.kurskaya.kurskaya5task2;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class task2 {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberField;

    @FXML
    void addButtonOnAction(ActionEvent event) {
        try {
            int correctAnswers = Integer.parseInt(numberField.getText().trim());
            if (correctAnswers >= 0 && correctAnswers <= 10) {
                dataListView.getItems().add(correctAnswers);
                numberField.clear();
            } else {
                answerLabel.setText("Введите число от 0 до 10.");
            }
        } catch (NumberFormatException e) {
            answerLabel.setText("Введите корректное число.");
        }
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void okButtonOnAction(ActionEvent event) {
        int unsatisfactoryCount = 0;
        boolean allSolved = false;
        for (Integer answers : dataListView.getItems()) {
            if (answers < 5) {
                unsatisfactoryCount++;
            }
            if (answers == 10) {
                allSolved = true;
            }
        }
        String result = unsatisfactoryCount + ", " + (allSolved ? "YES" : "NO");
        answerLabel.setText(result);
    }
}
