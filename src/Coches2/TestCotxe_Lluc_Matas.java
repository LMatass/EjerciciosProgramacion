package Coches2;/*
  Ejercicios
  
  Created by: Coches

  GitHub: https://github.com/LMatass
    
  Date: 9/12/20
  
  Hora inicio: 12:28
  
  Descripción:  

*/

public class TestCotxe_Lluc_Matas {
    public static void main(String[] args) {
        CotxeSegonaPart_Lluc_Matas cotxe1 = new CotxeSegonaPart_Lluc_Matas("Opel","Corsa", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.Aturat);
        System.out.println(cotxe1.marca);
        System.out.println(cotxe1.model);
        System.out.println(cotxe1.tipuscanvi);
        System.out.println(cotxe1.estatsMotorCotxe);
        cotxe1.canviarMarxaAutomatic('+');
        System.out.println(cotxe1.getMarxaAutomaticActual());
        cotxe1.canviarMarxaAutomatic('-');
        System.out.println(cotxe1.getMarxaAutomaticActual());
        cotxe1.canviarMarxaAutomatic('-');
        System.out.println(cotxe1.getMarxaAutomaticActual());

    }
}
