package aula06;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorAbas {
    @FXML
    private Stage janela;
    private Scene aba;
    private Parent grupo;

    public void trocaAba1(ActionEvent evento) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        janela = (Stage) ((Node)evento.getSource()).getScene().getWindow();
        aba = new Scene(root);
        janela.setScene(aba);
        janela.show();
    }
    public void trocaAba2(ActionEvent evento) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main2.fxml"));
        janela = (Stage) ((Node)evento.getSource()).getScene().getWindow();
        aba = new Scene(root);
        janela.setScene(aba);
        janela.show();
    }
}
