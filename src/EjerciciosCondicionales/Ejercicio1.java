package EjerciciosCondicionales;
import java.util.Scanner;
//Escriu un programa que demani per teclat un dia de la setmana (caràcters) i digui quina assignatura toca a primera hora d’aquell dia.
public class Ejercicio1 {
    public static void main (String [] args){
        //Arrays que nos guardan los valores, dia de la semana y asignatura
        String[] asignaturas = new String[]{"Fol", "Programación", "Sistemas"};
        String[] diasSemana = new String[]{"L", "M", "X", "J", "V"};

        System.out.println("Introduzca el dia de la semana de la siguiente forma: L M X J V");
        Scanner sc = new Scanner(System.in);
        String stringSc = sc.nextLine(); //Lectura scanner

        //Condicional, si es L, M o V respuesta FOL
            if (stringSc.equals(diasSemana[0]) || stringSc.equals(diasSemana[1]) || stringSc.equals(diasSemana[3])){
                System.out.println(asignaturas[0]);
                //Si es X, programacion
            } else if (stringSc.equals(diasSemana[2])){
                System.out.println(asignaturas[1]);
            }
                //Si es V, sistemas
              else if (stringSc.equals(diasSemana[4])){
                System.out.println(asignaturas[2]);
              }
    }
}
