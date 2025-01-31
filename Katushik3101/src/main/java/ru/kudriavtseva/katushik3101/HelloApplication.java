package ru.kudriavtseva.katushik3101;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static java.lang.Math.*;

import java.io.IOException;
import javax.swing.*;
import java.awt.event.*;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = creatScene1();
        scene2 = creatScene2();
        scene3 = creatScene3();
        primaryStage.setTitle("31.01.25");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene creatScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                float A = Float.parseFloat(sideAField.getText().toString());
                float B = Float.parseFloat(sideBField.getText().toString());
                resultLabel.setText("P =" + ((A + B) * 2));
            } catch (ArithmeticException e) {
                resultLabel.setText("error");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, new Label("b="), sideBField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene creatScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        TextField sideCField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                int a = Integer.parseInt(sideAField.getText());
                int b = Integer.parseInt(sideBField.getText());
                int c = Integer.parseInt(sideCField.getText());
                if ((a * b) > (b * c)) {
                    resultLabel.setText((b * c) + " " + (a * b));
                } else resultLabel.setText((a * b) + " " + (c * b));
            } catch (Exception e) {
                resultLabel.setText("Некорректные данные");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, new Label("b="), sideBField, new Label("c="), sideCField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);

    }

    private Scene creatScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        TextField sideRField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                int a = Integer.parseInt(sideAField.getText());
                int b = Integer.parseInt(sideBField.getText());
                int r = Integer.parseInt(sideRField.getText());
                int P = 2 * (a + b);
                if (pow(a, 2) + pow(b, 2) <= pow(r, 2)) resultLabel.setText("Принадлежит");
                else resultLabel.setText("Не принадлежит");
            } catch (Exception e) {
                resultLabel.setText("Некорректные данные");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, new Label("b="), sideBField, new Label("r="), sideRField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);

    }
}