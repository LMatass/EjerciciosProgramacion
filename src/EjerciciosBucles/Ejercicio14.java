package EjerciciosBucles;

import java.util.Scanner;

/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 11/11/20
  
  Hora inicio: 9:01
  
  Descripción:  Escriu un programa que demani dos nombres (sencers positius) que seran la base i l’exponent per a calcular la seva potència.
  Si detecta que qualsevol entrada no és un nombre correcte, donarà un missatge i s’aturarà.


*/
public class Ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Introduzca un numero entero y positivo");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro numero entero y positivo");
        int num2 = sc.nextInt();
        int resultadoPotencia = (int) Math.pow(num1, num2);
        System.out.println(resultadoPotencia);
    }
}
