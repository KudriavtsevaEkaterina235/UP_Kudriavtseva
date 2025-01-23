package ru.kudriavtseva.task3_kudriavtseva2301;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label aLabel;

    @FXML
    private TextField nTF;

    @FXML
    private Label r1Label;

    @FXML
    private Label r2Label;

    @FXML
    private Label sLabel;

    @FXML
    private TextField zTF;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTF.getText().toString());
        double z = Double.parseDouble(zTF.getText().toString());
        double a, R1, R2, S;
        switch (n) {
            case 1: a = z; break;
            case 2: R1 = z; a = (4 * R1) / Math.sqrt(3); break;
            case 3: R2 = z; R1 = R2 / 2; a = (4 * R1) / Math.sqrt(3); break;
            case 4: S = z; a = Math.sqrt((4 * S) / Math.sqrt(3)); break;
            default: return;
        }
        R1 = a * Math.sqrt(3) / 4;
        R2 = 2 * R1;
        S = (a * a * Math.sqrt(3)) / 4;
        aLabel.setText(String.format("a: %.2f", a));
        r1Label.setText(String.format("R1: %.2f", R1));
        r2Label.setText(String.format("R2: %.2f", R2));
        sLabel.setText(String.format("S: %.2f", S));
    }

}
