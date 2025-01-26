module ru.kudriavtseva.task3_kudriavtseva2401 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task3_kudriavtseva2401 to javafx.fxml;
    exports ru.kudriavtseva.task3_kudriavtseva2401;
}