module ru.kurskaya.kurskaya4task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya4task1 to javafx.fxml;
    exports ru.kurskaya.kurskaya4task1;
}