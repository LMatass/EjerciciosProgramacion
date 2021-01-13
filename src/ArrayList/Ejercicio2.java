/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 13/01/2021
  
  Hora inicio: 15:25
  
  Descripción: Realitza un programa que introdueixi n (essent n un nombre aleatori entre 10 i 20 ambdós inclosos) valors
  aleatoris (entre 0 i 100) en un ArrayList i després en calculi la suma, la mitjana, el màxim i el mínim d’aquests nombres.


*/
package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros=  new ArrayList<Integer>(); //Creacion de la arraylist de tipo Integer
        int n = (int) Math.floor(Math.random()*(20-10+1)+10);  //Numero random entre el 10 y 20 (ambos incluidos)
        int numerosSuma = 0;
        for (int i = 0; i < n; i++) {                          //Bucle for que va generando numeros aleatorios entre el 0 y 100
            int random = (int) Math.floor(Math.random()*(100));// y los va anadiendo a la arraylist en un total de n, que es el valor
            numeros.add(random);                               // aleatorio previamente generado.
            numerosSuma += numeros.get(i);
        }
        int media = numerosSuma / n;                           // Media de los numeros

        System.out.println(numeros);
        System.out.println(numerosSuma);
        System.out.println(media);
        System.out.println(Collections.max(numeros));
        System.out.println(Collections.min(numeros));
    }
}
