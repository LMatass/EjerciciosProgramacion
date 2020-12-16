package Coches2;/*
  Ejercicios
  
  Created by: Coches2

  GitHub: https://github.com/LMatass
    
  Date: 11/12/20
  
  Hora inicio: 17:47
  
  Descripción:  

*/

//Creacion enums
enum marxaAutomatic{
    F,
    N,
    R
}
enum marxesManual {
    R,
    N,
    Primera,
    Segunda,
    Tercera,
    Cuarta,
    Quinta,
    Sexta
}

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
            }

            else {
                throw new Exception("Introduzca una marcha adecuada o encienda el coche"); //Lanza un error en el caso de que el caracter de la marcha no sea correcto o que el coche no este encendido
            }
        }

        else {
            throw new Exception("Su coche no es manual porfavor use el metodo que necesita su coche");//Lanza un error si se intenta usar un metodo que no corresponde, ejemplo usar canviarMarxaAutomatic en un manual
        }
    }

    public int velocitatActual() throws Exception {

        if (estatsMotorCotxe == EstatsMotorCotxe.EnMarxa) { //Condicional if que comprueba si el motor esta encendido

            if (marxaManualActual == marxesManual.Primera) { //Condicionales if que comprueban en que marcha esta el coche actualmente y dependediendo de la marcha generan un numero aleatorio entre dos numeros.
                this.velocidadActual = (int) (Math.random() * 40 + 1);
            } else if (marxaManualActual == marxesManual.Segunda) {
                this.velocidadActual = (int) (Math.random() * 80 + 40);
            } else if (marxaManualActual == marxesManual.Tercera) {
                this.velocidadActual = (int) (Math.random() * 120 + 80);
            } else if (marxaManualActual == marxesManual.Cuarta) {
                this.velocidadActual = (int) (Math.random() * 160 + 120);
            } else if (marxaManualActual == marxesManual.Quinta) {
                this.velocidadActual = (int) (Math.random() * 200 + 160);
            } else if (marxaManualActual == marxesManual.Sexta) {
                this.velocidadActual = (int) (Math.random() * 240 + 200);
            } else if (marxaManualActual == marxesManual.R) {
                this.velocidadActual = (int) (Math.random() * 40 + 1);
            }

            else {
                throw new Exception("El coche esta en punto muerto");//Si el coche no esta en ninunga de las anteriores marchas, damos por supuesto que esta en la marcha N, asi que lanzamos una excepcion
            }

        }

        else {
            throw new Exception("El coche no esta encendido");//Si no se cumple la primera condicion que es que el coche este encendido entonces lanzar excepcion diciendo que el coche no esta encendido.
        }

        return velocidadActual;
    }

}
