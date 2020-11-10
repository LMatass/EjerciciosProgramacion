package EjerciciosBucles;

import java.util.Scanner;
//Fes un programa que ens digui quants de dígits té un nombre introduït per teclat.
public class Ejercicio9 {
    public static void main (String [] args){
        System.out.println("Introduzca un numero ");
        Scanner sc = new Scanner(System.in);
        int numSc = sc.nextInt();
        int longitud = String.valueOf(numSc).length();
        System.out.println("El numero " + numSc + " tiene " + longitud + " digitos de longitud");
    }
}
