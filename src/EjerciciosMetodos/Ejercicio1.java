package EjerciciosMetodos;/*
  Ejercicios
  
  Created by: EjerciciosMetodos

  GitHub: https://github.com/LMatass
    
  Date: 18/11/20
  
  Hora inicio: 16:35
  
  Descripción:  (Càrrecs d’estacionament) Un garatge cobra una tarifa mínima de 2,00 dòlars per estacionar fins a tres hores.
  El garatge cobra 0,50 dòlars addicionals per hora per cada hora o part d’ella per sobre de tres hores.
  El càrrec màxim per a un període de 24 hores és de 10,00 USD. Podem suposar que no hi haurà cotxes aparcats durant més de 24
  hores. Escriviu una aplicació que calculi i mostri les despeses d’aparcament del garatge.
  Haureu d'introduir les hores estacionades per a cada client. El programa hauria de mostrar el càrrec del client actual i ha de
  calcular i mostrar el total actual acumulat. Heu de crear el mètode calculateCharges per determinar el càrrec per a cada client.


*/

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // 0 a 3 horas = 2 dolares, 0,5 dolares mas por cada hora o parte de ella hasta un maximo de 10 dolares. No habra coches aparcados por mas de 24 horas
        Scanner sc = new Scanner(System.in);
        int numHoras;

    }
    public static double calculateCharges(int numHoras) {
        double dinero = 0;
        if (numHoras <= 3){
            dinero = 2;
        }else if (numHoras > 3 && numHoras <25){
            for (int i = 0; i < numHoras ; i++) {
                dinero += 0.50;
            }
        }
        return dinero;
    }


}
