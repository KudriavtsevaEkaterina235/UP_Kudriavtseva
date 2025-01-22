module ru.kudriavtseva.task3_kudriavtseva {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task3_kudriavtseva to javafx.fxml;
    exports ru.kudriavtseva.task3_kudriavtseva;
}