package com.projects.easyregx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main extends Application {

    //private double posX = 0;
    //private double posY = 0;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(root, 600, 250);
        stage.setTitle("EasyRegx");
        stage.initStyle(StageStyle.UNDECORATED);

        /* Make Stage Draggable
        root.setOnMousePressed(event -> {
            posX = stage.getX() - event.getScreenX();
            posY = stage.getY() - event.getScreenY();
        });

        root.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() + posX);
            stage.setY(event.getScreenY() + posY);
        });
         */

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}