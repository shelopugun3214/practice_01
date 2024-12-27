package ru.shelopugin.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SamController {

    @FXML
    private Label ATextField;

    @FXML
    private TextField aTextField;

    @FXML
    private Label res;

    @FXML
    private Button resButton;

    @FXML
    void resButtonOnAction(ActionEvent event) {
   float a=Float.parseFloat(aTextField.getText().toString());
   res.setText("V=" + (Math.pow(a, 3))+"S="+(6*Math.pow(a, 2)));
    }

}
