package ru.kudriavtseva.task6_kudriavtseva2401;

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
    private TextField kTF;

    @FXML
    private TextField nTF;

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
        int k = Integer.parseInt(kTF.getText());
        int n = Integer.parseInt(nTF.getText());
        double r = 0;
        for (int i = 1; i <= n; i++) {
            r = r + Math.pow(i, k);
        }
        resultLabel.setText(String.valueOf(r));
    }

}
