package dates;/*
  Ejercicios
  
  Created by: dates

  GitHub: https://github.com/LMatass
    
  Date: 18/12/20
  
  Hora inicio: 13:01
  
  Descripción:  

*/

public class Test_DiasEntreDates_Lluc_Matas {
    public static void main(String[] args) throws Exception {
        DiesEntreDates_Lluc_Matas d1 = new DiesEntreDates_Lluc_Matas();
        DataXS data1 = new DataXS("15/07/1998");
        DataXS data2 = new DataXS("25/08/2025");
        System.out.println(d1.nombreDiesTotals(data1,data2));

    }
}
