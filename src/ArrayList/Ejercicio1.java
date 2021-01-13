/*
  Ejercicios

  Created by: Lluc Matas

  GitHub: https://github.com/LMatass

  Date: 13/01/2021

  Hora inicio: 15:25

  Descripción:Crea un ArrayList amb el nom de 6 companys de classe. A continuació, mostra els noms per pantalla (extrets de l’ArrayList).
  Per fer-ho, utilitza un bucle que recorri tot l’ArrayList sense utilitzar cap índex.

*/
package ArrayList;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> alumnos=  new ArrayList<String>(); //Creacion de arraylist de tipo string
        //Anadimos valores a la array
        alumnos.add("Adan");
        alumnos.add("Gustavo");
        alumnos.add("Juanma");
        alumnos.add("Joshua");
        alumnos.add("Diego");
        alumnos.add("Ivan");
        //Recorremos la array y imprimimos todos los nombres
        for (String alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
