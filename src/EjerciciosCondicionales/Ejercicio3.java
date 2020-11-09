package EjerciciosCondicionales;
import java.util.Scanner;

//Escriu un programa que donat un nombre del 1 al 7 escrigui el corresponent nom del dia de la setmana.

public class Ejercicio3 {
    public static void main (String[] args){
        System.out.println("Introduzca el numero de la semana mediante numeros (1 al 7)");
        Scanner sc = new Scanner(System.in);
        int numSc = sc.nextInt();
        String dia;
        //Condicional switch, si info teclado es X, respuesta X
        switch (numSc) {
            case 1 -> dia = "Lunes";
            case 2 -> dia = "Martes";
            case 3 -> dia = "Miercoles";
            case 4 -> dia = "Jueves";
            case 5 -> dia = "Viernes";
            case 6 -> dia = "Sabado";
            case 7 -> dia = "Domingo";
            default -> throw new IllegalStateException("Unexpected value: " + numSc);
        }
        System.out.println(dia); //Muestra por consola el dia de la semana
    }
}
