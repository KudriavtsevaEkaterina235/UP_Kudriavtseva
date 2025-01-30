package ru.kudriavtseva.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.kudriavtseva.marathon.util.General.*;

public class EndRegController {

    @FXML
    private Button LogoutButton;

    @FXML
    private Button backButton;

    @FXML
    private Button thxOkButton;

    @FXML
    void BackOnAction(ActionEvent event) {
        showMenuStage(menuStage, "menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showMenuStage(menuStage, "menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void thxOkOnAction(ActionEvent event) {
        showRunMenuScene("RunnerMenu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

}
