package aula01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Aula01 extends Application {

    public static void main(String[] args) {
        launch(args);   //launch é um método estático da Classe Application
        //que é responsável por inicial o programa
    }

    @Override
    public void start(Stage tela1) throws Exception {
        //o Stage é o que serve como a janela, o palco para os outros elementos da interface
        //Stage tela2 = new Stage(); é a maneira de criar outra tela ou palco

        Group root = new Group(); //contâiner que organiza os elementos da interface
        Scene cena1 = new Scene(root, Color.GRAY);  //adiciona o grupo na cena
        //Color é uma classe estática com constantes de cores
        tela1.setTitle("Tela inicial"); //define o título da janela da aplicação
        tela1.setScene(cena1);  //adiciona a cena na tela
        Image icon = new Image("carrinho.png"); //adiciona uma imagem a partir do diretório resources com o maven
        tela1.getIcons().add(icon); //adiciona um ícone para a aplicação, por enquanto não funcionou no gnome

        tela1.setWidth(800);    //muda a largura padrão da janela
        tela1.setHeight(600);   //muda a altura padrão da janela
        //tela1.setResizable(false); //impede o redimensionamento da janela
        //tela1.setX(50); //altera o local onde a janela sera iniciada
        //tela1.setY(50); //caso não seja usado o sistema operacional vai decidir onde colocar a janela
        tela1.setFullScreen(true); //inicia a janela em tela cheia, esc para sair por padrão
        tela1.setFullScreenExitKeyCombination(KeyCombination.valueOf("q")); //muda a tecla padrão para sair da tela cheia
        tela1.setFullScreenExitHint("Pressione q para sair"); //altera a mensagem de dica da tela cheia, se tiver vazio nada é mostrado

        tela1.show(); //show mostra a tela fazendo sua visibilidade ser true
    }
}
