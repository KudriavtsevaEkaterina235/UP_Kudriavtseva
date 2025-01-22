package ru.kudriavtseva.task_1_kudriavtseva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField fTF;

    @FXML
    private Label kLable;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int FileSize = Integer.parseInt(fTF.getText().toString());
        float kiloBytes = FileSize / 1024;
        kLable.setText(" " + String.format("%.3f",kiloBytes));
    }

}
