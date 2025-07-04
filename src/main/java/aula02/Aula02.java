package aula02;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Aula02 extends Application {
    @Override
    public void start(Stage tela1) throws Exception {
        Group root = new Group();
        Scene aba1 = new Scene(root,624,351, Color.LIGHTGREEN); //os argumentos v e v1 definem a largura e altura inicial da janela

        Text texto = new Text("Textinho bonitinho"); //o texto também pode ser dado com texto.setText()
        texto.setX(50);
        texto.setY(50); //define onde o texto será colocado
        System.out.println(Font.getFontNames()); //imprime no terminal todas as fontes encontradas no sistema
        texto.setFont(Font.font("Arial",50)); //troca a fonte do texto e o tamanho dela
        texto.setFill(Color.WHITE); //define a cor do texto

        Line linha = new Line(); //adiciona uma linha reta
        linha.setStartX(200); //define onde é o ponto inicial da reta
        linha.setStartY(200);
        linha.setEndX(400); //define onde é o ponto final da reta
        linha.setEndY(200);
        linha.setStrokeWidth(3); //muda a grossura da linha
        linha.setStroke(Color.WHITE); //muda a cor da linha
        linha.setOpacity(0.5); //recebe valores double de 0 a 1 -> 0 a 100% para mudar a opacidade
        linha.setRotate(90); //recebe valores em graus para mudar o ângulo da reta

        Rectangle retangulo = new Rectangle(); // cria um retângulo
        retangulo.setX(100);
        retangulo.setY(100);
        retangulo.setWidth(100);
        retangulo.setHeight(100);   //as linhas de cima como as anteriores definem onde o elemento/nó vai ficar inicialmente
        retangulo.setFill(Color.WHITE);
        retangulo.setStrokeWidth(5);
        retangulo.setStroke(Color.BLACK); //da uma cor para a borda do retângulo

        Polygon triangulo = new Polygon(); //o Polygon é usado para criar polígonos mais complexos
        triangulo.getPoints().setAll(
                200D,200D,
                300D,300D,
                200D,300D
        ); //define os pontos do polígono, aqui criando um triângulo
        triangulo.setFill(Color.YELLOW);

        Circle circulo = new Circle();
        circulo.setCenterX(350);
        circulo.setCenterY(220);
        circulo.setRadius(30);
        circulo.setFill(Color.ORANGE);

        Image image = new Image("carrinho.png"); //a imagem por si só não pode ser adicionada em um grupo
        ImageView imagem = new ImageView(image);    //com o imageview sim é possível adicionar
        imagem.setX(300);
        imagem.setY(300);//apesar disso a imagem é muito grande e só aparece se maximar ou redimensionar a janela


        root.getChildren().add(linha); //adição dos nós ao grupo
        root.getChildren().add(imagem);
        root.getChildren().add(circulo);
        root.getChildren().add(triangulo);
        root.getChildren().add(retangulo);
        root.getChildren().add(texto);  //adiciona o nó Text para o grupo root na aba1 da janela/tela1

        tela1.setScene(aba1);
        tela1.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
