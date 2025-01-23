package ru.kudriavtseva.task4_kudriavtseva2301;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label chLabel;

    @FXML
    private TextField kTF;

    @FXML
    private TextField nTF;

    @FXML
    private Label oLabel;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(nTF.getText().toString());
        int k = Integer.parseInt(kTF.getText().toString());
        int chasnoe = 0;
        int ostatok = n;
        while (ostatok >= k) {
            ostatok -= k;
            chasnoe++;
        }
        chLabel.setText(" "+ chasnoe);
        oLabel.setText(" "+ ostatok);
    }

}
