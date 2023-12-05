module com.example.pricetracker {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.pricetracker to javafx.fxml;
    exports com.example.pricetracker;
}