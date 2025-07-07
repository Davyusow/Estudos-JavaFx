package ex01;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Exercicio1 extends Application {
    @Override
    public void start(Stage janela1) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("tela1.fxml")));
        Scene aba = new Scene(root);
        janela1.setScene(aba);
        janela1.setTitle("Tela 1");
        janela1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
