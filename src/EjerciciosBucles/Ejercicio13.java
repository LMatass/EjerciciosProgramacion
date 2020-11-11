package EjerciciosBucles;

import java.util.Scanner;

/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 10/11/20
  
  Hora inicio: 9:02
  
  Descripción: Escriu un programa que llegeixi per paràmetres una llista de 10 nombres i calculi quants de nombres són positius i quants són negatius.
  Si detecta que qualsevol entrada no és un nombre sencer positiu o negatiu, donarà un missatge i s’aturarà.

*/
public class Ejercicio13 {
    public static void main(String[] args) {
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int[] array = new int[10];
        //Bucle for lee valores scanner y los añade a array
        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca los numeros");
            array[i] = sc.nextInt();
        }
        //Bucle for, lee los valores de la array
        for (int i = 0; i < 10; i++){
            if (array[i] >= 0) { //Condicional if, si el numero de la array que esta en la posicion i, es mayor o igual que cero (positivo), entonces sumar al contadorPositivos 1
                contadorPositivos++;
            } else if (array[i]< 0){
                contadorNegativos++;//Condicional if, si el numero de la array que esta en la posicion i,es menor que 0 (negativo), entonces sumar al contadorNegativos 1
            } else {
                System.out.println("Error, introduzca un valor valido");//Si ninguna de las anteriores condiciones se cumple, mostrar este error
            }
        }//Printar por pantalla el resultado final
        System.out.println("El numero de numeros positivos es " + contadorPositivos + "y el numero de negativos es " + contadorNegativos);
    }
}
