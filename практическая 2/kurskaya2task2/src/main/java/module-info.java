module ru.kurskaya.kurskaya2task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya2task2 to javafx.fxml;
    exports ru.kurskaya.kurskaya2task2;
}