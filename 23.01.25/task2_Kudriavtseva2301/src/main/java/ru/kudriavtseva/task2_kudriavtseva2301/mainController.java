package ru.kudriavtseva.task2_kudriavtseva2301;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField mTF;

    @FXML
    private TextField ntTF;

    @FXML
    private Label rLabel;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int n = Integer.parseInt(ntTF.getText());
        int m = Integer.parseInt(mTF.getText());
        String cardName = "";
        switch (n) {
            case 6: cardName = "шестёрка"; break;
            case 7: cardName = "семёрка"; break;
            case 8: cardName = "восьмёрка"; break;
            case 9: cardName = "девятка"; break;
            case 10: cardName = "десятка"; break;
            case 11: cardName = "валет"; break;
            case 12: cardName = "дама"; break;
            case 13: cardName = "король"; break;
            case 14: cardName = "туз"; break;
        }
        switch (m) {
            case 1: cardName += " пик"; break;
            case 2: cardName += " треф"; break;
            case 3: cardName += " бубен"; break;
            case 4: cardName += " червей"; break;
        }
        rLabel.setText(cardName);
    }

}
