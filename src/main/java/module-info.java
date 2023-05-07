module com.example.tip_cal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tip_cal to javafx.fxml;
    exports com.example.tip_cal;
}