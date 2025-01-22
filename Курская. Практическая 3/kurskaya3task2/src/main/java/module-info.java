module ru.kurskaya.kurskaya3task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya3task2 to javafx.fxml;
    exports ru.kurskaya.kurskaya3task2;
}