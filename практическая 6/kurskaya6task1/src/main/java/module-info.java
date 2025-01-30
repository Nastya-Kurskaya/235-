module ru.kurskaya.kurskaya6task1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.kurskaya.kurskaya6task1 to javafx.fxml;
    exports ru.kurskaya.kurskaya6task1;
}