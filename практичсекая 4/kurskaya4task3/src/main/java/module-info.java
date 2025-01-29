module ru.kurskaya.kurskaya4task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya4task3 to javafx.fxml;
    exports ru.kurskaya.kurskaya4task3;
}