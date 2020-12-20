package dates;/*
  Ejercicios
  
  Created by: dates

  GitHub: https://github.com/LMatass
    
  Date: 15/12/20
  
  Hora inicio: 19:16
  
  Descripción:  

*/

public class DiesEntreDates_Lluc_Matas extends CalcularDiesEntreDates {
        @Override
        /*
        * En este metodo tenmos una array que almacena los distintos dias que tiene
        * los distintos meses
        */
        protected int diesMes(int mes) {
            int[] diesmes = {31,28,31,30,31,30,31,31,30,31,30,31};
            return diesmes[mes - 1];
            }
        /*
        * Resta el numero de dias iniciales (introducidos por el usuario) a el numero de dias que tiene ese
        * mismo mes usando la funcion diesMes
        */
        @Override
        protected int diesMesInicial(DataXS dataXS) {
            int dies;
            dies = diesMes(dataXS.mes)- dataXS.dia;
            return  dies;
        }
        /*
         *Esta funcion nos devuelvo los dias de la fecha destino
         */
        @Override
        protected int diesMesDesti(DataXS dataXS) {
            return dataXS.dia;
        }
        /*
        * El bucle for se encarga de recorrer desde el mes inicial, hasta el ultimo mes (12), al recorrer
        * el bucle se van sumando los distintos dias de el mes (+31, +30 etc...)
        */
        @Override
        protected int diesResteAnyInicial(DataXS datainicial) {
            int dies = 0;
            for (int i = datainicial.mes; i <12 ; i++) {
                dies += diesMes(i);
            }
            return dies;
        }
        /*
         * Bucle while que cuenta los dias desde cualquier que sea mayor que enero y va restando en 1 los meses
         * hasta llegar a enero donde el bucle para, luego devuelve el numero de dias de todos los meses que ha
         * recorrido el bucle
         */
        @Override
        protected int diesResteAnyDesti(DataXS datadesti) {
            int dies = 0;
            datadesti.mes--;
            while(datadesti.mes >= 1){
                dies += diesMes(datadesti.mes);
                datadesti.mes--;
            }
            return dies;
        }
        /*
         * Metodo que calcula los dias totales de años completos, resta en 1 para no contar el año incompleto
         * y lo multiplica por 365 que son los dias de un año
         */
        @Override
        protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
            return ((datadesti.any - datainicial.any) -1) * 365;
        }
        /*
         * Este metodo es el encargado de contar y sumar los años bisiestos, para ello contamos con varios
         * condicionales if. Esto permite que solo se cuente si el mes inicial es menor o igual que 2 (Febrero)
         * siempre y cuando sea año bisiesto.
         * Dentro del condicional tenemos un bucle que recorre todos los años y aquellos que sean bisisestos
         * seran contabilizados con un contador.
         */
        @Override
        protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
            int contadorAnyTraspas = 0;

            if (datainicial.mes <= 2 && anyDeTraspas(datainicial.any)){
                contadorAnyTraspas++;
                for (int i = 0; i <= ((datadesti.any - datainicial.any) -1); i++) {
                    if (anyDeTraspas(datainicial.any + i)){
                        contadorAnyTraspas++;
                    }
                }
            }
            else {
                for (int i = 0; i <= ((datadesti.any - datainicial.any) -1); i++) {
                    if (anyDeTraspas(datainicial.any + i)){
                        contadorAnyTraspas++;
                    }
                }
                if (anyDeTraspas(datadesti.any)){
                    contadorAnyTraspas++;
                }
            }
            return contadorAnyTraspas;
        }
        /*
         *Metodo que comprueba si el año es bisiesto o no
         */
        @Override
        protected boolean anyDeTraspas(int any) {
            return any % 400 == 0 || ((any % 4 == 0) && !(any % 100 == 0));
        }
}
