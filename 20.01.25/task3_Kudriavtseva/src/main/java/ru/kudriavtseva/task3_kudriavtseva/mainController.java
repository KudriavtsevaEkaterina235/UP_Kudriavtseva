package ru.kudriavtseva.task3_kudriavtseva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label rLable;

    @FXML
    private TextField sTF;

    @FXML
    private TextField tTF;

    @FXML
    private TextField v1TF;

    @FXML
    private TextField v2TF;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double V1 = Double.parseDouble(v1TF.getText().toString());
        double V2 = Double.parseDouble(v2TF.getText().toString());
        double S = Double.parseDouble(sTF.getText().toString());
        double T = Double.parseDouble(tTF.getText().toString());
        double tDistance = T * (V1 + V2);
        double fDistance = Math.abs(S - tDistance);
        rLable.setText("" + fDistance);
    }

}
