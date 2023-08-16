module com.example.triovision {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.triovision to javafx.fxml;
    exports com.example.triovision;
    exports com.example.triovision.controller;
    opens com.example.triovision.controller to javafx.fxml;
    exports com.example.triovision.model;
    opens com.example.triovision.model to javafx.fxml;
}