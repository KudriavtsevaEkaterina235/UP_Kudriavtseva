module ru.kudriavtseva.task_kudriavtseva2501 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens ru.kudriavtseva.task_kudriavtseva2501 to javafx.fxml;
    exports ru.kudriavtseva.task_kudriavtseva2501;
}