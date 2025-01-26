package ru.kudriavtseva.task2_kudriavtseva2401;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class listController {

    @FXML
    private TextField aTF;

    @FXML
    private TextField bTF;

    @FXML
    private Button cButton;

    @FXML
    private Button resultButton;

    @FXML
    private Label resultLabel;

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int count = 0;
        int a = Integer.parseInt(aTF.getText());
        int b = Integer.parseInt(bTF.getText());
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0){
                count++;
            }
        }
        if (count > 0) {
            resultLabel.setText("" + count);
        }
        else {
            resultLabel.setText("Нет четных чисел на этом отрезке");
        }
    }

}
