package ru.kudriavtseva.task2_kudriavtseva2201;

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
        int number = Integer.parseInt(nTF.getText().toString());
        if (number > 0) {
            number -= 8;
        }else if (number < 0) {
            number += 6;
        }else {
            number = 10;
        }
        rLable.setText("Результат: " + number);
    }

}
