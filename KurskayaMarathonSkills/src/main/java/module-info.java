module ru.kurskaya.kurskayamarathonskills {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.kurskaya.kurskayamarathonskills to javafx.fxml;
    exports ru.kurskaya.kurskayamarathonskills;
    exports ru.kurskaya.kurskayamarathonskills.controller;
    opens ru.kurskaya.kurskayamarathonskills.controller to javafx.fxml;
}