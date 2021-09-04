module au.edu.unsw.infs2605.starterkit {
    requires javafx.baseEmpty;
    requires javafx.base;
    requires javafx.fxmlEmpty;
    requires javafx.fxml;
    requires javafx.controlsEmpty;
    requires javafx.controls;
    requires javafx.graphicsEmpty;
    requires javafx.graphics;
    requires java.base;

    opens au.edu.unsw.infs2605.starterkit to javafx.fxml;
    exports au.edu.unsw.infs2605.starterkit;
}