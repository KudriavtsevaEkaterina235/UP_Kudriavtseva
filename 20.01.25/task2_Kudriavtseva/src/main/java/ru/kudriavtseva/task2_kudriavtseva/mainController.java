package ru.kudriavtseva.task2_kudriavtseva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label rLable;

    @FXML
    private TextField x1TF;

    @FXML
    private TextField x2TF;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double X1 = Double.parseDouble(x1TF.getText().toString());
        double X2 = Double.parseDouble(x2TF.getText().toString());
        double Distance = Math.abs(X2 - X1);
        rLable.setText("" + Distance);
    }

}
