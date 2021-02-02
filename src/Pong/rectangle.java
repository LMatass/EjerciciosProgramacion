package Pong;/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 02/02/2021
  
  Hora inicio: 19:28
  
  Descripción:  

*/

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

class rectangle {
    class Posicio {
        int posX;
        int posY;

        public Posicio(int x, int y) {
            this.posX = x;
            this.posY = y;
        }
    }

    Posicio posicio;
    int radi;
    int velocitat = 10;
    Pane panell;
    Node rectangle;

    public rectangle(Pane panell, int posX, int posY) {
        posicio = new Posicio(posX, posY);
        this.panell = panell;
        this.rectangle = new Circle(posicio.posX - radi, posicio.posY - radi, radi, Color.BLUE);
        posicio.posX = 0;
        posicio.posY = 0;
        this.rectangle.setLayoutX(posicio.posX);
        this.rectangle.setLayoutY(posicio.posY);
        this.panell.getChildren().add(this.rectangle);
    }
    private void repinta() {
        this.rectangle.setLayoutX(posicio.posX);
        this.rectangle.setLayoutY(posicio.posY);
    }
    public void mouAmunt() {
        posicio.posY=posicio.posY-this.velocitat;
        this.repinta();
        System.out.println("Amunt pitjat");
    }

    public void mouAbaix() {
        posicio.posY=posicio.posY+this.velocitat;
        this.repinta();
        System.out.println("Abaix pitjat");
    }
}