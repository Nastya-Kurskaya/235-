package ru.kurskaya.kurskaya6task1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;
    @Override
    public void start(Stage stage) throws IOException {
        primaryStage=stage;
        scene1=createScene1();
        scene2=createScene2();
        scene3=createScene3();
        scene4=createScene4();
        primaryStage.setTitle("Практическая работа 6");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
    private Scene createScene1(){
        Label titleLabel=new Label("Задание 1");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField dField=new TextField();
        Button calcButton=new Button("Найти длину");
        Label resultLabel=new Label();
        calcButton.setOnAction(www->{
            try {
                double d = Double.parseDouble(dField.getText());
                resultLabel.setText("Длина окружности: " + 3.14 * d);
            }
            catch (ArithmeticException e){
                resultLabel.setText("error!!!");
            }
            finally {
                JOptionPane.showMessageDialog(null,"Значение вычислено");
            }
        });
        Button btn1Button=new Button("1");
        Button btn2Button=new Button("2");
        Button btn3Button=new Button("3");
        Button btn4Button=new Button("4");
        btn1Button.setOnAction(event->primaryStage.setScene(scene1));
        btn2Button.setOnAction(event->primaryStage.setScene(scene2));
        btn3Button.setOnAction(event->primaryStage.setScene(scene3));
        btn4Button.setOnAction(event->primaryStage.setScene(scene4));
        HBox root2=new HBox(10, btn1Button, btn2Button,btn3Button, btn4Button );
        root2.setAlignment(Pos.CENTER);
        HBox root1=new HBox(10, new Label("d="),dField );
        root1.setAlignment(Pos.CENTER);
        VBox root=new VBox(20,titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root,300,300);
    }
    private  Scene createScene2(){
        Label titleLabel=new Label("Задание 2");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField aField=new TextField();
        TextField bField=new TextField();
        TextField cField=new TextField();
        TextField sideLField=new TextField();
        Button calcButton=new Button("Найти длины отрезков AC и BC и их сумму");
        Label acLabel=new Label();
        Label bcLabel=new Label();
        Label sumLabel=new Label();
        calcButton.setOnAction(event->{
            try{
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                double c = Double.parseDouble(cField.getText());
                double ac = Math.abs(a - c);
                double bc = Math.abs(b - c);
                double sum = ac + bc;
                acLabel.setText("Длина AC: " + ac);
                bcLabel.setText("Длина BC: " + bc);
                sumLabel.setText("Сумма: " + sum);
            }
            catch (NumberFormatException e){
                acLabel.setText("Error !!!");
                bcLabel.setText("Error !!!");
                sumLabel.setText("Error !!!");
            }
            finally {
                JOptionPane.showMessageDialog(null,"Значение вычислено");
            }
        });
        Button btn1Button=new Button("1");
        Button btn2Button=new Button("2");
        Button btn3Button=new Button("3");
        Button btn4Button=new Button("4");
        btn1Button.setOnAction(event->primaryStage.setScene(scene1));
        btn2Button.setOnAction(event->primaryStage.setScene(scene2));
        btn3Button.setOnAction(event->primaryStage.setScene(scene3));
        btn4Button.setOnAction(event->primaryStage.setScene(scene4));
        HBox root2=new HBox(10, btn1Button, btn2Button,btn3Button,btn4Button );
        root2.setAlignment(Pos.CENTER);
        HBox root1=new HBox(10, new Label("A="),aField, new Label("B="),bField, new Label("C="), cField);
        root1.setAlignment(Pos.CENTER);
        VBox root=new VBox(20,titleLabel, root1, calcButton, acLabel, bcLabel, sumLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root,700,500);
    }
    private Scene createScene3 (){
        Label titleLabel=new Label("Задание 3");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField v1Field=new TextField();
        TextField v2Field=new TextField();
        TextField sField=new TextField();
        TextField tField=new TextField();
        Button calcButton=new Button("Найти расстояние");
        Label resultLabel=new Label();
        calcButton.setOnAction(event->{
            try {
                double v1 = Double.parseDouble(v1Field.getText());
                double v2 = Double.parseDouble(v2Field.getText());
                double s = Double.parseDouble(sField.getText());
                double t = Double.parseDouble(tField.getText());
                double totalDistance = s + t * (v1 + v2);
                resultLabel.setText("Расстояние через T часов: " + totalDistance + " км");
            }
            catch (NumberFormatException e)
            {
                resultLabel.setText("Error!!!");
            }
            finally {
                JOptionPane.showMessageDialog(null,"Значение вычислено!");
            }
        });
        Button btn1Button=new Button("1");
        Button btn2Button=new Button("2");
        Button btn3Button=new Button("3");
        Button btn4Button=new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2=new HBox(10, btn1Button, btn2Button,btn3Button,btn4Button );
        root2.setAlignment(Pos.CENTER);
        HBox root1=new HBox(10, new Label("V1="), v1Field, new Label("V2="),v2Field, new Label("S="), sField, new Label("T="), tField);
        root1.setAlignment(Pos.CENTER);
        VBox root=new VBox(20,titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root,900,400);
    }
    public static void main(String[] args) {launch();}
    private  Scene createScene4(){
        Label titleLabel=new Label("Задание 4");
        titleLabel.setStyle("-fx-font-size:20px;-fx-font-weight:bold;");
        TextField xField=new TextField();
        TextField yField=new TextField();
        Button calcButton=new Button("Найти значение выражения");
        Label resultLabel=new Label();
        calcButton.setOnAction(event -> {
            try {
                double x = Double.parseDouble(xField.getText());
                double y = Double.parseDouble(yField.getText());
                double a = x + y;
                double b = x * x + y * y;
                double p = Math.pow(a + b, 2) + a * Math.cos(a + b) + (a * Math.sqrt(b)) / (a + b);
                resultLabel.setText("Значение выражения: " + p);
            }
            catch (NumberFormatException e){
                resultLabel.setText("Error!!!");
            }
            finally {
                JOptionPane.showMessageDialog(null,"Значение вычислено!");
            }
        });
        Button btn1Button=new Button("1");
        Button btn2Button=new Button("2");
        Button btn3Button=new Button("3");
        Button btn4Button=new Button("4");
        btn1Button.setOnAction(event -> primaryStage.setScene(scene1));
        btn2Button.setOnAction(event -> primaryStage.setScene(scene2));
        btn3Button.setOnAction(event -> primaryStage.setScene(scene3));
        btn4Button.setOnAction(event -> primaryStage.setScene(scene4));
        HBox root2=new HBox(10, btn1Button, btn2Button,btn3Button, btn4Button );
        root2.setAlignment(Pos.CENTER);
        HBox root1=new HBox(10, new Label("X="),xField, new Label("Y="), yField);
        root1.setAlignment(Pos.CENTER);
        VBox root=new VBox(20,titleLabel, root1, calcButton, resultLabel, root2);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        return new Scene(root,500,500);
    }
}