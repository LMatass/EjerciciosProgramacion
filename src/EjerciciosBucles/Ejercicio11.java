package EjerciciosBucles;
import java.util.Scanner;
/*Escriu un programa que mostri en tres columnes diferents, el quadrat i el cub dels 5 primers nombres sencers que l’usuari hagi introduït per teclat.
*/
public class Ejercicio11 {
    public static void main (String[] args){
        int[] array = new int[5];
        //Bucle for lee valores scanner y los añade a array
        for (int i = 0; i < 5; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca los numeros");
            array[i]=sc.nextInt();
        }
        //Bucle for printa valores array
        for (int i = 0; i < 5; i++){
            System.out.print("El cuadrado de " + array[i] + " es " + Math.pow(array[i], 2));
            System.out.println(" y el cubo de " + array[i] + " es " + Math.pow(array[i], 3));
        }
    }
}
