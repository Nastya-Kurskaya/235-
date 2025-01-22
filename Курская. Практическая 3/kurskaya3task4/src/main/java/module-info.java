module ru.kurskaya.kurskaya3task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya3task4 to javafx.fxml;
    exports ru.kurskaya.kurskaya3task4;
}