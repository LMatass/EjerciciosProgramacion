package Coches;/*
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
        public CotxeAbstracte(String marca, String model, TipusCanvi tipuscanvi) {
            this.marca=marca;
            this.model=model;
            this.tipuscanvi=tipuscanvi;
        }

    }
