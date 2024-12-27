package ru.shelopugin.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.zip.Checksum;

public class SumController {

    @FXML
    private TextField nTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumBattonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTextField.getText());
        if ((n / 10 + n % 10) % 2 != 0)
        {
            resLabel.setText("Сумма цифр нечетная: " + n);
        }else
        {resLabel.setText("Сумма цифр четная: " + n);

        }
    }
}






