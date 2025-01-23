module ru.kudriavtseva.task4_kudriavtseva2301 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.task4_kudriavtseva2301 to javafx.fxml;
    exports ru.kudriavtseva.task4_kudriavtseva2301;
}