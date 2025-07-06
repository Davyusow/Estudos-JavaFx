package aula04;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controlador {
    //ao usar o controlador é preciso chamar a Classe no fxml pelo nome relativo do caminho do projeto, no caso, aula04.Controlador

    @FXML  //relaciona o arquivo fxml com o controlador

    private Circle meuCirculo = new Circle();
    private double x;
    private double y;

    public void cima(ActionEvent evento){
        //System.out.println("Cima!!");
        meuCirculo.setCenterY(y-=5);
    }

    public void baixo(ActionEvent evento){
        //System.out.println("Baixo!!");
        meuCirculo.setCenterY(y+=5);
    }

    public void esquerda(ActionEvent evento){
        //System.out.println("Esquerda!!");
        meuCirculo.setCenterX(x-=5);
    }

    public void direita(ActionEvent evento){
        //System.out.println("Direita!!");
        meuCirculo.setCenterX(x+=5);
    }
}
