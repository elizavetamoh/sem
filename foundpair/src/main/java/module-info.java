module foundpair {
    requires javafx.fxml;
    requires javafx.controls;
    opens ru.kpfu.foundpair to javafx.fxml;
    exports ru.kpfu.foundpair;
}