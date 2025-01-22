package ru.kudriavtseva.task1_kudriavtseva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField aTF;

    @FXML
    private TextField bTF;

    @FXML
    private Label pLable;

    @FXML
    private Label sLable;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(aTF.getText().toString());
        double b = Double.parseDouble(bTF.getText().toString());
        double Area = a * b;
        double Perimeter = 2 * (a + b);
        sLable.setText("" + Area);
        pLable.setText("" + Perimeter);

    }

}
