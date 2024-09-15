module com.main.librarysys {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.main.librarysys to javafx.fxml;
    exports com.main.librarysys;
}