package ru.shelopugin.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        try {
            int a = Integer.parseInt(aTextField.getText());
            int b = Integer.parseInt(bTextField.getText());

            if (a >= b) {
                resLabel.setText("A должно быть меньше B.");
                return;
            }

            long sum = 0;
            for (int i = a; i <= b; i++) {
                sum += (long) i * i;
            }

            resLabel.setText("Сумма квадратов: " + sum);
        } catch (NumberFormatException e) {
            resLabel.setText("Пожалуйста, введите целые числа.");
        }
    }
}
