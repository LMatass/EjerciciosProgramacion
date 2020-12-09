package EjerciciosClases;/*
  Ejercicios
  
  Created by: EjerciciosClases

  GitHub: https://github.com/LMatass
    
  Date: 17/11/20
  
  Hora inicio: 8:43
  
  Descripción:  Quins serien els atributs de la classe PilotDeFormula1? Se t'ocorren algunes instàncies d'aquesta classe?


*/

public class Ejercicio1 {
    public static class PilotDeFormula1 {
            //Atributos de clase
            String nombre;
            String equipo;
            int edad;
            int dorsal;
            int polePosition;
            //Instancia y metodo posicion.
            public boolean Posicion(int n){
                if (n == 1) {//Si n es igual a 1, sumar una pole al Piloto y posicion es igual a n.
                    polePosition++;
                    int posicion = n;
                }
                else {
                    int posicion = n;
                }
                return false;
            }
    }
    public static void main(String[] args) {
        PilotDeFormula1 piloto = new PilotDeFormula1();
        piloto.Posicion(10);
        System.out.println(piloto);
    }
}
