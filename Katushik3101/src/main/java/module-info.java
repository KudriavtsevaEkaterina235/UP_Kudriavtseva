module ru.kudriavtseva.katushik3101 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.kudriavtseva.katushik3101 to javafx.fxml;
    exports ru.kudriavtseva.katushik3101;
}