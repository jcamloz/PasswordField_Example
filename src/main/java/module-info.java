module com.example.password_field {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jfr;


    opens com.example.password_field to javafx.fxml;
    exports com.example.password_field;
}