module ru.kurskaya.kurskaya5task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskaya5task3 to javafx.fxml;
    exports ru.kurskaya.kurskaya5task3;
}