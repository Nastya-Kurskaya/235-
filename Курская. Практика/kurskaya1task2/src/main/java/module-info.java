module ru.kurskaya.kurskaya1task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya1task2 to javafx.fxml;
    exports ru.kurskaya.kurskaya1task2;
}