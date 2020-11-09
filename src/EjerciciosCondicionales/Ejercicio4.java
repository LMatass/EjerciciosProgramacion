package EjerciciosCondicionales;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main (String [] args){
        //Lectura teclado
        System.out.println("Introduzca el numero de horas trabajadas");
        Scanner sc = new Scanner(System.in);
        int horasTrabajadas = sc.nextInt();
        //Declaracion variable sueldo hora, final por que son constantes
        final double horasExtraordinarias = 16;
        final double horasOrdinarias = 12;
        //Condicional if, si los horas trabajadas son menor que 40, multiplicar por extraordinarias
            if (horasTrabajadas <= 40){
                System.out.println("El sueldo es de " + horasTrabajadas * horasExtraordinarias);
            } else { //Si las horas trabajadas no son menores que 40, restar 40 horas para saber las horas ordinarias a pagar y luego
                //sumar a la multiplicacion de las horas extraordinarias.
                System.out.println("El sueldo es de " + (((horasTrabajadas - 40) * horasOrdinarias) + (40 * horasExtraordinarias)) );
            }
    }
}
