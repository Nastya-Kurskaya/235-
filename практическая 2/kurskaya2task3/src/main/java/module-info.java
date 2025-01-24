module ru.kurskaya.kurskaya2task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya2task3 to javafx.fxml;
    exports ru.kurskaya.kurskaya2task3;
}