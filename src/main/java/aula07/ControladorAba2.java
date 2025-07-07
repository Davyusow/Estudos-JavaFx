package aula07;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class ControladorAba2 {

    @FXML
    Label nome;

    public void mostraNome(String usuario){
        nome.setText("Olá "+usuario+"!");
    }
}
