module com.projects.easyregx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.projects.easyregx to javafx.fxml;
    exports com.projects.easyregx;
    exports com.projects.easyregx.controllers;
    opens com.projects.easyregx.controllers to javafx.fxml;
}