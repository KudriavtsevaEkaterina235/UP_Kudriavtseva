package ru.kudriavtseva.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import static ru.kudriavtseva.marathon.util.General.*;

public class LoginController {

    @FXML
    private Button BackBTN;

    @FXML
    private Button CancelBTN;

    @FXML
    private TextField EmailTextField;

    @FXML
    private Button LogoutBTN;

    @FXML
    private Button LoninBTN;

    @FXML
    private TextField PasswordTextField;

    @FXML
    void BackBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void CancelBTNOnAction(ActionEvent event) {
        showregberScene("RegBeg-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LoginBTNOnAction(ActionEvent event) {
        showRunMenuScene("RunnerMenu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LogoutBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

}
