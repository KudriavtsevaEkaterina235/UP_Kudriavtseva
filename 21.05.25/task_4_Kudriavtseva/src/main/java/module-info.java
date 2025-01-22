module ru.kudriavtseva.task_4_kudriavtseva {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task_4_kudriavtseva to javafx.fxml;
    exports ru.kudriavtseva.task_4_kudriavtseva;
}