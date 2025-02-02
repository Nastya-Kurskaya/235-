module ru.kurskaya.kurskaya5task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya5task1 to javafx.fxml;
    exports ru.kurskaya.kurskaya5task1;
}