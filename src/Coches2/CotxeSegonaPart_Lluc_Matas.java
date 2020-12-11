package Coches2;/*
  Ejercicios
  
  Created by: Coches2

  GitHub: https://github.com/LMatass
    
  Date: 11/12/20
  
  Hora inicio: 17:47
  
  Descripción:  

*/

public class CotxeSegonaPart_Lluc_Matas extends Cotxe_Lluc_Matas{
    marxaAutomatic[] marxes = {marxaAutomatic.F, marxaAutomatic.N, marxaAutomatic.R};

    public CotxeSegonaPart_Lluc_Matas(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatsMotorCotxe) {
        super(marca, model, tipuscanvi, estatsMotorCotxe);
    }

    public void CanviarMarxaAutomatic(char a){
        while (TipusCanvi.CanviAutomatic.equals(tipuscanvi)){
            if (a == '+' && estatsMotorCotxe.equals(EstatsMotorCotxe.Aturat)){

            }
        }
    }
    public void CanviarMarxaManual(){

    }

}
