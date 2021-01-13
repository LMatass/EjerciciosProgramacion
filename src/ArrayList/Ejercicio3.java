package ArrayList;/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 13/01/2021
  
  Hora inicio: 15:48
  
  Descripción:  Escriu un programa que ordeni 10 nombres enters introduïts per teclat i emmagatzemats en un objecte de la classe ArrayList.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros=  new ArrayList<Integer>(); //Creacion de arraylist
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {                         //Metodo for que realiza un bucle 9 veces el cual
            int n;                                             // pide al usuario un numero entero y este es guardado
            System.out.print("Introduzca un número entero: "); // en un arraylist
            n = sc.nextInt();
            numeros.add(n);
        }
        Collections.sort(numeros);                             //Se ordenan los numeros de la arraylist de menor a mayor
        System.out.println(numeros);
    }
}

