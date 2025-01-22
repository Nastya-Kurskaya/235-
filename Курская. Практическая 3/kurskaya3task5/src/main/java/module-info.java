module ru.kurskaya.kurskaya3task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya3task5 to javafx.fxml;
    exports ru.kurskaya.kurskaya3task5;
}