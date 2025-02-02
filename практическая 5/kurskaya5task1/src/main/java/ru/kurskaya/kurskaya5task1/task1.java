package ru.kurskaya.kurskaya5task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class task1 {

    @FXML
    private Label answerLabel;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberField;

    @FXML
    private Button okButton;
    private List<Integer> numbers = new ArrayList<>();

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        double sum = 0;
        int count = 0;

        for (int num:numbers) {
            if (num >= 10 && num < 100) {
                sum += num;
                count++;
            }
        }

        if (count > 0) {
            double average = sum / count;
            answerLabel.setText(String.format("%.1f", average));
        } else {
            answerLabel.setText("NO");
        }
    }

    @FXML
    void addButtonOnAction(ActionEvent event) {
        try {
            int num = Integer.parseInt(numberField.getText().trim());
            if (num > 0 && num <= 300) {
                if (num == 0) return;
                numbers.add(num);
                dataListView.getItems().add(num);
                numberField.clear();
            }
        } catch (NumberFormatException e) {
            answerLabel.setText("Введите корректное число.");
        }
    }
     @FXML
        void cancelButtonOnAction (ActionEvent event){
            Platform.exit();
        }
}

