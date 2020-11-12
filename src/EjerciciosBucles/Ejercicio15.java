package EjerciciosBucles;

import java.util.Scanner;

/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 12/11/20
  
  Hora inicio: 8:46
  
  Descripción:  Escriu un programa que donats dos nombres, un nombre real (base) anomenat base i un sencer positiu (exponent) anomenat exponent, 
  mostri totes potències de base des de 0 fins a exponent. Per exemples si base=2 i exponent=5, aleshores mostrarà 1, 2, 4, 8, 16, 32. 
  No podeu utilitzar funcions que implementin l’exponenciació. 


*/
public class Ejercicio15 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero entero y positivo");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextInt();
        System.out.println("Introduzca otro numero entero y positivo");
        int num2 = sc.nextInt();
        //Decalarion variable, num1 es la base y num2 es el exponente. La variable nos devuelve la potencia
        int resultadoPotencia = 0;
        /*Bucle for, donde tenemos i que es nuestro contador, cuando i es menor que exponente, entonces ejecuta el bucle, una vez finalizado el bucle
        se suma 1 a variable i.Cuando i es mas grande que exponente el bucle se para.
        */
        for (int i = 0; i < num2; i++) {
            resultadoPotencia = (int) Math.pow(num1, i);
            System.out.println(resultadoPotencia);//Pinta en pantalla cada vez que el bucle for es recorrido, potencia de base num1 y el exponente de la variable i
        }
    }
}
