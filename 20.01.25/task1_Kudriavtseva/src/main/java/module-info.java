module ru.kudriavtseva.task1_kudriavtseva {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task1_kudriavtseva to javafx.fxml;
    exports ru.kudriavtseva.task1_kudriavtseva;
}