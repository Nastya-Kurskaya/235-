module ru.kurskaya.kurskaya5task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya5task5 to javafx.fxml;
    exports ru.kurskaya.kurskaya5task5;
}