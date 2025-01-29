module ru.kurskaya.kurskaya4task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya4task4 to javafx.fxml;
    exports ru.kurskaya.kurskaya4task4;
}