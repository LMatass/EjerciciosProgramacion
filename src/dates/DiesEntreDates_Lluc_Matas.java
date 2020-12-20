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
        protected int diesMes(int mes) {
            int[] diesmes = {31,28,31,30,31,30,31,31,30,31,30,31};
            return diesmes[mes - 1];
            }

        @Override
        protected int diesMesInicial(DataXS dataXS) {
            int dies = 0;
            dies = diesMes(dataXS.mes)- dataXS.dia;
            return  dies;
        }

        @Override
        protected int diesMesDesti(DataXS dataXS) {
            return dataXS.dia;
        }

        @Override
        protected int diesResteAnyInicial(DataXS datainicial) {
            int dies = 0;
            for (int i = datainicial.mes; i <12 ; i++) {
                dies += diesMes(i);
            }
            return dies;
        }

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

        @Override
        protected int diesNumAnysComplets(DataXS datainicial, DataXS datadesti) {
            return ((datadesti.any - datainicial.any) -1) * 365;
        }

        @Override
        protected int numDiesPerAnysdeTraspas(DataXS datainicial, DataXS datadesti) {
            int contadorAnyTraspas = 0;

            if (datainicial.mes <= 2 && anyDeTraspas(datainicial.any) && datainicial.dia <= 28){
                contadorAnyTraspas++;
                for (int i = 0; i <= ((datadesti.any - datainicial.any) -1); i++) {
                    if (anyDeTraspas(datainicial.any + i)){
                        contadorAnyTraspas++;
                    }
                }
                if (anyDeTraspas(datadesti.any)){
                    contadorAnyTraspas++;
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

        @Override
        protected boolean anyDeTraspas(int any) {
            return any % 400 == 0 || ((any % 4 == 0) && !(any % 100 == 0));
        }
}
