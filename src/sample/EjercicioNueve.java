package sample;

import java.util.Scanner;

public class EjercicioNueve {
    public static void main (String [] args){
        System.out.println("Introduzca un numero ");
        Scanner sc = new Scanner(System.in);
        int numSc = sc.nextInt();
        int longitud = String.valueOf(numSc).length();
        System.out.println("El numero " + numSc + " tiene " + longitud + " digitos de longitud");
    }
}
