package ru.shelopugin.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField nTextField;

    @FXML
    private TextField rTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int r = Integer.parseInt(rTextField.getText());
        int n = Integer.parseInt(nTextField.getText());
        switch (n) {
            case 1:
                resLabel.setText("R=" + r);
                break;
            case 2:
                resLabel.setText("D=" + 2 * r);
                break;
            case 3:
                resLabel.setText("L=" + 2 * Math.PI * r);
                break;
            case 4:
                resLabel.setText("S=" + Math.PI * r);
                break;
            default:
                resLabel.setText("Ошибка!");
        }
    }
}


