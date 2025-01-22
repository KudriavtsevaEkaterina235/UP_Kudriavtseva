package ru.kudriavtseva.task_4_kudriavtseva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField aTF;

    @FXML
    private TextField bTF;

    @FXML
    private TextField cTF;

    @FXML
    private Label nLable;

    @FXML
    private Label sLable;

    @FXML
    void resButtonOnAction(ActionEvent event) {
        int A = Integer.parseInt(aTF.getText().toString());
        int B = Integer.parseInt(bTF.getText().toString());
        int C = Integer.parseInt(cTF.getText().toString());
        int kolichPoDline = A/C;
        int kolichPoShirine = B/C;
        int vsego = kolichPoDline * kolichPoShirine;
        int plosPryam = A*B;
        int plos = vsego * (C * C);
        int freeplos = plosPryam - plos;
        nLable.setText("Количество квадратов: " + vsego);
        sLable.setText("Площадь незанятой части: " + freeplos);
    }

}
