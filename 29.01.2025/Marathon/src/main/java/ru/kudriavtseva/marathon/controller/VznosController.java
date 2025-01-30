package ru.kudriavtseva.marathon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import static ru.kudriavtseva.marathon.util.General.*;

public class VznosController {

    @FXML
    private RadioButton ARadiobutton;

    @FXML
    private RadioButton BRadiobutton;

    @FXML
    private RadioButton CRadiobutton;

    @FXML
    private Button ChenelButton;

    @FXML
    private Button LogoutButton;

    @FXML
    private CheckBox MalCheckBox;

    @FXML
    private CheckBox PolCheckBox;

    @FXML
    private Label SummLabel;

    @FXML
    private Button backButton;

    @FXML
    private CheckBox fullCheckBox;

    @FXML
    private Button regVznosButton;

    @FXML
    void AVarOnAction(ActionEvent event) {

    }

    @FXML
    void BVarOnAction(ActionEvent event) {

    }

    @FXML
    void BackOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void CVarOnAction(ActionEvent event) {

    }

    @FXML
    void ChenelOnAction(ActionEvent event) {
        showRunMenuScene("RunnerMenu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void FullOnAction(ActionEvent event) {

    }

    @FXML
    void LogoutOnAction(ActionEvent event) {
        showMenuStage(menuStage,"menu-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

    @FXML
    void MalOnAction(ActionEvent event) {

    }

    @FXML
    void PolOnAction(ActionEvent event) {

    }

    @FXML
    void RegVznosOnAction(ActionEvent event) {
        showEndRegScene("EndReg-view.fxml", "Marathon Skills 2016 - Register as a runner");
    }

}
