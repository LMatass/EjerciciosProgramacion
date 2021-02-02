package JavaFX;/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 29/01/2021
  
  Hora inicio: 17:24
  
  Descripción:  

*/

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BollaRebotant1 extends Application {

    class Bolla {
        public double deltaX;
        public double deltaY;
        Circle cercle;

        public Bolla(int radi, Color color) {
            this.cercle = new Circle(radi, color);
            this.deltaX = 1;
            this.deltaY = 1;
        }
    }

    public static Pane canvas;
    double amp = 1920;
    double alt = 1080;
    int radi_bolles = 60;
    Bolla bolla1;
    Bolla bolla2;


    public static void main(String[] args) {
        Application.launch(args);
    }

    public void movimentBolla(Bolla bolla) {
        bolla.cercle.setLayoutX(bolla.cercle.getLayoutX() + bolla.deltaX);
        bolla.cercle.setLayoutY(bolla.cercle.getLayoutY() + bolla.deltaY);

        final Bounds limits = canvas.getBoundsInLocal();
        final boolean alLimitDret = bolla.cercle.getLayoutX() >= (limits.getMaxX() - bolla.cercle.getRadius() - bolla.deltaX);
        final boolean alLimitEsquerra = bolla.cercle.getLayoutX() <= (limits.getMinX() + bolla.cercle.getRadius() - bolla.deltaX);
        final boolean alLimitInferior = bolla.cercle.getLayoutY() >= (limits.getMaxY() - bolla.cercle.getRadius() - bolla.deltaY);
        final boolean alLimitSuperior = bolla.cercle.getLayoutY() <= (limits.getMinY() + bolla.cercle.getRadius() - bolla.deltaY);

        if (alLimitDret || alLimitEsquerra) {
            modificaTrajectoriaX(bolla);
        }
        if (alLimitInferior || alLimitSuperior) {
            modificaTrajectoriaY(bolla);
        }
    }

    public boolean comprovaImpacte(Bolla bolla1, Bolla bolla2) {
        if (bolla1.cercle.getBoundsInParent().intersects(bolla2.cercle.getBoundsInParent())) {
            System.out.println("Impacte");
            modificaTrajectoriaX(bolla1);
            modificaTrajectoriaY(bolla1);
            modificaTrajectoriaX(bolla2);
            modificaTrajectoriaY(bolla2);
            return true;
        }
        return false;
    }

    public void modificaTrajectoriaX(Bolla bolla) {
        //bolla.deltaX = Math.signum(bolla.deltaX)*(int)(Math.random()*10+1);
        bolla.deltaX *= -3;
    }

    public void modificaTrajectoriaY(Bolla bolla) {
        //bolla.deltaY = Math.signum(bolla.deltaY)*(int)(Math.random()*10+1);
        bolla.deltaY *= -3;
    }

    public void comprovaBolles(Bolla bolla1, Bolla bolla2) {
        comprovaImpacte(bolla1, bolla2);
        movimentBolla(bolla1);
        movimentBolla(bolla2);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        canvas = new Pane();
        final Scene escena = new Scene(canvas, amp, alt);

        primaryStage.setTitle("Bolla Rebotant");
        primaryStage.setScene(escena);
        primaryStage.show();

        //bolla1 = new Circle(radi_bolles, Color.BLUE);
        //bolla2 = new Circle(radi_bolles, Color.RED);
        bolla1 = new Bolla(radi_bolles, Color.LIME);
        bolla2 = new Bolla(radi_bolles, Color.RED);
        bolla1.cercle.relocate(100, 100);
        bolla2.cercle.relocate((int) (Math.random() * amp) - radi_bolles, (int) (Math.random() * alt) - radi_bolles);
        //bolla2.cercle.relocate(200, 100);


        canvas.getChildren().add(bolla1.cercle);
        canvas.getChildren().add(bolla2.cercle);

        final Timeline loop = new Timeline(new KeyFrame(Duration.millis(10), new EventHandler<ActionEvent>() {

            @Override
            public void handle(final ActionEvent event) {
                comprovaBolles(bolla1, bolla2);
            }
        }));
        loop.setCycleCount(Timeline.INDEFINITE);
        loop.play();
    }
}