module ru.kudriavtseva.task_3_kudriavtseva {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task_3_kudriavtseva to javafx.fxml;
    exports ru.kudriavtseva.task_3_kudriavtseva;
}