module com.example.methods {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.methods to javafx.fxml;
    exports com.example.methods;
}