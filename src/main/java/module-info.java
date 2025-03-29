module org.project1.project1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.project1.project1 to javafx.fxml;
    exports org.project1.project1;
}