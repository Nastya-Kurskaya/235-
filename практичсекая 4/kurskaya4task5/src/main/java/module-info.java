module ru.kurskaya.kurskaya4task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya4task5 to javafx.fxml;
    exports ru.kurskaya.kurskaya4task5;
}