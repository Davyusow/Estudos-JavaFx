package ex01;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ControladorPrincipal {
    @FXML
    private Stage janela;
    private Scene aba;
    private Parent root;

    @FXML
    public void setJanela(Stage janela){
        this.janela = janela;
    }

    @FXML
    public void irAba1(ActionEvent evento) throws IOException {
        janela = (Stage) ((Node)evento.getSource()).getScene().getWindow();
        carregaAba("tela1.fxml","Tela 1");
    }

    @FXML
    public void irAba2(ActionEvent evento) throws IOException {
        janela = (Stage) ((Node)evento.getSource()).getScene().getWindow();
        carregaAba("tela2.fxml","Tela 2");
    }

    @FXML
    public void irAba3(ActionEvent evento) throws IOException {
        janela = (Stage) ((Node)evento.getSource()).getScene().getWindow();
        carregaAba("tela3.fxml","Tela 3");
    }

    @FXML
    public void carregaAba(String arquivoFxml, String titulo) throws IOException {
      //  FXMLLoader loader = new FXMLLoader().load(Objects.requireNonNull(getClass().getResource(arquivoFxml)));

        root = new FXMLLoader().load(Objects.requireNonNull(getClass().getResource(arquivoFxml)));
        aba = new Scene(root);

        janela.setTitle(titulo);
        janela.setScene(aba);
        janela.show();
    }
}
