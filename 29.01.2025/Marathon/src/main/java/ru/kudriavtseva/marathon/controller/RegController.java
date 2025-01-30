package ru.kudriavtseva.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import static ru.kudriavtseva.marathon.util.General.*;

public class RegController {

    @FXML
    private Button BackBTN;

    @FXML
    private Button CancelButton;

    @FXML
    private TextField EmailTextField;

    @FXML
    private TextField LastNameTextField;

    @FXML
    private Button LogoutBTN;

    @FXML
    private TextField NameTextField;

    @FXML
    private TextField PasswoedTextField;

    @FXML
    private TextField PasswoedTextField1;

    @FXML
    private ComboBox<?> Pol;

    @FXML
    private Button registerButton;

    @FXML
    void BackBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage, "menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void ChenelOnAction(ActionEvent event) {
        showregberScene("RegBeg-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void LogoutBTNOnAction(ActionEvent event) {
        showMenuStage(menuStage, "menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void PolOnAction(ActionEvent event) {
        showMenuStage(menuStage, "menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void RegisterOnAction(ActionEvent event) {
        if (NameTextField.getText().isEmpty() || LastNameTextField.getText().isEmpty() ||
                PasswoedTextField1.getText().isEmpty() || EmailTextField.getText().isEmpty() ||
                PasswoedTextField.getText().isEmpty()) {
            Alert fail =new Alert(Alert.AlertType.INFORMATION);
            fail.setHeaderText("Ошибка");
            fail.setContentText("Пожалуйста, заполните все поля.");
            fail.showAndWait();
        } else {
            showVznosScene("RegMarafon-view.fxml", "Marathon Skills 2016 - Register for as event");
        }
    }


}
