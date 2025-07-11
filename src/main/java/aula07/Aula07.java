package aula07;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aula07 extends Application {
    @Override
    public void start(Stage janela1) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene aba1 = new Scene(root);
        janela1.setScene(aba1);
        janela1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
