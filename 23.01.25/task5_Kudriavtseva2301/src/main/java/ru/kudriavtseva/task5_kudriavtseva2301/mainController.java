package ru.kudriavtseva.task5_kudriavtseva2301;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label kLabel;

    @FXML
    private TextField nTF;

    @FXML
    private Label sLabel;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTF.getText().toString());
        int k = 0;
        int sum = 0;
        while (sum < n) {
            k++;
            sum = sum + k;
        }
        kLabel.setText(" "+k);
        sLabel.setText(" "+sum);
    }

}
