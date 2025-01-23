package ru.kudriavtseva.task1_kudriavtseva2301;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField mTF;

    @FXML
    private Label sLabel;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int month = Integer.parseInt(mTF.getText());
        String season;
        switch (month) {
            case 12: case 1: case 2:
                season = "Зима"; break;
            case 3: case 4: case 5:
                season = "Весна"; break;
            case 6: case 7: case 8:
                season = "Лето"; break;
            case 9: case 10: case 11:
                season = "Осень"; break;
            default:
                season = "Некорректный номер месяца"; break;
        }
        sLabel.setText(season);
    }

}
