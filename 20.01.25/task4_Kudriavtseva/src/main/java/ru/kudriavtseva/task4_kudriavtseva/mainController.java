package ru.kudriavtseva.task4_kudriavtseva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField gTF;

    @FXML
    private TextField xTF;

    @FXML
    private Label yLable;

    @FXML
    private Label zLable;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double x = Double.parseDouble(xTF.getText().toString());
        double g = Double.parseDouble(gTF.getText().toString());
        double y = x + Math.sqrt(Math.abs(1 - x * x));
        yLable.setText("z = " + y);
        double z = Math.pow(Math.sin(2 * (x + g)), 2) + (Math.cos(x) / (x + Math.pow(y, 2) * Math.log(Math.abs(x - y))));
        zLable.setText("z = " + z);
    }

}
