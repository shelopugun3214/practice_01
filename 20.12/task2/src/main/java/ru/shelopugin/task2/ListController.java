package ru.shelopugin.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class ListController {

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void OkButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int max = 0;
        boolean foundZero = false;
        for (int number : data) {
            if (number == 0) {
                foundZero = true;
                break;
            }
            if (number % 6 == 0 && number % 10 == 4) {
                max += number;
            }
        }
        if (max != 0)
            answerLabel.setText(String.valueOf(max));
        else answerLabel.setText("Сумма чисел, кратных 6 и оканчивающихся на 4:" + max);
    }


    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());
            dataListView.getItems().add(x);
            numberTextField.clear();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Пожалуйста, введите целое число");
            alert.show();
        }
    }


    @FXML
    void cancelButtonOnAction(ActionEvent event) {
            dataListView.getItems().clear();
            answerLabel.setText("");
        }
    }





