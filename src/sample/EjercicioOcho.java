package sample;

import java.util.Scanner;
//Fes un programa que demana un nombre de 0 a 9 i que a continuació mostri la taula de multiplicació corresponent al nombre inserit.
// Si l’usuari introdueix un nombre diferent a 0-9, tornarà a demanar el nombre fins que s’introdueixi un nombre correcte.
public class EjercicioOcho {
    public static void main (String[] args){
        System.out.println("Introduzca un numero entre 0 y 9");
        Scanner sc = new Scanner(System.in);
        int numSc = sc.nextInt();
        if (numSc >= 0 && numSc <= 9) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i * numSc);
            }
        }
            else {
                while (numSc>=10){
                    System.out.println("Error, introduzca un numero entre 0 y 9");
                    numSc = sc.nextInt();
                }
            }
        }
    }

