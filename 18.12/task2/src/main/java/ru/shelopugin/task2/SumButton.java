package ru.shelopugin.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumButton {

    @FXML
    private TextField n1TextField;

    @FXML
    private TextField n2TextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        try {
            int n1 = Integer.parseInt(n1TextField.getText());
            int n2 = Integer.parseInt(n2TextField.getText());

            int result;
            if (n1 < n2) {
                result = 1;
            } else if (n2 < n1) {
                result = 2;
            } else {
                result = 0;
            }

            if (result == 0) {
                resLabel.setText("Числа равны");
            } else {
                resLabel.setText("Порядковый номер меньшего числа: " + result);
            }

        } catch (NumberFormatException e) {
            resLabel.setText("Пожалуйста, введите целые числа.");
        }
    }
}


