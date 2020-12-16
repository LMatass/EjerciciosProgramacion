package Coches2;/*
  Ejercicios
  
  Created by: Coches

  GitHub: https://github.com/LMatass
    
  Date: 9/12/20
  
  Hora inicio: 12:28
  
  Descripción:  

*/

public class TestCotxe_Lluc_Matas {
    public static void main(String[] args) throws Exception {
        CotxeSegonaPart_Lluc_Matas cotxe1 = new CotxeSegonaPart_Lluc_Matas("Opel", "Corsa", TipusCanvi.CanviAutomatic, EstatsMotorCotxe.EnMarxa);
        CotxeSegonaPart_Lluc_Matas cotxe2 = new CotxeSegonaPart_Lluc_Matas("BMW", "M3 E46", TipusCanvi.CanviManual, EstatsMotorCotxe.EnMarxa);
        //Pruebas coche 1
        System.out.println("Cotxe 1, opel corsa automatic. Prova de marxes : ");
        cotxe1.canviarMarxaAutomatic('+');
        System.out.println(cotxe1.getMarxaAutomaticActual());
        cotxe1.canviarMarxaAutomatic('-');
        System.out.println(cotxe1.getMarxaAutomaticActual());
        cotxe1.canviarMarxaAutomatic('-');
        System.out.println(cotxe1.getMarxaAutomaticActual());

        //Pruebas coche 2
        System.out.println("Cotxe 2, BMW E46 manual. Prova de marxes : ");
        cotxe2.canviarMarxaManual('+');
        System.out.println(cotxe2.getMarxaManualActual());

        cotxe2.canviarMarxaManual('+');
        System.out.println(cotxe2.getMarxaManualActual());

        cotxe2.canviarMarxaManual('+');
        System.out.println(cotxe2.getMarxaManualActual());

        cotxe2.canviarMarxaManual('+');
        System.out.println(cotxe2.getMarxaManualActual());

        cotxe2.canviarMarxaManual('+');
        System.out.println(cotxe2.getMarxaManualActual());

        cotxe2.canviarMarxaManual('+');
        System.out.println(cotxe2.getMarxaManualActual());

        cotxe2.velocitatActual();
        System.out.println(cotxe2.getVelocidadActual() + " KMH");
    }
}
