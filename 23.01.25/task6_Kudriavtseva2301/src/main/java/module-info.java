module ru.kudriavtseva.task6_kudriavtseva2301 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task6_kudriavtseva2301 to javafx.fxml;
    exports ru.kudriavtseva.task6_kudriavtseva2301;
}