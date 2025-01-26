package ru.kudriavtseva.task5_kudriavtseva2401;

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
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTF.getText().toString());
        double[] a = new double[n + 1];
        a[0] = 1;
        for (int k = 1; k <= n; k++) {
            a[k] = k * a[k - 1] + 1.0 / k;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            result.append("a").append(i).append(" = ").append(a[i]).append("\n");
        }
        resultLabel.setText(result.toString());
    }

}
