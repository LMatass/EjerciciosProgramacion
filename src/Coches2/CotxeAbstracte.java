package Coches2;/*
  Ejercicios
  
  Created by: Coches

  GitHub: https://github.com/LMatass
    
  Date: 4/12/20
  
  Hora inicio: 17:34
  
  Descripción:  

*/

public abstract class CotxeAbstracte implements InterfaceCotxe {

        protected String marca;
        protected String model;
        protected TipusCanvi tipuscanvi;
        protected marxaAutomatic marxaAutomaticActual;
        protected marxesManual marxaManualActual;
        protected int velocidadActual;


    public CotxeAbstracte(String marca, String model, TipusCanvi tipuscanvi) {
            this.marca=marca;
            this.model=model;
            this.tipuscanvi=tipuscanvi;
        }

        public marxaAutomatic getMarxaAutomaticActual() {
            return marxaAutomaticActual;
        }

        public void setMarxaAutomaticActual(marxaAutomatic marxaAutomaticActual) {
            this.marxaAutomaticActual = marxaAutomaticActual;
        }
        public marxesManual getMarxaManualActual() {
            return marxaManualActual;
        }

        public int getVelocidadActual() {
            return velocidadActual;
        }

        public void setVelocidadActual(int velocidadActual) {
            this.velocidadActual = velocidadActual;
        }
        public void setMarxaManualActual(marxesManual marxaManualActual) {
            this.marxaManualActual = marxaManualActual;
        }
}
