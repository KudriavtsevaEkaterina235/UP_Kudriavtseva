module ru.kudriavtseva.task2_kudriavtseva {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task2_kudriavtseva to javafx.fxml;
    exports ru.kudriavtseva.task2_kudriavtseva;
}