module ru.kurskaya.kurskaya3task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya3task3 to javafx.fxml;
    exports ru.kurskaya.kurskaya3task3;
}