package ru.kudriavtseva.task4_kudriavtseva2201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label rLable;

    @FXML
    private TextField xTF;

    @FXML
    void sumButtononAction(ActionEvent event) {
        double x = Double.parseDouble(xTF.getText().toString());
        double y;
        if (x > -Math.PI / 2 && x < Math.PI / 2) {
            y = Math.sqrt(Math.abs(Math.sin(x) + Math.pow(Math.tan(2 * x), 2) / (3.5 * Math.cos(x))));
        } else if (x > Math.PI / 2 && x < Math.PI) {
            y = Math.cos(x / 3) / Math.sin(x) + Math.pow(Math.tan(2 * x), 2);
        } else {
            rLable.setText("Введите x в допустимом диапазоне.");
            return;
        }
        rLable.setText("y=" + y);
    }

}
