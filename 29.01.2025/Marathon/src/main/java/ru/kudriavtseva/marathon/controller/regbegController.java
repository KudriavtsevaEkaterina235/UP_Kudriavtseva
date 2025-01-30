package ru.kudriavtseva.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import static ru.kudriavtseva.marathon.util.General.*;

public class regbegController {

    @FXML
    private Button BackBTN;

    @FXML
    private Button LogoutBTN;

    @FXML
    private Button LoninBTN;

    @FXML
    private Button iNewBegunBTN;

    @FXML
    private Button iamBegunBTN;

    @FXML
    void BackBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LoginBTNOnAction(ActionEvent event) {
        showloginScene("Login-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LogoutBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void iNewBegunBTNOnAction(ActionEvent event) {
        showRegScene("Registr-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void iamBegunBTNOnAction(ActionEvent event) {
        showloginScene("Login-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

}
