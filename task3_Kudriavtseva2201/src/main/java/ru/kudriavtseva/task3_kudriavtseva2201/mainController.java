package ru.kudriavtseva.task3_kudriavtseva2201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label aLable;

    @FXML
    private TextField aTF;

    @FXML
    private Label bLable;

    @FXML
    private TextField bTF;

    @FXML
    private Label cLable;

    @FXML
    private TextField cTF;

    @FXML
    void sumButtononAction(ActionEvent event) {
        double a = Double.parseDouble(aTF.getText());
        double b = Double.parseDouble(bTF.getText());
        double c = Double.parseDouble(cTF.getText());
        if ((a < b && b < c) || (a > b && b > c)) {
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = -a;
            b = -b;
            c = -c;
        }
        aLable.setText("A= " + a);
        bLable.setText("B= " + b);
        cLable.setText("C= " + c);
    }

}
