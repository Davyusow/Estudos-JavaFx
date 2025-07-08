module com.example.estudosjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    //opens com.example.estudosjavafx to javafx.fxml;
    opens aula03 to javafx.fxml;
    opens aula04 to javafx.fxml;
    opens aula05 to javafx.fxml;
    opens aula06 to javafx.fxml;
    opens aula07 to javafx.fxml;
    opens aula08 to javafx.fxml;
    opens ex01 to javafx.fxml;
    exports aula01;
    exports aula02;
    exports aula03;
    exports aula04;
    exports aula05;
    exports aula06;
    exports aula07;
    exports aula08;
    exports ex01;
}