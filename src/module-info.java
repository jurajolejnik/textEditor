module SKOLA {
    requires javafx.controls;
    requires javafx.fxml;
    opens sample;
    exports sample;
    opens textEditor;
    exports textEditor;
}