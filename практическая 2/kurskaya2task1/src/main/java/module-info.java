module ru.kurskaya.kurskaya2task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya2task1 to javafx.fxml;
    exports ru.kurskaya.kurskaya2task1;
}