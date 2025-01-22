package ru.kudriavtseva.task_2_kudriavtseva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label mLable;

    @FXML
    private TextField sTF;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int second = Integer.parseInt(sTF.getText().toString());
        int minutes = (second % 3600)/60;
        mLable.setText(" " + minutes);
    }

}
