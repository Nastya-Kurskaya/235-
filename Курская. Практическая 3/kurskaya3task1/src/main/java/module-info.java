module ru.kurskaya.kurskaya3task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya3task1 to javafx.fxml;
    exports ru.kurskaya.kurskaya3task1;
}