package EjerciciosCondicionales;

import java.util.Scanner;

/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 11/11/20
  
  Hora inicio: 17:43
  
  Descripción:  Realitza un programa que faci un petit qüestionari amb 10 preguntes tipus test sobre les assignatures que s’imparteixen al CF.
  Cada pregunta encertada sumarà un punt.
  El programa mostrarà al final del qüestionari la qüalificació. Passeu el vostre

*/
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crear arrays donde estaran guardadas las preguntas, las respuestas correctas y las respiuestas del usuario
        String [] arrayPreguntas ={"Pregunta 1","Pregunta 2","Pregunta 3","Pregunta 4","Pregunta 5","Pregunta 6","Pregunta 7","Pregunta 8","Pregunta 9","Pregunta 10",};
        int[] arrayRespuestas = {1, 2, 1, 2, 1, 1, 2, 1, 2, 2};
        int[] array = new int[10];

        //Variable contador incializada
        int contador = 0;

        //Bucle for:
        for (int i = 0; i < 10; i++) { //Realiza 10 veces el bucle, se va incrementando el valor de i cada vez que el bucle se completa.
            System.out.println(arrayPreguntas[i]);//Muestra por pantalla la pregunta en la posicion i, la cual se va incrementando
            System.out.println("Introduzca su respuesta, 1 Verdadero y 2 Falso");
            //Recoge la respuesta y la almacena en posicion i
            array[i] = sc.nextInt();
            //Condicional if dentro del bulce for
                if (arrayRespuestas[i] == array[i]){//Si la respuesta correcta es igual a la respuesta del usuario:
                    contador++;//Incrementa el contador en 1
                }
        }
        System.out.println("Su puntuacion es un " + contador);//Printar por pantalla el contador con la nota del test
    }
}
