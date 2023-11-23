package com.projects.easyregx.controllers;

import com.projects.easyregx.models.RegxGen;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppController {

    private RegxGen regxGen = RegxGen.getInstance();

    // Window elements
    @FXML
    private HBox hBox;
    @FXML
    private Button closeButton;
    @FXML
    private Button minimizeButton;

    // App elements
    @FXML
    private TextField outputBox;
    @FXML
    private Button copyButton;
    @FXML
    private ToggleButton numButton;
    @FXML
    private ToggleButton alphaButton;
    @FXML
    private ToggleButton symbolsButton;
    @FXML
    private ToggleButton spaceButton;
    @FXML
    private Button generateButton;

    //private ToggleButton[] buttons = {numButton, alphaButton, symbolsButton, spaceButton}; // null buttons

    // Current position of the stage
    private double posX = 0;
    private double posY = 0;

    @FXML
    public void generate() {
        outputBox.setText(regxGen.createRegex(getSelectedButtons()));
        deselectButtons();
    }

    public String getSelectedButtons() {
        if (numButton.isSelected() && alphaButton.isSelected() && symbolsButton.isSelected() && spaceButton.isSelected()) {
            return "all";
        } else if (numButton.isSelected() && alphaButton.isSelected() && spaceButton.isSelected()) {
            return "alphanum+space";
        } else if (numButton.isSelected() && alphaButton.isSelected()) {
            return "alphanum";
        } else if (numButton.isSelected()) {
            return "num";
        } else if (alphaButton.isSelected()) {
            return "letters";
        } else if (symbolsButton.isSelected()) {
            return "symbols";
        } else if (spaceButton.isSelected()) {
            return "space";
        } else {
            return "none";
        }
    }

    private void deselectButtons() {
        numButton.setSelected(false);
        alphaButton.setSelected(false);
        symbolsButton.setSelected(false);
        spaceButton.setSelected(false);
    }

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