package sample;
//Mostra els números de 320 a 160, comptant de 20 en 20 cap endarrera utilitzant un bucle do / while
public class EjercicioSeis {
    public static void main (String [] args){
        int i = 320;
        do {
            System.out.println(i);
            i-=20;
        } while ( i >= 160);

    }
}
