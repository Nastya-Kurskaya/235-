module ru.kurskaya.kurskaya4task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya4task2 to javafx.fxml;
    exports ru.kurskaya.kurskaya4task2;
}