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

        if (TipusCanvi.CanviAutomatic.equals(tipuscanvi)){//Condicional If que comprueba que el cambio es automatico
            if (a == '+' && estatsMotorCotxe.equals(EstatsMotorCotxe.EnMarxa) && contador < 3){//Condicional If que comprueba que el motor del coche este encendido y que el numero de marchas no supere el limite
                contador++;
                this.marxaAutomaticActual = marxesAutomatic[contador];//Asigna al valor de marcha actual el valor de la array en la posicion contador.
            }
            else if (a == '-' && estatsMotorCotxe.equals(EstatsMotorCotxe.EnMarxa) && contador > 0){//Condicional If que comprueba que el motor del coche este encendido y que el numero de marchas no es menor a 0
                contador--;
                this.marxaAutomaticActual = marxesAutomatic[contador];//Asigna al valor de marcha actual el valor de la array en la posicion contador.
            }else {
                throw new Exception("Introduzca una marcha adecuada o encienda el coche");//Lanza un error en el caso de que el caracter de la marcha no sea correcto o que el coche no este encendido
            }
        }
        else {
            throw new Exception("Su coche no es automatico porfavor use el metodo que necesita su coche");//Lanza un error si se intenta usar un metodo que no corresponde, ejemplo usar canviarMarxaManual en un automatico
        }
    }

    public void canviarMarxaManual(char a) throws Exception {

        if (TipusCanvi.CanviManual.equals(tipuscanvi)){//Condicional If que comprueba que el cambio es automatico
            if (a == '+' && estatsMotorCotxe.equals(EstatsMotorCotxe.EnMarxa) && contador < 7){//Condicional If que comprueba que el motor del coche este encendido y que el numero de marchas no supere el limite
                contador++;
                this.marxaManualActual = marxaManual[contador];//Asigna al valor de marcha actual el valor de la array en la posicion contador.
            }
            else if (a == '-' && estatsMotorCotxe.equals(EstatsMotorCotxe.Aturat) && contador > 0){ //Condicional If que comprueba que el motor del coche este encendido y que el numero de marchas no es menor a 0
                contador--;
                this.marxaManualActual = marxaManual[contador]; //Asigna al valor de marcha actual el valor de la array en la posicion contador.
            }else {
                throw new Exception("Introduzca una marcha adecuada o encienda el coche"); //Lanza un error en el caso de que el caracter de la marcha no sea correcto o que el coche no este encendido
            }
        }
        else {
            throw new Exception("Su coche no es manual porfavor use el metodo que necesita su coche");//Lanza un error si se intenta usar un metodo que no corresponde, ejemplo usar canviarMarxaAutomatic en un manual
        }
    }
}
