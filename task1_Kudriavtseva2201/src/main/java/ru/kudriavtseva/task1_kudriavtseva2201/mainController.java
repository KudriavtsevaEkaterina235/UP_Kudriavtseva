package ru.kudriavtseva.task1_kudriavtseva2201;

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
    private TextField cTF;

    @FXML
    private Label rLable;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        double a = Double.parseDouble(aTF.getText().toString());
        double b = Double.parseDouble(bTF.getText().toString());
        double c = Double.parseDouble(cTF.getText().toString());
        if (a == 0) {
            rLable.setText("Уравнение не является квадратным");
        }else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                rLable.setText("Два решения");
            }else if (discriminant == 0){
                rLable.setText("Одно решение");
            } else {
                rLable.setText("Нет решений");
            }
        }
    }

}
