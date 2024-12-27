package ru.shelopugin.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField n1TextField;

    @FXML
    private TextField n2TextField;

    @FXML
    private TextField n3TextField;

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int n1 = Integer.parseInt(n1TextField.getText());
        int n2 = Integer.parseInt(n2TextField.getText());
        int n3 = Integer.parseInt(n3TextField.getText());
        if(n1 > n2 && n1 < n3)
        { resLabel.setText("Среднее число: " + n1);
        }
        else if(n2 > n1 && n2 < n3)
        {resLabel.setText("Среднее число: " + n2);
        }
        else resLabel.setText("Среднее число: " + n3);


    }

}
