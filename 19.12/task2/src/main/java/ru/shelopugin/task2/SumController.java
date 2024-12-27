package ru.shelopugin.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField mTextField;

    @FXML
    private TextField nTextField;

    @FXML
    private Label repLabel;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int m = Integer.parseInt(mTextField.getText());
        switch (m) {
            case 1:
                repLabel.setText("Пик");
                break;
            case 2:
                repLabel.setText("Треф");
                break;
            case 3:
                repLabel.setText("Бубны");
                break;
            case 4:
                repLabel.setText("Черви");
        }
        int n = Integer.parseInt(nTextField.getText());
        switch (n) {
            case 6:
                resLabel.setText("Шестерка");
                break;
            case 7:
                resLabel.setText("Семерка");
                break;
            case 8:
                resLabel.setText("Восьмерка");
                break;
            case 9:
                resLabel.setText("Девятка");
            case 10:
                resLabel.setText("Десятка");
                break;
            case 11:
                resLabel.setText("Валет");
                break;
            case 12:
                resLabel.setText("Дама");
                break;
            case 13:
                resLabel.setText("Король");
                break;
            case 14:
                resLabel.setText("Туз");
        }
    }
}


