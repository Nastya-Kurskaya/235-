module ru.kurskaya.domashka {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.domashka to javafx.fxml;
    exports ru.kurskaya.domashka;
    exports ru.kurskaya.domashka.controller;
    opens ru.kurskaya.domashka.controller to javafx.fxml;
}