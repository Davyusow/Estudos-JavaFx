package aula08;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class Aula08 extends Application {

  @Override
  public void start(Stage janela1) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
    Scene aba1 = new Scene(root);
    janela1.setScene(aba1);
    janela1.setTitle("Aula 08");
    janela1.show();
    janela1.setOnCloseRequest(event ->{
     event.consume();
     sair(janela1);
    });
  }
    void sair(Stage janela) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Sair");
        alerta.setHeaderText("Você está prestes a sair!");
        alerta.setContentText("Você quer mesmo sair?");
        if (alerta.showAndWait().get() == ButtonType.OK) {
            System.out.println("Você saiu corretamente!");
            janela.close();
          }
    }
  public static void main(String[] args) {
    launch(args);
  }

}
