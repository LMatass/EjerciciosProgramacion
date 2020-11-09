package EjerciciosCondicionales;
import java.util.Scanner;
//Realitza un programa que calcule el temps que tardarà un objecte en caure des d’una alçada h. Aplica la fórmula: t=2hgessent g=9.81m/s2
public class Ejercicio6 {
    public static void main (String[] args) {
        //Recoger informacion por teclado
        System.out.println("Introduzca la altura");
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(); //almacenamos la informcion del teclado en la variable h
        double g = 9.81;
        double resultadoRaiz = Math.sqrt(2*h/g);//Hacemos raiz de 2*h/g y la guardamos en variable
        System.out.println("El resultado es " + resultadoRaiz);
    }
}
