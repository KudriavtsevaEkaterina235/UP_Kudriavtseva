package ru.kudriavtseva.task4_kudriavtseva2401;

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
    private TextField nTF;

    @FXML
    private Button resultButton;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField xTF;

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void resButtonOnAction(ActionEvent event) {
        double X = Double.parseDouble(xTF.getText().toString());
        int N = Integer.parseInt(nTF.getText().toString());
        double result = 0;
        for (int i = 1; i <= N; i++) {
            result += (Math.pow(-1, i - 1) * Math.pow(X, i)) / i;
        }
        resultLabel.setText("ln(1 + " + X + ") ≈ " + result);
    }

}
