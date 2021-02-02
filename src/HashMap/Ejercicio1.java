package HashMap;/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 13/01/2021
  
  Hora inicio: 17:20
  
  Descripción:  Implementa el control d’accés a l’àrea restringida d’un programa. S’ha de demanar un nom d’usuari i una contrasenya.
   Si l’usuari introdueix les dades correctament, el programa dirà “Ha accedit a l’àrea restringida”.
   L’usuari tindrà un màxim de 3 oportunitats. Si s’esgoten les oportunitats el programa dirà “Ho sento, no té accés”.
   Els noms d’usuari i contrasenyes han d’estar emmagatzemats en una estructura de la classe HashMap.


*/

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;
public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Creacion del hashmap
        HashMap<String, String> login = new HashMap<>();
        //Anadiendo datos al hasmap
        login.put("lluc", "1234");
        login.put("lluc2", "12345");
        //Declaracion de variables
        int contador = 0;
        boolean salir = false;
        String keyValue = null;
        //Bucle while en forma de bandera
        while (!salir){
            if (contador < 4) {// Condicional if que limita los intentos a 3
                //Recopilacion de datos introducidos por teclado
                System.out.println("Introduzca su nombre de usuario: ");
                String userName = sc.nextLine();

                System.out.println("Introduzca su constrasena");
                String password = sc.nextLine();
                //Bucle for para iterar
                for(Entry<String, String> entry: login.entrySet()) {
                    //Condicional if que si el valor de la entrada es igual al value entonces nos dara la key
                    if(entry.getValue().equals(password)) {
                        keyValue = entry.getKey();
                        break;
                    }
                }

                if (userName.equals(keyValue)  && password.equals(login.get("lluc"))){
                    System.out.println("Ha accedit a l’àrea restringida");
                    salir = true;
                }
                else {
                    System.out.println("Ho sento, no té accés");
                }

                contador++;

            } else throw new Exception("Error, demasiados intentos");
        }
    }
}

