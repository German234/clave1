module com.parcialfinal.tareasimple {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.parcialfinal.tareasimple to javafx.fxml;
    exports com.parcialfinal.tareasimple;
}