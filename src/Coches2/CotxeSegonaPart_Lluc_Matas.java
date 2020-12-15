package Coches2;/*
  Ejercicios
  
  Created by: Coches2

  GitHub: https://github.com/LMatass
    
  Date: 11/12/20
  
  Hora inicio: 17:47
  
  Descripción:  

*/

public class CotxeSegonaPart_Lluc_Matas extends Cotxe_Lluc_Matas{
    //Creacion de arrays de tipo enum
    marxaAutomatic[] marxesAutomatic = {marxaAutomatic.R, marxaAutomatic.N, marxaAutomatic.F};
    marxesManual[] marxaManual = {marxesManual.R, marxesManual.N, marxesManual.Primera, marxesManual.Segunda, marxesManual.Tercera, marxesManual.Cuarta, marxesManual.Quinta, marxesManual.Sexta};
    //Creacion del contador, este contador tiene la funcion de reccorer las posiciones de las arrays
    public short contador = 1;

    public CotxeSegonaPart_Lluc_Matas(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatsMotorCotxe) {
        super(marca, model, tipuscanvi, estatsMotorCotxe);
    }

    public void canviarMarxaAutomatic(char a) throws Exception {

        if (TipusCanvi.CanviAutomatic.equals(tipuscanvi)){
            if (a == '+' && estatsMotorCotxe.equals(EstatsMotorCotxe.EnMarxa) && contador < 7){
                contador++;
                this.marxaAutomaticActual = marxesAutomatic[contador];
            }
            else if (a == '-' && estatsMotorCotxe.equals(EstatsMotorCotxe.EnMarxa)){
                contador--;
                this.marxaAutomaticActual = marxesAutomatic[contador];
            }else {
                throw new Exception("Introduzca una marcha adecuada");
            }
        }
        else {
            throw new Exception("El motor no esta encendido, porfavor encienda el motor");
        }
    }

    public void canviarMarxaManual(char a) throws Exception {

        if (TipusCanvi.CanviManual.equals(tipuscanvi)){
            if (a == '+' && estatsMotorCotxe.equals(EstatsMotorCotxe.EnMarxa) && contador < 7){
                contador++;
                this.marxaManualActual = marxaManual[contador];
            }
            else if (a == '-' && estatsMotorCotxe.equals(EstatsMotorCotxe.Aturat)){
                contador--;
                this.marxaManualActual = marxaManual[contador];
            }else {
                throw new Exception("Introduzca una marcha adecuada");
            }
        }
        else {
            throw new Exception("El motor no esta encendido, porfavor encienda el motor");
        }
    }

}
