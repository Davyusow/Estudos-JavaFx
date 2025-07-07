package aula05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aula05 extends Application {
    @Override
    public void start(Stage tela1) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main2.fxml"));
        Scene aba1 = new Scene(root);
        //String css = this.getClass().getResource("/aula05/applicativo.css").toExternalForm();
            aba1.getStylesheets().add(getClass().getResource("applicativo.css").toExternalForm());
        tela1.setScene(aba1);
        tela1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
