module ru.kudriavtseva.task2_kudriavtseva2401 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task2_kudriavtseva2401 to javafx.fxml;
    exports ru.kudriavtseva.task2_kudriavtseva2401;
}