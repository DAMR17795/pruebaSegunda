module com.example.pruebasegunda {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.pruebasegunda to javafx.fxml;
    exports com.example.pruebasegunda;
}