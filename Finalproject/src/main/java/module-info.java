module com.example.javafinal {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires metadata.extractor;


    opens com.example.javafinal to javafx.fxml;
    exports com.example.javafinal;
    exports com.example.javafinal.Utility;
    opens com.example.javafinal.Utility to javafx.fxml;
    exports com.example.javafinal.View;
    opens com.example.javafinal.View to javafx.fxml;
}