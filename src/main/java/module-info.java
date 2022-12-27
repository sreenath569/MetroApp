module com.example.metroapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.metroapp to javafx.fxml;
    exports com.example.metroapp;
}