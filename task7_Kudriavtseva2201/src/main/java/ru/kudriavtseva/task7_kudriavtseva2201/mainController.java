package ru.kudriavtseva.task7_kudriavtseva2201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField nTF;

    @FXML
    private Label rLable;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(nTF.getText());
        String description = "";
        if (number < 1 || number > 999) {
            description = "Число вне диапазона";
        } else {
            String parity = (number % 2 == 0) ? "четное" : "нечетное";
            String digits = (number < 10) ? "однозначное" : (number < 100) ? "двузначное" : "трехзначное";

            description = parity + " " + digits + " число";
        }

        rLable.setText(description);
    }

}
