package EjerciciosBucles;
//Mostra els números de 320 a 160, comptant de 20 en 20 cap endarrera utilitzant un bucle while.

public class EjercicioCinco {
    public static void main (String[] args){
        int i=320;
        while(i >= 160){
            System.out.println(i);
            i -= 20;
        }
    }
}
