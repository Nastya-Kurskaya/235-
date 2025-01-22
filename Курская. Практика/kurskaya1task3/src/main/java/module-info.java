module ru.kurskaya.kurskaya1task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya1task3 to javafx.fxml;
    exports ru.kurskaya.kurskaya1task3;
}