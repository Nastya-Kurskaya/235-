package ru.kurskaya.kurskayamarathonskills.util;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ru.kurskaya.kurskayamarathonskills.HelloApplication;

import java.io.IOException;

public class Manager {
    public static Stage mainStage;
    public static Rectangle2D screenSize = Screen.getPrimary().getVisualBounds();

    public static void showMainStage(Stage stage, String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), 800, 600);
            stage.setScene(scene);
            stage.setTitle(title);
            stage.setMinWidth(300);
            stage.setMinHeight(200);
            stage.setMaximized(true);
            mainStage = stage;
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showSecondScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showThirdScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showFourthScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showFifthScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showSixthScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showSeventhScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showEighthScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showNinthScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void showTenScene(String fxmlFileName, String title) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        try {
            Scene scene = new Scene(fxmlLoader.load(), screenSize.getWidth(), screenSize.getHeight() - 50);
            mainStage.setScene(scene);
            mainStage.setTitle(title);
            mainStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}