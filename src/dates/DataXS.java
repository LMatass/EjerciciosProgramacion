package dates;/*
  Ejercicios
  
  Created by: dates

  GitHub: https://github.com/LMatass
    
  Date: 15/12/20
  
  Hora inicio: 19:13
  
  Descripción:  

*/

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class DataXS {
    private String dataEnString;
    int mes;
    int any;
    int dia;
    Boolean anyDeTraspas;

    /**
     * @param any Any del que es vol saber si és de traspàs
     * @return retorna vertader si és any de traspàs o sinó fals
     */
    public boolean calculaAnyDeTraspas(int any) {
        return (any % 400 == 0) || ((any % 4 == 0) && !(any % 100 == 0));
    }

    /**
     * @param data en format date que es vol convertir
     * @return  La data en format DataXS
     * @throws Exception Si la data té format incorrecte.
     */
    public DataXS convertirDatetoDataXS(Date data) throws Exception {
        Calendar calendari = new GregorianCalendar();
        calendari.setTime(data);
        this.any = calendari.get(GregorianCalendar.YEAR);
        this.mes = calendari.get(GregorianCalendar.MONTH) + 1;
        this.dia = calendari.get(GregorianCalendar.DATE);
        this.setDataEnString(this.dia, this.mes, this.any);
        this.anyDeTraspas = this.calculaAnyDeTraspas(this.any);
        return new DataXS(this.dataEnString);
    }

    @Override
    public String toString() {
        return this.dataEnString;
    }

    private void setDataEnString(int dia, int mes, int any) {
        this.dataEnString = String.format("%02d/%02d/%04d", dia, mes, any);
    }

    /**
     * @return La data actual en format DataXS
     * @throws Exception Si la data té format incorrecte.
     */
    public DataXS dataActual() throws Exception {
        Date da = new Date();
        return convertirDatetoDataXS(da);
    }

    /**
     * @throws Exception Si la data té format incorrecte.
     */
    public DataXS() throws Exception {
        this.dataActual();
    }

    public DataXS(String data) throws Exception {
        Exception e = new Exception("Data incorrecta o amb format incorrecte. Formats vàlids dd/mm/aaaa o aaaa/mm/dd");
        boolean formatAmerica;
        if (data.charAt(4) == '/' && data.charAt(7) == '/')
            formatAmerica = true;
        else if (data.charAt(2) == '/' && data.charAt(5) == '/') {
            formatAmerica = false;
        } else
            throw e;
        try {
            if (formatAmerica) {
                this.any = Integer.parseInt(data.substring(0, 4));
                this.mes = Integer.parseInt(data.substring(5, 7));
                this.dia = Integer.parseInt(data.substring(8, 10));
            } else {
                this.any = Integer.parseInt(data.substring(6, 10));
                this.mes = Integer.parseInt(data.substring(3, 5));
                this.dia = Integer.parseInt(data.substring(0, 2));
            }

            this.anyDeTraspas = this.calculaAnyDeTraspas(this.any);

            if (this.any < 0 || this.mes < 0 || this.dia < 0 || this.mes > 12 ||
                    (this.mes == 1 && this.dia > 31) ||
                    (this.mes == 2 && this.anyDeTraspas && this.dia > 29) ||
                    (this.mes == 2 && !this.anyDeTraspas && this.dia > 28) ||
                    (this.mes == 3 && this.dia > 31) ||
                    (this.mes == 4 && this.dia > 30) ||
                    (this.mes == 5 && this.dia > 31) ||
                    (this.mes == 6 && this.dia > 30) ||
                    (this.mes == 7 && this.dia > 31) ||
                    (this.mes == 8 && this.dia > 31) ||
                    (this.mes == 9 && this.dia > 30) ||
                    (this.mes == 10 && this.dia > 31) ||
                    (this.mes == 11 && this.dia > 30) ||
                    (this.mes == 12 && this.dia > 31)) {
                throw e;
            }
        } catch (Exception excepcio) {
            throw e;
        }
        this.setDataEnString(this.dia, this.mes, this.any);

    }
}