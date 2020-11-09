package EjerciciosBucles;
import java.util.Scanner;
/*Fes un programa que calculi la mitjana d’un conjunt de nombres introduïts per teclat per l’usuari.
A priori no sabem quant de nombres hi haurà, però sabem que l’usuari indicarà que no vol inserir més nombres quan introdueixi un nombre negatiu. */
public class EjercicioDiez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean respuesta = false;
        double numGuardado = 0;
        int contador = 0;
            do {
                System.out.println("Introduzca un numero ");
                double numSc = sc.nextDouble();

                if (numSc < 0)
                    respuesta = true;
                    numGuardado += numSc;
                    contador++;
            }while (!respuesta);{
                System.out.println("La media es " + numGuardado / contador);
        }
    }
}