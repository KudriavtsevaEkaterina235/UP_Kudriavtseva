package ru.kudriavtseva.task_3_kudriavtseva;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label dwLable;

    @FXML
    private TextField kTF;

    @FXML
    void sumButtonOnAction(ActionEvent event) {
        int a = Integer.parseInt(kTF.getText().toString());
        int b = (a) % 7;
        if (1<=a && a<=365)
            switch (b) {
                case 0:
                   dwLable.setText("День недели: воскресенье");
                   break;
                case 1:
                    dwLable.setText("День недели: понедельник");
                    break;
                case 2:
                    dwLable.setText("День недели: вторник");
                    break;
                case 3:
                    dwLable.setText("День недели: среда");
                    break;
                case 4:
                    dwLable.setText("День недели: четверг");
                    break;
                case 5:
                    dwLable.setText("День недели: пятница");
                    break;
                case 6:
                    dwLable.setText("День недели: суббота");
                    break;
            }
        else
            dwLable.setText("Введите число попадающее под текущий год");
    }

}
