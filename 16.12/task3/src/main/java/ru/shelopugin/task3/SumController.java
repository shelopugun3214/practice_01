package ru.shelopugin.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SumController {

    @FXML
    private Button resButton;

    @FXML
    private Label resLabel;

    @FXML
    private TextField t1TextFielder;

    @FXML
    private TextField t2TextFielder;

    @FXML
    private TextField uTextFielder;

    @FXML
    private TextField vTextFielder;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        float v = Float.parseFloat(vTextFielder.getText());
        float u = Float.parseFloat(uTextFielder.getText());
        float t1 = Float.parseFloat(t1TextFielder.getText());
        float t2 = Float.parseFloat(t2TextFielder.getText());

        // Расчет пути
        float S = t1 * v + t2 * (v - u);
    }

}
