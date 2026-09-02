module org.example.sistemadematricula {

    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.sistemadematricula to javafx.fxml;

    exports org.example.sistemadematricula;
}