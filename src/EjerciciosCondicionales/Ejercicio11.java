package EjerciciosCondicionales;

import java.util.Scanner;

/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 11/11/20
  
  Hora inicio: 17:16
  
  Descripción:  Escriu un programa que donada una hora concreta (hores i minuts) calculi els segons que falten per arribar a mitjanit.


*/
public class Ejercicio11 {
    public static void main(String[] args) {
        //Lectura de datos por teclado, en este caso la hora deseada y los minutos
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la hora deseada");
        int hora = sc.nextInt();
        System.out.println("Introduzca los minutos deseados");
        int minuto = sc.nextInt();
        //Declaracion variables contadoras
        int contadorHora = 0;
        int contadorMinuto = 0;
        //Condicional if, cuando la hora sea mayor que 0 procedera al bucle while
        if (hora > 0) {
            while (hora < 24) {//Bucle while, cuando hora sea menor que 24, sumara a la variable hora +1 y a la variable contadorHora +1
                hora++;
                contadorHora++;
            }
        } else if (hora == 0){ //Si hora es igual a 0, accedemos al valor contadorHora y le asignamos el valor 23
            contadorHora = 23;
        }
        //Condicional if, cuando la hora sea mayor que 0 procedera al bucle while
        if (minuto > 0) {
            while (minuto < 60) {//Bucle while, cuando hora sea menor que 24, sumara a la variable hora +1 y a la variable contadorHora +1
                minuto++;
                contadorMinuto++;
            }
        } else if (minuto == 0){ //Si minuto es igual a 0, accedemos al valor contadorMinuto y le asignamos el valor 59
            contadorMinuto = 59;
            contadorHora--;
        }

        System.out.println("Faltan " + contadorHora + " horas y " + contadorMinuto + " minutos para que sea medianoche");
    }
}
