module ru.kudriavtseva.marathon {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kudriavtseva.marathon to javafx.fxml;
    exports ru.kudriavtseva.marathon;
    exports ru.kudriavtseva.marathon.controller;
    opens ru.kudriavtseva.marathon.controller to javafx.fxml;
}