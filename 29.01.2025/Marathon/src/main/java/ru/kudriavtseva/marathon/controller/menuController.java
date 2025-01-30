package ru.kudriavtseva.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import static ru.kudriavtseva.marathon.util.General.*;

public class menuController {

    @FXML
    private Button BackBTN;

    @FXML
    private Button LogoutBTN;

    @FXML
    private Button LoninBTN;

    @FXML
    private Button iNeedBegunBTN;

    @FXML
    private Button iNeedINFOBTN;

    @FXML
    private Button iNeedSPBTN;

    @FXML
    void BackBTNOnAction(ActionEvent event) {

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
    void iNeedBegunBTNOnAction(ActionEvent event) {
        showregberScene("RegBeg-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void iNeedINFOBTNOnAction(ActionEvent event) {
        Alert coming =new Alert(Alert.AlertType.INFORMATION);
        coming.setHeaderText("Coming soon");
        coming.setContentText("Данная функция недоступна, но скоро будет добавлена.");
        coming.show();
    }

    @FXML
    void iNeedSPBTNOnAction(ActionEvent event) {
        Alert coming =new Alert(Alert.AlertType.INFORMATION);
        coming.setHeaderText("Coming soon");
        coming.setContentText("Данная функция недоступна, но скоро будет добавлена.");
        coming.show();
    }

}
