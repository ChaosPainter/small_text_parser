module com.example.small_text_parser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.small_text_parser to javafx.fxml;
    exports com.example.small_text_parser;
}