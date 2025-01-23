module ru.kudriavtseva.task3_kudriavtseva2301 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task3_kudriavtseva2301 to javafx.fxml;
    exports ru.kudriavtseva.task3_kudriavtseva2301;
}