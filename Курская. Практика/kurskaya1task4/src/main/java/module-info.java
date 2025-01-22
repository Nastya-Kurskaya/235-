module ru.kurskaya.kurskaya1task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya1task4 to javafx.fxml;
    exports ru.kurskaya.kurskaya1task4;
}