module ru.kudriavtseva.task3_kudriavtseva2201 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task3_kudriavtseva2201 to javafx.fxml;
    exports ru.kudriavtseva.task3_kudriavtseva2201;
}