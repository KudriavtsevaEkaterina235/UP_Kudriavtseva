package ru.kudriavtseva.task_kudriavtseva2501;

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
    private Scene scene4;
    private Scene scene5;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = creatScene1();
        scene2 = creatScene2();
        scene3 = creatScene3();
        scene4 = creatScene4();
        scene5 = creatScene5();
        primaryStage.setTitle("Практическая номер 6");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    private Scene creatScene1() {
        Label titleLabel = new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label pLabel = new Label();
        Label sLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                int a = Integer.parseInt(sideAField.getText());
                int b = Integer.parseInt(sideBField.getText());
                double S = a * b;
                double P = 2 * (a + b);
                pLabel.setText("периметр квадрата: " + P);
                sLabel.setText("площадь квадрата: " + S);
            } catch (ArithmeticException e) {
                sLabel.setText("Деление на ноль");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, new Label("b="), sideBField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, pLabel, sLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }

    private Scene creatScene2() {
        Label titleLabel = new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sidex1Field = new TextField();
        TextField sidex2Field = new TextField();
        Button calcButton = new Button("Вычислить расстояние");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double X1 = Double.parseDouble(sidex1Field.getText().toString());
                double X2 = Double.parseDouble(sidex2Field.getText().toString());
                double Distance = Math.abs(X2 - X1);
                resultLabel.setText("расстояние между точками" + Distance);
            } catch (ArithmeticException e) {
                resultLabel.setText("Error !!!");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x1="), sidex1Field, new Label("x2="), sidex2Field);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    public static void main(String[] args) {
        launch();
    }

    private Scene creatScene3() {
        Label titleLabel = new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sidev1Field = new TextField();
        TextField sidev2Field = new TextField();
        TextField sidesField = new TextField();
        TextField sidetField = new TextField();
        Button calcButton = new Button("Найти расстояние");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double V1 = Double.parseDouble(sidev1Field.getText().toString());
                double V2 = Double.parseDouble(sidev2Field.getText().toString());
                double S = Double.parseDouble(sidesField.getText().toString());
                double T = Double.parseDouble(sidetField.getText().toString());
                double tDistance = T * (V1 + V2);
                double fDistance = Math.abs(S - tDistance);
                resultLabel.setText("Расстояние= " + fDistance);
            } catch (NumberFormatException e) {
                resultLabel.setText("Error !!!");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("V1="), sidev1Field, new Label("V2="), sidev2Field, new Label("S="), sidesField, new Label("T="), sidetField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 500, 500);
    }

    private Scene creatScene4() {
        Label titleLabel = new Label("Задание 4");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sidexField = new TextField();
        TextField sidegField = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resultyLabel = new Label();
        Label resultzLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double x = Double.parseDouble(sidexField.getText().toString());
                double g = Double.parseDouble(sidegField.getText().toString());
                double y = x + Math.sqrt(Math.abs(1 - x * x));
                double z = Math.pow(Math.sin(2 * (x + g)), 2) + (Math.cos(x) / (x + Math.pow(y, 2) * Math.log(Math.abs(x - y))));
                resultyLabel.setText("y=" + y);
                resultzLabel.setText("z=" + z);
            } catch (ArithmeticException e) {
                resultzLabel.setText("Деление на ноль");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("x="), sidexField, new Label("g="), sidegField);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultyLabel, resultzLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
    private Scene creatScene5() {
        Label titleLabel = new Label("Задание 5");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField sideAField = new TextField();
        TextField sideBField = new TextField();
        TextField sideCField = new TextField();
        TextField sideA1Field = new TextField();
        TextField sideB1Field = new TextField();
        TextField sideC1Field = new TextField();
        Button calcButton = new Button("Вычислить");
        Label resultLabel = new Label();
        calcButton.setOnAction(www -> {
            try {
                double a1 = Double.parseDouble(sideAField.getText());
                double a2 = Double.parseDouble(sideBField.getText());
                double b1 = Double.parseDouble(sideCField.getText());
                double b2 = Double.parseDouble(sideA1Field.getText());
                double c1 = Double.parseDouble(sideB1Field.getText());
                double c2 = Double.parseDouble(sideC1Field.getText());
                double d = a1 * b2 - a2 * b1;
                double x = (c1 * b2 - c2 * b1) / d;
                double y = (a1 * c2 - a2 * c1) / d;
                if (d != 0) {
                    resultLabel.setText("" + x);
                    resultLabel.setText("" + y);
                }
                else {
                    resultLabel.setText("Нет решения!");
                    resultLabel.setText("Нет решения!");
                }
            } catch (ArithmeticException e) {
                resultLabel.setText("Деление на ноль");
            }
        });
        Button btn1Button = new Button("1");
        Button btn2Button = new Button("2");
        Button btn3Button = new Button("3");
        Button btn4Button = new Button("4");
        Button btn5Button = new Button("5");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        btn5Button.setOnAction(event -> primaryStage.setScene(scene5));
        HBox root2 = new HBox(10, btn1Button, btn2Button, btn3Button, btn4Button, btn5Button);
        root2.setAlignment(Pos.CENTER);
        HBox root1 = new HBox(10, new Label("a="), sideAField, new Label("b="),  sideBField, new Label("c="), sideCField, new Label("a1="), sideA1Field, new Label("b1="), sideB1Field, new Label("c1="), sideC1Field);
        root1.setAlignment(Pos.CENTER);
        VBox root = new VBox(20, titleLabel, root1, calcButton, resultLabel, root2);
        root.setPadding(new Insets(20));
        return new Scene(root, 300, 300);
    }
}