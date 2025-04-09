module com.example.acender_led_arduino_java {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fazecast.jSerialComm;


    opens com.example.acender_led_arduino_java to javafx.fxml;
    exports com.example.acender_led_arduino_java;
}