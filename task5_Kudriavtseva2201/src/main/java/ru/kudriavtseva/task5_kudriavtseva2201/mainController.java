package ru.kudriavtseva.task5_kudriavtseva2201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label rLabel;

    @FXML
    private TextField xTF;

    @FXML
    private TextField yTF;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        try {
            double x = Double.parseDouble(xTF.getText().toString());
            double y = Double.parseDouble(yTF.getText().toString());
            String result = checkArea(x, y);
            rLabel.setText(result);
        } catch (NumberFormatException e) {
            rLabel.setText("Ошибка: Введите числа");
        }
    }
    private String checkArea(double x, double y) {
        if (x >= 0 && x <= 10 && y >= 0 && y <= 5) {
            if ((x == 0 || x == 10 || y == 0 || y == 5)) return "На границе";
            else return "Да";
        } else {
            return "Нет";
        }
    }

}
