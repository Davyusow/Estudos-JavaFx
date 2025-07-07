package aula06;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aula06 extends Application {
    @Override
    public void start(Stage tela1) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene aba1 = new Scene(root);

        Parent root2 = FXMLLoader.load(getClass().getResource("main2.fxml"));
        Scene aba2 = new Scene(root2);

        tela1.setScene(aba1);
        tela1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
