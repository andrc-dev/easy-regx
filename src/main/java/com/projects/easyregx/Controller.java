package com.projects.easyregx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Controller {

    // Current position of the stage
    private double posX = 0;
    private double posY = 0;

    // Scene elements
    @FXML
    private HBox hBox;
    @FXML
    private Button closeButton;
    @FXML
    private Button minimizeButton;
    @FXML
    private TextField outputBox;
    @FXML
    private Button copyButton;

    // Input Buttons
    @FXML
    private Button alphaButton;
    @FXML
    private Button numButton;
    @FXML
    private Button symbolButton;
    @FXML
    private Button spaceButton;
    @FXML
    private Button generateButton;

    @FXML
    public void handleStageDrag() {
        Stage stage = (Stage) hBox.getScene().getWindow();

        hBox.setOnMousePressed(event -> {
            posX = stage.getX() - event.getScreenX();
            posY = stage.getY() - event.getScreenY();
        });

        hBox.setOnMouseDragged(event -> {
            stage.setX(event.getScreenX() + posX);
            stage.setY(event.getScreenY() + posY);
        });
    }

    @FXML
    public void minimize() {
        Stage stage = (Stage) minimizeButton.getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    public void close() {
        javafx.application.Platform.exit();
    }
}