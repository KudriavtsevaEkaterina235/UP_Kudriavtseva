package ru.kudriavtseva.task3_kudriavtseva2401;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class listController {

    @FXML
    private Button cButton;

    @FXML
    private TextField cTF;

    @FXML
    private Button resultButton;

    @FXML
    private Label resultLabel;

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void resButtonOnAction(ActionEvent event) {
        double Kg = Double.parseDouble(cTF.getText());
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            result.append("Стоимость ").append(i).append(" кг: ").append(Kg * i).append(" \n");
        }
        resultLabel.setText(result.toString());
    }
}


