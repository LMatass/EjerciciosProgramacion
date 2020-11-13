package EjerciciosClases;

/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 13/11/20
  
  Hora inicio: 18:26
  
  Descripción:  

*/
public class Ejercicio1 {
    public  class Prueba {
        int numEntero;
        char caracter;
        public boolean imprimir() {
            System.out.println(numEntero);
            System.out.println(caracter);
            return false;
        }
    }
    public  class Test {
        public void main(String[] args) {
            Prueba imprimir2 = new Prueba();
            System.out.println(imprimir2.imprimir());;
        }

    }
}
