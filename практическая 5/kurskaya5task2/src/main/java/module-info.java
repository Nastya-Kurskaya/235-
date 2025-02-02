module ru.kurskaya.kurskaya5task2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.kurskaya.kurskaya5task2 to javafx.fxml;
    exports ru.kurskaya.kurskaya5task2;
}