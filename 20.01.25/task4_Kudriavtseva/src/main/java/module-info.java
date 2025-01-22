module ru.kudriavtseva.task4_kudriavtseva {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task4_kudriavtseva to javafx.fxml;
    exports ru.kudriavtseva.task4_kudriavtseva;
}