package ru.kudriavtseva.task1_kudriavtseva2401;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.List;

public class listController {

    @FXML
    private Button addButton;

    @FXML
    private Button cButton;

    @FXML
    private TextField nTF;

    @FXML
    private Button okButton;

    @FXML
    private Label resultLabel;

    @FXML
    private ListView<Integer> setListView;

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (nTF.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(nTF.getText());
            setListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            nTF.setText("");
        }
    }

    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void okButtonOnAction(ActionEvent event) {
        List<Integer> data = setListView.getItems();
        int sum = 0;
        for (int i = 0; i < data.size(); i++) {
            int m = data.get(i);
            if (m % 10 == 4 && m % 3 == 0) {
                sum += m;
            }
        }
        if (sum != 0)
            resultLabel.setText(String.valueOf(sum));
        else resultLabel.setText("Чисел нет");

    }
}
