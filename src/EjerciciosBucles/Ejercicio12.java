package EjerciciosBucles;

import java.util.Scanner;

/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 10/11/20
  
  Hora inicio: 8:39
  
  Descripción:  Escriu un programa que mostri els n primers termes de la successió (série) de Fibonacci i el nombre n ha de ser introduït per teclat

*/
public class Ejercicio12 {
    public static void main(String[] args) {
        //Lectura datos teclado
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cuantos numeros de la serie fibonacci quiere monstrar");
        int n = sc.nextInt();
        //Declaracion variables para serie fibonacci
        int f = 0;
        int t1 = 1;
        int t2;
        //Bucle for donde realiza la serie fibonacci, donde n es el numero introducido por teclado y limita el bucle
        for (int i = 0; i <= n; i++) {
            t2 = f;
            f = t1  + f;
            t1 = t2;
            System.out.println(t1);
        }
    }
}
