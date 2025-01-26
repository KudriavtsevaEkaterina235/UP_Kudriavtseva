package ru.kudriavtseva.task7_kudriavtseva2401;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class listController {

    @FXML
    private TextField ETF;

    @FXML
    private Button cButton;

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
        int E = Integer.parseInt(ETF.getText());
        double a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        for (int i = 1; i <= E; i++) {
            a = a + 1.0 / Math.pow(i, 8);
            b = b + 1.0 / (i * (i + 1));
            d = d + Math.pow(-1, i + 1) / (i * (i + 1) * (i + 2));
        }
        for (int i = 0; i <= E; i++) {
            int t = 1;
            for (int j = 1; j <= i; j++) {
                t = t * j;
            }
            c = c + Math.pow(-1, i) / t;
            e = e + Math.pow(-2, i) / t;
            f = f + (1 / (Math.pow(4, i) + Math.pow(5, i)));
        }
        resultLabel.setText("a - " + a + "\tб - " + b + "\nв - " + c + "\tг - " + d + "\nд - " + e + "\te - " + f);
    }

}
