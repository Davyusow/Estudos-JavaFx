package aula09;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class Controlador {

    @FXML
    ImageView minhaImagem;

    @FXML
    Button btFoto;

    @FXML
    public void mostraFoto(){
        Image imagem = new Image(Objects.requireNonNull(getClass().getResourceAsStream("cafe.png")));
        minhaImagem.setImage(imagem);
    }
}
