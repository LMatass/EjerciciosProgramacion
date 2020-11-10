package EjerciciosBucles;
import java.util.Scanner;
/*Fes un programa que calculi la mitjana d’un conjunt de nombres introduïts per teclat per l’usuari.
A priori no sabem quant de nombres hi haurà, però sabem que l’usuari indicarà que no vol inserir més nombres quan introdueixi un nombre negatiu. */
public class Ejercicio10 {
    public static void main(String[] args) {
        //Invocamos scanner
        Scanner sc = new Scanner(System.in);
        //Declaracion de variables
        boolean respuesta = false;
        double numGuardado = 0;
        int contador = 0;
            do {
                //Recogemos datos por teclado
                System.out.println("Introduzca un numero ");
                double numSc = sc.nextDouble();
                //Si el numero recodigo por teclado es mas grande que cero:
                if (numSc < 0)
                    respuesta = true; //Cambiar valor de variable booleana a true
                    numGuardado += numSc; //Sumar e igualar la variable numGuardado + numSc
                    contador++; //Aumentar el contador en 1
            }while (!respuesta);{ //cuando respuesta sea false, printar
                System.out.println("La media es " + numGuardado / contador);
        }
    }
}