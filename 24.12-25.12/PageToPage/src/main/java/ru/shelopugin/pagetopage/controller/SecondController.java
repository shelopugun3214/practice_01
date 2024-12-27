package ru.shelopugin.pagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.shelopugin.pagetopage.util.Manager.showSecondScene;

public class SecondController {

    @FXML
    private Button goButton;

    @FXML
    void goButtonOnAction(ActionEvent event) {
        showSecondScene ("hello-view.fxml", "Marathon Skills 2016 ");
    }

}
