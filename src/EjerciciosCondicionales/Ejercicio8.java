package EjerciciosCondicionales;
import java.util.Scanner;
//Sobre l’exercici 7, fes que a més a més ens digui la nota en caràcters (insuficient, suficient, bé, notable o excel·lent)
public class Ejercicio8 {
    public static void main (String[] args){
        System.out.println("Introduzca el valor de la primera nota");
        Scanner sc = new Scanner(System.in);
        double nota1 = sc.nextDouble();
        System.out.println("Introduzca el valor de la segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Introduzca el valor de la tercera nota");
        double nota3 = sc.nextDouble();
        double media = (nota1 + nota2 + nota3)/ 3; //Caluclo media aritmetca
           if (media<=4){ //Condicional, si la media es menor que 4, print insuficiente
               System.out.println("Insufciente");
           } else if (media>=5&& media<6){//Condicional, si la media es menor que X y mayor que X, printar X
               System.out.println("Suficiente");
           }
           else if (media>=6&& media<7){
               System.out.println("Bien");
           }
           else if (media>=7&& media<9){
               System.out.println("Notable");
           }
           else if (media>=9){
               System.out.println("Excelente");
           }
        System.out.println(media);
    }
}
