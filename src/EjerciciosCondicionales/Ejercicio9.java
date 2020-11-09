package EjerciciosCondicionales;
import java.util.Scanner;
//Fes un programa que resolgui una equació de segon grau (tipus ax2+bx+c=0
public class Ejercicio9 {
    public static void main (String[] args){
        System.out.println("Calculadora ecuaciones de 2grado tipo ax2+bx=c=0");

        //Recogida de datos teclado
        System.out.println("Introduzca el valor de A");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Introduzca el valor de B");
        int b =sc.nextInt();
        System.out.println("Introduzca el valor de C");
        int c =sc.nextInt();

        //Realiza formula ecuacion 2 grado
        double resultadoPositivo = (-b + (Math.sqrt(Math.pow(b, 2)-4*a*c))) / (2*a);
        double resultadoNegativo = (-b - (Math.sqrt(Math.pow(b, 2)-4*a*c)))/ (2*a);

       //Muestra por pantalla ambos resultados
        System.out.println(resultadoPositivo);
        System.out.println(resultadoNegativo);
    }
}
