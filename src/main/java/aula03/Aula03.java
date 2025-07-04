package aula03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aula03 extends Application {
    @Override
    public void start(Stage tela1) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("teste.fxml"));    //adiciona um arquivo fxml para fazer
        //o layout das cenas e grupos de maneira gráfica e mais fácil com o scenebuilder
        //o arquivo .fxml precisa setar na pasta resources com um diretório de mesmo nome do pacote da classe
        Scene cena1 = new Scene(root);
        tela1.setScene(cena1);
        tela1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
