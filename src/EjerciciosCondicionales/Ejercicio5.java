package EjerciciosCondicionales;
import java.util.Scanner;
// Escriu un programa que resolgui una eqüació de primer grau (tipus ax+b=0).
public class Ejercicio5 {
    public static void main (String[] args) {
        //Recoger valores escritos por teclado
        System.out.println("Introduzca el valor de A");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Introduzca el valor de B");
        int b =sc.nextInt();
        System.out.println("Introduzca el valor de X");
        int x =sc.nextInt();
        //Realizar ecuacion de tipo a*x+b = 0
        System.out.println((-b)/(a*x));
    }
}
