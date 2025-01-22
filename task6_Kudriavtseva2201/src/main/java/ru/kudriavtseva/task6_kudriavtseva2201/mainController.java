package ru.kudriavtseva.task6_kudriavtseva2201;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField NTF;

    @FXML
    private Label rLable;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int number = Integer.parseInt(NTF.getText().toString());
        String description;
        if (number == 0) {
            description = "нулевое число";
        } else if (number > 0) {
            description = (number % 2 == 0) ? "положительное четное число" : "положительное нечетное число";
        } else {
            description = (number % 2 == 0) ? "отрицательное четное число" : "отрицательное нечетное число";
        }

        rLable.setText(description);
    }

}
