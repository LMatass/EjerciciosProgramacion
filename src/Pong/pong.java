
package Pong;/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 02/02/2021
  
  Hora inicio: 19:11
  
  Descripción:  

*/

import JavaFX.BollaTeclat;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class pong extends Application{
    public static Circle cercle;
    public static Pane canvas;
    public static Rectangle rectangle1;
    public static Rectangle rectangle2;
    public rectangle.Posicio posicio;
    public rectangle rectangle;


    /*
    // public static void main(String[] args) {
        launch(args);
    }
    */
    Pane panell = new Pane();
    double amp = 400;
    double alt = 400;
    public static void main(String[] args) {
        Application.launch(args);
    }
    public void start(Stage primaryStage) throws Exception {
        canvas = new Pane();
        final Scene escena = new Scene(canvas, 400, 400);

        primaryStage.setTitle("Bolla Rebotant");
        primaryStage.setScene(escena);
        primaryStage.show();

        int radi=15;
        cercle = new Circle(radi, Color.BLACK);
        cercle.relocate(200-radi, 200-radi);


        rectangle1=new Rectangle(5,60,Color.RED);
        rectangle1.relocate(0,30);

        rectangle2=new Rectangle(5,60,Color.BLUE);
        rectangle2.relocate(395,30);

        canvas.getChildren().addAll(cercle);
        canvas.getChildren().addAll(rectangle1);
        canvas.getChildren().addAll(rectangle2);

        primaryStage.setScene(new Scene(panell, amp, alt));
        primaryStage.setTitle("Bolla rebotant..");
        primaryStage.show();
        panell.requestFocus();
        rectangle rectangle1 =new rectangle(panell,200,200);

        panell.setOnKeyPressed(e -> {
            //case W:bolla1.mouDiagonal(); break;
            switch (e.getCode()) {
                case UP -> rectangle1.mouAmunt();
                case DOWN -> rectangle1.mouAbaix();
            }
        });

    }
}


