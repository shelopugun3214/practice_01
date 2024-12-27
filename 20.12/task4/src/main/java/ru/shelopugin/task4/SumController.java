package ru.shelopugin.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField nTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        try {
            int n = Integer.parseInt(nTextField.getText());

                if (n <= 0) {
                    resLabel.setText("N должно быть больше 0.");
                    return;
                }

                double sum = 0;
                double factorial = 1;
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
                    sum += factorial;
                }

                resLabel.setText("Сумма факториалов: " + sum);

            } catch (NumberFormatException e) {
                resLabel.setText("Пожалуйста, введите целое число.");
        }
    }
}



