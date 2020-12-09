package EjerciciosBucles;

/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 13/11/20
  
  Hora inicio: 17:03
  
  Descripción:  Escriu un programa que digui si el nombre (sencer) que ens passen per paràmetre és un nombre primer.
  Un nombre primer és aquell que només és divisible per ell mateix i per 1.

*/
public class Ejercicio16 {
    public static void main(String[] args) {

        if (args.length==0) {
            System.out.println("Heu d'introduir un nombre enter com argument.");
        } else {

            int nombreIntroduit = Integer.parseInt(args[0]);

            boolean esPrimer = true;

            for (int i = 2; i < nombreIntroduit; i++) {
                if ((nombreIntroduit % i) == 0) {
                    esPrimer = false;
                }
            }

            if (esPrimer) {
                System.out.println("El nombre introduït és primer.");
            } else {
                System.out.println("El nombre introduït no és primer");
            }
        }
    }
}
