package ru.shelopugin.task33;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private TextField kTextField;

    @FXML
    private Button resButton;

    @FXML
    private Label reslabel;

    @FXML
    void SumButtonOnAction(ActionEvent event) {
        int K=Integer.parseInt(kTextField.getText().toString());
        int N=(K+2)%7;
        reslabel.setText("день недели:"+N);


    }


}


