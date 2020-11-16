package EjerciciosClases;/*
  Ejercicios
  
  Created by: EjerciciosClases

  GitHub: https://github.com/LMatass
    
  Date: 16/11/20
  
  Hora inicio: 21:43
  
  Descripción:  Implementa la classe Cavall vista en un exercici anterior. Prova-la creant instàncies i aplicant-li qualcuns mètodes.

*/

public class Ejercicio8 {
    public static class Caballo{
        int edad;
        String nombre;
        String raza;
        int peso;
        char sexo;

        public void edad(int i) {
            edad = i;
        }

        public void nombre(String name) {
            nombre = name;
        }
    }
    public static void main(String[] args) {
        Caballo caballo = new Caballo();
        caballo.edad(5);
        caballo.nombre("Antonio");

        System.out.println(caballo.edad);
        System.out.println(caballo.nombre);
    }
}
