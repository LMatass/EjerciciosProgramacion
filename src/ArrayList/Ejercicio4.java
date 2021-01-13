package ArrayList;/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 13/01/2021
  
  Hora inicio: 15:56
  
  Descripción:  Realitza un programa equivalent a l’anterior però en aquest cas, el programa ha d’ordenar paraules en lloc de nombres.


*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> palabras=  new ArrayList<>();//Creacion de arraylist
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {                 //Metodo for que realiza un bucle 9 veces el cual
            String n;                                  // pide al usuario una palabra y esta es guardada en un arraylist
            System.out.print("Introduzca su palabra: ");
            n = sc.nextLine();
            palabras.add(n);
        }
        Collections.sort(palabras);                    //ordena las palabras de alfabeticamente
        System.out.println(palabras);
    }
}
