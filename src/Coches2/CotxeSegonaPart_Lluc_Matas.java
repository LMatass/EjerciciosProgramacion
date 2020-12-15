package Coches2;/*
  Ejercicios
  
  Created by: Coches2

  GitHub: https://github.com/LMatass
    
  Date: 11/12/20
  
  Hora inicio: 17:47
  
  Descripción:  

*/

public class CotxeSegonaPart_Lluc_Matas extends Cotxe_Lluc_Matas{

    marxaAutomatic[] marxesAutomatic = {marxaAutomatic.R, marxaAutomatic.N, marxaAutomatic.F};
    marxesManual[] marxaManual = {marxesManual.R, marxesManual.N, marxesManual.Primera, marxesManual.Segunda, marxesManual.Tercera, marxesManual.Cuarta, marxesManual.Quinta, marxesManual.Sexta};
    public short contador = 1;

    public CotxeSegonaPart_Lluc_Matas(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatsMotorCotxe) {
        super(marca, model, tipuscanvi, estatsMotorCotxe);
    }

    public marxaAutomatic canviarMarxaAutomatic(char a){

        if (TipusCanvi.CanviAutomatic.equals(tipuscanvi)){
            if (a == '+' && estatsMotorCotxe.equals(EstatsMotorCotxe.Aturat)){
                contador++;
                this.marxaAutomaticActual = marxesAutomatic[contador];
            }
            else if (a == '-' && estatsMotorCotxe.equals(EstatsMotorCotxe.Aturat)){
                contador--;
                this.marxaAutomaticActual = marxesAutomatic[contador];
            }
        }
        return marxaAutomaticActual;
    }

    public void canviarMarxaManual(char a){

        if (TipusCanvi.CanviManual.equals(tipuscanvi)){
            if (a == '+' && estatsMotorCotxe.equals(EstatsMotorCotxe.Aturat)){
                contador++;
                this.marxaManualActual = marxaManual[contador];
            }
            else if (a == '-' && estatsMotorCotxe.equals(EstatsMotorCotxe.Aturat)){
                contador--;
                this.marxaManualActual = marxaManual[contador];
            }
        }
    }

}
