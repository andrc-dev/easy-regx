package com.projects.easyregx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    // Scene elements
    @FXML
    private Label welcomeText;
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
    public void setCloseButtonStyleOnEnter() {
        closeButton.setStyle("-fx-background-color: red");
    }

    public void setButtonStyleOnMouseExit() {
        closeButton.setStyle("-fx-background-color: #1A1A1A");
    }

    @FXML
    public void close() {
        javafx.application.Platform.exit();
    }
}