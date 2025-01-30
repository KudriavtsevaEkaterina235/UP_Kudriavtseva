package ru.kudriavtseva.marathon;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static ru.kudriavtseva.marathon.util.General.showMenuStage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        showMenuStage(stage,"menu-view.fxml", "Matathon Skills 2016");
    }

    public static void main(String[] args) {
        launch();
    }
}