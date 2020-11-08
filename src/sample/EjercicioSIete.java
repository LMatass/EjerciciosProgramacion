package sample;
import java.util.Scanner;
public class EjercicioSIete {
    public static void main (String[] args){
        System.out.println("Introduzca contraseña");
        Scanner sc = new Scanner(System.in);
        int scPswd = sc.nextInt();
        int pswd = 1234;
        int intentos = 0;
            while (intentos <= 3){
                if (scPswd == pswd){
                    System.out.println("Correcto");
                    System.exit(1);
                }
                else{
                    System.out.println("Incorrecto");
                    intentos++;
                }
                System.out.println("Introduzca contraseña de nuevo");
                scPswd = sc.nextInt();
            }
        }
    }

