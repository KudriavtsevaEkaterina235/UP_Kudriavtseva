package ru.kudriavtseva.task_5_kudriavtseva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label cLable;

    @FXML
    private TextField yearTF;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int god = Integer.parseInt(yearTF.getText().toString());
        int stoletie;
        if (god % 100 == 0) {
            stoletie = god/100;
        }else {
            stoletie = god/100+1;
        }
        cLable.setText("Номер столетия: " + stoletie);
    }

}
