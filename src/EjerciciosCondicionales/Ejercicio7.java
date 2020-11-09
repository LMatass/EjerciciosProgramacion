package EjerciciosCondicionales;
import java.util.Scanner;
//Fes un programa que calculi la mitjana aritmètica de tres notes.
public class Ejercicio7 {
    public static void main (String[] args){
        System.out.println("Introduzca el valor de la primera nota");
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        System.out.println("Introduzca el valor de la segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Introduzca el valor de la tercera nota");
        double nota3 = sc.nextDouble();
        System.out.println((nota1 + nota2 + nota3)/ 3 ); //Calculo media aritmetica y print por pantalla
    }
}
