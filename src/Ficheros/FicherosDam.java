package Ficheros;/*
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 19/01/2021
  
  Hora inicio: 19:46
  
  Descripción:  

*/
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.util.Scanner;

public class FicherosDam {
    private BufferedReader lectura;
    private BufferedWriter escritura;
    public boolean respuestaEscribir;

    public void ficheros(String nom, @NotNull String modo) throws IOException {
        if (modo.equals("lectura")){
            this.lectura = new BufferedReader(new FileReader(nom));
        } else if (modo.equals("escritura")){
            this.escritura = new BufferedWriter(new FileWriter(nom));
        }
    }

    public boolean escribir(String texto){
        try {
            this.escritura.write(texto);
            this.escritura.close();
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }
    public void lectura(int lineas){
        try {
            String strCurrentLine;
            while ((strCurrentLine = lectura.readLine()) != null) {
                System.out.println(strCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        FicherosDam  test = new FicherosDam();
        test.ficheros("/home/alumnesmx/IdeaProjects/Programacion/testttt.txt", "escriure");
        System.out.println(test.escribir("prueba"));
    }
}
