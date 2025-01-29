module ru.kurskaya.kurskaya4task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya4task6 to javafx.fxml;
    exports ru.kurskaya.kurskaya4task6;
}