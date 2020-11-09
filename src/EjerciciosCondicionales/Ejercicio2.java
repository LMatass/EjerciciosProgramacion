package EjerciciosCondicionales;
import java.util.Scanner;

/* Escriviu un programa que mostri “Bon dia”, “Bona tarda”, “Bon vespre” o “Bona nit” segons la hora que s’introdueixi per teclat.
De 6 a 12, bon dia; de 13 a 19, bona tarda; de 20 a 22, bon vespre i de 23 a 5, bona nit. Basta s’introdueixin les hores.
No es necessari considerar els minuts.
*/

public class Ejercicio2 {
    public static void main (String[] args){
        //Recoger informacion teclado
        System.out.println("Introduzca su hora actual");
        Scanner sc = new Scanner(System.in);
        int horaSc = sc.nextInt(); //Informacion teclado guardada en una variable
        //Condicional si la hora es mayor que X pero menor que X, printar X
        if (horaSc >= 6 && horaSc <= 12){
            System.out.println("Bon dia");
        } else if (horaSc >= 13 && horaSc <= 19){
            System.out.println("Bona tarda");
        } else if (horaSc >= 20 && horaSc <= 22){
            System.out.println("Bon vespre");
        } else{ //Si la hora no esta entre las condiciones previas(23 > Y < 4), printar Bona nit.
            System.out.println("Bona nit");
        }
    }
}
