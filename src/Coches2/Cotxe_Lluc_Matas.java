package Coches2;/*
  Ejercicios
  
  Created by: Coches

  GitHub: https://github.com/LMatass
    
  Date: 9/12/20
  
  Hora inicio: 12:27
  
  Descripción:  

*/

//Creacion de la subclase, clase padre Cotxe abstracte
public class Cotxe_Lluc_Matas extends CotxeAbstracte implements InterfaceCotxe {



    protected EstatsMotorCotxe estatsMotorCotxe;                    //Declaracion de la variable del estado del motor, de la clase EstatsMotorCotxe

    public Cotxe_Lluc_Matas(String marca, String model, TipusCanvi tipuscanvi, EstatsMotorCotxe estatsMotorCotxe ) { //Creacion del objeto con sus atributos
        super(marca, model, tipuscanvi);
        this.estatsMotorCotxe = estatsMotorCotxe;
    }

    @Override
    public void arrancarMotor() throws Exception {                  //Metodo arrancar motor, si el motor se encuentra apagado entonces,este cambiara a EnMarxa
        if (estatsMotorCotxe.equals(EstatsMotorCotxe.Aturat)){
            estatsMotorCotxe = EstatsMotorCotxe.EnMarxa;
        } else if (estatsMotorCotxe.equals(EstatsMotorCotxe.EnMarxa)){
            throw new Exception("El coche ya esta en marcha");      //Si el motor ya esta enMarxa entonces nos saltara un mensaje de que ya esta encencido.
        }
    }

    public EstatsMotorCotxe getEstatsMotorCotxe() {
        return estatsMotorCotxe;                                    //COn este getter, conseguimos el estado del motor del coche
    }
    public void setEstatsMotorCotxe(EstatsMotorCotxe estatsMotorCotxe) {
        this.estatsMotorCotxe = estatsMotorCotxe;
    }

    @Override
    public EstatsMotorCotxe comprovaMotor() {                       //Este metodo nos devuelve el estado del motor del coche.
        return getEstatsMotorCotxe();
    }

    @Override
    public int getRevolucions() {                                   //Este metodo nos devolvera las revoluciones por minuto del coche si:
        if (estatsMotorCotxe.equals(EstatsMotorCotxe.EnMarxa)) {    //Si el motor esta encendido
            return (int) (Math.random() * 6500) + 1;                //Nos devolvera un numero entero aleatorio del 1 al 6500
        } else{
            return 0;                                               //Si el coche no esta encendido entonces nos devolvera 0
        }

    }

    @Override
    public void aturarMotor() throws Exception {                    //Metodo para apagar el motor del coche
        if (estatsMotorCotxe.equals(EstatsMotorCotxe.EnMarxa)){     //Si el motor esta enMarxa entonces, cambiamos el estado del motor a Aturat
            estatsMotorCotxe = EstatsMotorCotxe.Aturat;
        } else{
            throw new Exception("El coche ya esta apagado");        //SI el coche no esta encendido entonces mostramos un mensaje diciendo que ya esta apagado.
        }
    }

}
