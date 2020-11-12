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
        //Lectura de datos por teclado
        System.out.println("Introduzca un numero entero y positivo");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Introduzca otro numero entero y positivo");
        int num2 = sc.nextInt();
        //Decalarion variable, num1 es la base y num2 es el exponente. La variable nos devuelve la potencia
        int resultadoPotencia = (int) Math.pow(num1, num2);
        //Si num1 es mayor que 0 y num2 es mayor que 0, significa q ambos numeros son positivos por lo tanto procede a dar el resultado
        if (num1 > 0 && num2 >0){
            System.out.println(resultadoPotencia);
        }//Si no cumplen la condicion de que son positivos entonces mostrar mensaje error.
        else {
            System.out.println("Error numero o numeros incorrectos, introduzca numeros positivos y enteros");
        }
    }
}
