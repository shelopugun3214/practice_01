package ru.shelopugin.task1;

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
        int n = Integer.parseInt(nTextField.getText());
        switch (n){
        case 1:resLabel.setText("Понедельник");
        break;
            case 2:resLabel.setText("Вторник");
                break;
            case 3:resLabel.setText("Среда");
                break;
            case 4:resLabel.setText("Четверг");
                break;
            case 5:resLabel.setText("Пятница");
                break;
            case 6:resLabel.setText("Суббота");
                break;
            case 7:resLabel.setText("Воскресенье");
                break;
            default:resLabel.setText("Ошибка");
        }
    }
}






