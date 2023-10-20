module com.projects.easyregx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.projects.easyregx to javafx.fxml;
    exports com.projects.easyregx;
}