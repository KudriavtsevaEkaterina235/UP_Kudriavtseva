module ru.kudriavtseva.task1_kudriavtseva2301 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task1_kudriavtseva2301 to javafx.fxml;
    exports ru.kudriavtseva.task1_kudriavtseva2301;
}