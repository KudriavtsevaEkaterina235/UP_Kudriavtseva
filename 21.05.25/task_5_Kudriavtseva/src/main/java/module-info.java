module ru.kudriavtseva.task_5_kudriavtseva {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task_5_kudriavtseva to javafx.fxml;
    exports ru.kudriavtseva.task_5_kudriavtseva;
}