package ru.kudriavtseva.task6_kudriavtseva2301;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField nTF;

    @FXML
    private Label rLabel;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int N = Integer.parseInt(nTF.getText().toString());
        int num = 0;
        while (N > 0) {
            int d = N % 10;
            num = num * 10 + d;
        }
        rLabel.setText(" " + num);
    }

}
