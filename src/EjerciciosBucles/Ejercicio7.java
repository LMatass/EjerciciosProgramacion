package EjerciciosBucles;
import java.util.Scanner;
/*Realitza el control d’accés a una caixa forta. La combinació ha de ser de 4 xifres. El programa ens demanarà la combinació. Si no encertem,
 ens mostrarà el missatge “Ho sentim, combinació incorrecta” i tornarà a demanar la combinació. Si encertem ens mostrarà “Combinació correcta” i acabarà.
 Tindrem 4 oportunitats per encertar la combinació.*/
public class Ejercicio7 {
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

