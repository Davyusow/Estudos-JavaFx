package aula07;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorAba1 {
    @FXML
    TextField campoNome;
    private Stage janela;
    private Scene aba;
    private Parent grupo;

    public void login(ActionEvent evento) throws IOException {

        String usuario = campoNome.getText(); //recebe o nome no campo de texto quando o botão for pressionado
        FXMLLoader loader = FXMLLoader.load(getClass().getResource("main2.fxml"));
        grupo = loader.load();
        ControladorAba2 controladorAba2 = loader.getController();
        controladorAba2.mostraNome(usuario);
        trocoAba2(evento);
    }
    public void trocoAba2(ActionEvent evento) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main2.fxml"));
        janela = (Stage) ((Node)evento.getSource()).getScene().getWindow();
        aba = new Scene(root);
        janela.setScene(aba);
        janela.show();
    }

}
