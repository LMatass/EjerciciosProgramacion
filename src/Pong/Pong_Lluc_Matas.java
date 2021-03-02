
package Pong;/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 02/02/2021
  
  Hora inicio: 19:11
  
  Descripción:  Juego Pong

*/

import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.Circle;

/*
    En esta clase estan las distintas variables de la pelota, entre ellos, lo valores delxtaX y deltaY que al modificarlos nos permiten
    que nuestra pelota se mueva en las distintas direcciones. Usamos la clase Circle que JavaFX nos da para darle forma a nuestro objeto.
 */
class Bolla extends Circle {
    public double deltaX;
    public double deltaY;
    Circle cercle;

    public Bolla(int radi, Color color) {
        this.cercle = new Circle(radi, color);
        this.deltaX = 1;
        this.deltaY = 1;
    }
}

class RectangleJugador extends Rectangle {
    //Almacena la posicion de nuestro objeto rectangleJugador
    static class Posicio {
        int posX;
        int posY;

        public Posicio(int x, int y) {
            this.posX = x;
            this.posY = y;
        }
    }

    Posicio posicio;
    int velocitat = 20; //Velocidad de movimiento de los rectangulos
    Pane panell;
    Node rectangle;
    public double ampRectangle = 15;
    public double altRectangle = 120;
    int puntuacion;

    /*
    En el constructor de la clase le pasamos como parametros, el panel o fondo donde van a ser añadidos los rectangulos,
    la posicion longitudinal y vertical inicial.
     */
    public RectangleJugador(Pane panell, int posX, int posY) {
        posicio = new Posicio(posX, posY);
        this.panell = panell;
        this.rectangle = new Rectangle(ampRectangle, altRectangle, Color.WHITE);//Se crea el objeto rectangulo, con los valores previamente definidos.
        posicio.posX = posX;
        posicio.posY = posY;
        this.rectangle.setLayoutX(posicio.posX);
        this.rectangle.setLayoutY(posicio.posY);
        this.panell.getChildren().add(this.rectangle);
        this.puntuacion = 0;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    private void repinta() {
        this.rectangle.setLayoutX(posicio.posX);
        this.rectangle.setLayoutY(posicio.posY);
    }

    public void mouAmunt() {
        posicio.posY = posicio.posY - this.velocitat;
        this.repinta();
    }

    public void mouAbaix() {
        posicio.posY = posicio.posY + this.velocitat;
        this.repinta();
    }
}

public class Pong_Lluc_Matas extends Application {
    Bolla bolla1;
    int radi_bolles = 15;
    final double angle_en_radians = Math.toRadians(30);
    final int velocitat = 3;
    double deltaX = velocitat * Math.cos(angle_en_radians);
    double deltaY = velocitat * Math.sin(angle_en_radians);

    public int contadorJugador1 = 0;
    public int contadorJugador2 = 0;

    Pane panell = new Pane();
    //Ancho y alto de la ventana del programa
    double amp = 800;
    double alt = 600;
    //Creacion de los rectangulos
    RectangleJugador rectangleJugador1 = new RectangleJugador(panell, 0, (int) (alt / 2 - 60));
    RectangleJugador rectangleJugador2 = new RectangleJugador(panell, (int) (amp - rectangleJugador1.ampRectangle), (int) (alt / 2 - 60));

    /*
    Se crean los distintos objetos de texto, todos se posicionan usando las variables de altura y anchura.
    Estos son los contadores que se mostraran por pantalla, se iran actualizando cada vez que se marque un punto.
     */
    Text contadorFX1 = new Text(amp / 4, alt / 3, Integer.toString(contadorJugador1));
    Text contadorFX2 = new Text(amp - amp / 4, alt / 3, Integer.toString(contadorJugador2));

    //Texto que aparece al incio del programa para dar informacion al jugador de como iniciar el juego.
    Text menu = new Text(amp / 2 - 120, alt / 3, "Pulsa espacio para empezar");

    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        //Creacion de la "ventana"
        primaryStage.setScene(new Scene(panell, amp, alt));
        primaryStage.setTitle("PONG LLUC MATAS");
        primaryStage.show();
        panell.requestFocus();
        panell.setStyle("-fx-background-color: black");

        //Creacion de la pelota y la colocacion en el centro
        bolla1 = new Bolla(radi_bolles, Color.WHITE);
        bolla1.cercle.relocate(amp / 2, alt / 2);

        //Se añaden todos los objetos de JavaFX al panel principal
        panell.getChildren().addAll(bolla1.cercle);
        panell.getChildren().addAll(rectangleJugador1);
        panell.getChildren().addAll(rectangleJugador2);
        panell.getChildren().addAll(contadorFX1);
        panell.getChildren().addAll(contadorFX2);
        panell.getChildren().addAll(menu);

        //Estilos para los distintos textos
        contadorFX1.setFont(Font.font("Verdana", 50));
        contadorFX1.setFill(Color.WHITE);
        contadorFX2.setFont(Font.font("Verdana", 50));
        contadorFX2.setFill(Color.WHITE);
        menu.setFont(Font.font("Verdana", 20));
        menu.setFill(Color.WHITE);


        final Timeline loop = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<>() {
            final Bounds limits = panell.getBoundsInLocal();

            @Override
            public void handle(final ActionEvent t) {
                //Comprobamos que no haya ningun jugador con mas de 15 puntos, si no es asi que se siga ejecutando
                if (rectangleJugador1.getPuntuacion() < 15 && rectangleJugador2.getPuntuacion() < 15) {
                    bolla1.cercle.setLayoutX(bolla1.cercle.getLayoutX() + deltaX);
                    bolla1.cercle.setLayoutY(bolla1.cercle.getLayoutY() + deltaY);
                    /*
                    Variables booleanas que comprueban si la pelota esta en alguno de los 4 bordes del panel teniendo
                    en cuenta su tamaño.
                     */
                    final boolean alLimitDret = bolla1.cercle.getLayoutX() >= (limits.getMaxX() - bolla1.cercle.getRadius());
                    final boolean alLimitEsquerra = bolla1.cercle.getLayoutX() <= (limits.getMinX() + bolla1.cercle.getRadius());
                    final boolean alLimitInferior = bolla1.cercle.getLayoutY() >= (limits.getMaxY() - bolla1.cercle.getRadius());
                    final boolean alLimitSuperior = bolla1.cercle.getLayoutY() <= (limits.getMinY() + bolla1.cercle.getRadius());
                    /*
                    Mientras que no haya impacto entre pelota y paleta de jugador, comprobamos si la pelota esta en el limite
                    de alguno de los dos lados, de ser asi el metodo sumarPunts se inicia. Este metodo se encarga de sumar
                    un punto al marcador del jugador y colocar la pelota en el medio del panel pero en una altuea aleatoria.
                     */
                    if (!comprovaImpacte(bolla1, rectangleJugador1, rectangleJugador2)) {
                        double aleatori = (Math.random() * 600.0);
                        if (alLimitDret) {
                            sumarPunts(contadorJugador1, contadorFX1, rectangleJugador1, (int) aleatori);
                        } else if (alLimitEsquerra) {
                            sumarPunts(contadorJugador2, contadorFX2, rectangleJugador2, (int) aleatori);
                        }
                    }
                    //Si la pelota esta en el limite superior o inferior esta rebotara
                    if (alLimitInferior || alLimitSuperior) {
                        deltaY *= -1;
                    }
                    //Else del If principal, en el cual si alguno de los jugadores tiene mas de 15 puntos la partida se acaba
                } else {
                    finalJoc(primaryStage);
                }

            }
        }));
        loop.setCycleCount(Timeline.INDEFINITE);
        //Lectura del teclado
        panell.setOnKeyPressed(x -> {
            if (x.getCode() == KeyCode.SPACE) {//Si la tecla pulsada es el ESPACIO
                loop.play();//Se inicia el juego
                menu.setText("");//El texto de Pulsar espacio para... desaparece
                panell.setOnKeyPressed(e -> {//Lectura de teclado para el movimiento de los jugadores
                    switch (e.getCode()) {
                        /*
                        Flecha arriba y abajo para el jugador2 (derecha) y W y S para el jugador1 (izquierda).
                        Cada vez que es pulsada una de estas teclas se comprueba mediante un metodo si el jugador ya ha
                        llegado al limite del panel, de ser asi no dejara al jugador seguir moviendose en esa direccion.
                         */
                        case UP -> {
                            if (!comprovaLimitSuperior(rectangleJugador2)) {
                                rectangleJugador2.mouAmunt();
                            }
                        }
                        case DOWN -> {
                            if (!comprovaLimiInferior(rectangleJugador2)) {
                                rectangleJugador2.mouAbaix();
                            }
                        }

                        case W -> {
                            if (!comprovaLimitSuperior(rectangleJugador1)) {
                                rectangleJugador1.mouAmunt();
                            }
                        }
                        case S -> {
                            if (!comprovaLimiInferior(rectangleJugador1)) {
                                rectangleJugador1.mouAbaix();
                            }
                        }
                    }
                });
            }
        });

    }

    /*
    Metodo en el cual si la pelota entra en contacto con alguno de los rectangulos de los jugadores devolvera true.
     */
    public boolean comprovaImpacte(Bolla bolla1, RectangleJugador rectangleJugador1, RectangleJugador rectangleJugador2) {
        if (bolla1.cercle.getBoundsInParent().intersects(rectangleJugador1.rectangle.getBoundsInParent()) || bolla1.cercle.getBoundsInParent().intersects(rectangleJugador2.rectangle.getBoundsInParent())) {
            deltaX *= -1;
            return true;
        }
        return false;
    }

    //Si el rectangulo del jugador llega al limite superior devolvera true
    public boolean comprovaLimitSuperior(RectangleJugador rectangleJugador) {
        final Bounds limits = panell.getBoundsInLocal();
        return rectangleJugador.rectangle.getLayoutY() <= limits.getMinY();
    }

    //Si el rectangulo del jugador llega al limite inferior devolvera true
    public boolean comprovaLimiInferior(RectangleJugador rectangleJugador) {
        final Bounds limits = panell.getBoundsInLocal();
        return rectangleJugador.rectangle.getLayoutY() >= (limits.getMaxY() - rectangleJugador.altRectangle);
    }

    /*
    Metodo que se encarga de sumar puntos, se le pasa como parametro, el contador especifico del jugador, el contadorFX
    que es un objeto de tipo texto (contador visual), el objeto del jugador y un numero aleatorio.
    El contadorFX es actualizado con los valores que tiene el contador integer, se le asigna la puntuacion a cada jugador
    con un metodo set, y la pelota es colocada en el centro del panel pero con una altura aleatoria.
     */
    public void sumarPunts(int contador, Text contadorFX, RectangleJugador rectangleJugador, int aleatori) {
        contador++;
        contador = contador + rectangleJugador.getPuntuacion();
        contadorFX.setText(String.valueOf(contador));
        rectangleJugador.setPuntuacion(contador);
        System.out.println(rectangleJugador.getPuntuacion());
        bolla1.cercle.relocate(amp / 2, aleatori);
    }

    /*
    Metodo que se encarga de crear una nueva escena en la cual se mostrara por pantalla un mensaje con el nombre del jugador
    que ha ganado y un mensaje de GAME OVER.
     */
    public void finalJoc(Stage primaryStage) {
        panell = new Pane();
        primaryStage.setScene(new Scene(panell, amp, alt));
        primaryStage.setTitle("GAME OVER");
        panell.setStyle("-fx-background-color: black");
        Text game_over = new Text("Game Over");
        //Estilos texto game over
        game_over.setFont(Font.font("Verdana", 80));
        game_over.relocate(amp / 4, alt / 2);
        game_over.setFill(Color.WHITE);
        panell.getChildren().add(game_over);
        //Condicional if que comprueba quien de los dos ha sido el ganador y lo muestra por pantalla.
        if (contadorJugador1 > contadorJugador2) {
            Text jugador1 = new Text("Jugador 1 WINS");
            jugador1.setFont(Font.font("Verdana", 30));
            jugador1.setFill(Color.WHITE);
            jugador1.relocate(amp / 3, alt / 4);
            panell.getChildren().add(jugador1);
        } else {
            Text jugador2 = new Text("Jugador 2 WINS");
            jugador2.setFont(Font.font("Verdana", 30));
            jugador2.setFill(Color.WHITE);
            jugador2.relocate(amp / 3, alt / 4);
            panell.getChildren().add(jugador2);
        }
    }

}



