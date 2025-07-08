package aula08;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controlador {

    @FXML
    private Button btSair;
    @FXML
    private AnchorPane cena1;
    @FXML
    Stage janela1;

    @FXML
    void sair(ActionEvent evento) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Sair");
        alerta.setHeaderText("Você está prestes a sair!");
        alerta.setContentText("Você quer mesmo sair?");
        if (alerta.showAndWait().get() == ButtonType.OK) {
            janela1 = (Stage) cena1.getScene().getWindow();
            System.out.println("Você saiu corretamente!");
            janela1.close();
        }
    }

}
