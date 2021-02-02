package Parking;/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 23/01/2021
  
  Hora inicio: 17:03
  
  Descripción:  

*/


import java.util.Scanner;

public class Parking_Test_Lluc_Matas {
    /*
    Clase en la que el principal objetivo es poder probar y ejecutar el codigo.
     */
    public static void main(String[] args) throws Exception {
        Parking_Lluc_Matas parking_lluc_matas = new Parking_Lluc_Matas(30, 8);
        Scanner sc = new Scanner(System.in);
        boolean salida = false;
    /*
    Menu que usa un algoritmo de bandera, el cual recibe las interacciones por parte del usuario
    introduciendolas por teclado. Mediante un switch ejecuta los distintos metodos, dependiendo de
    la eleccion del usuario. La opcion numero 9 cambia el valor de la variable a true y finaliza el
    bucle y por lo tanto finaliza el programa.
     */
        while (!salida) {
            try {
                System.out.println("------------------------------------------------------");
                System.out.println("//////////////////Exercici Pàrking////////////////////");
                System.out.println("------------------------------------------------------");
                System.out.println("1. Omplir parking a partir de fitxer. ");
                System.out.println("2. Entrar cotxe. ");
                System.out.println("3. Entrar cotxe discapacitat.");
                System.out.println("4. Surtir cotxe.");
                System.out.println("5. Surtir cotxe discapacitat.");
                System.out.println("6. Guardar llistat de matricules en fitxer.");
                System.out.println("7. Sortir");

                int entrada;
                entrada = sc.nextInt();
                if (entrada <= 9) {
                    switch (entrada) {
                        case 1 -> {
                            if (args.length == 0) {
                                System.out.println("Introdueix una ruta valida.");
                                sc.nextLine();
                                String path = sc.nextLine();
                                parking_lluc_matas.llegirMatricules(path);
                            } else {
                                parking_lluc_matas.llegirMatricules(args[0]);
                            }
                        }
                        case 2 -> {
                            System.out.println("Escriviu la matricula del cotxe");
                            sc.nextLine();
                            String matricula = sc.nextLine();
                            parking_lluc_matas.entradaCotxe(matricula);
                        }
                        case 3 -> {
                            System.out.println("Escriviu la matricula del cotxe");
                            sc.nextLine();
                            String matriculaDiscapacitat = sc.nextLine();
                            parking_lluc_matas.entradaCotxeDiscapacitat(matriculaDiscapacitat);
                        }
                        case 4 -> {
                            System.out.println("Escriviu la matricula del cotxe");
                            sc.nextLine();
                            String matriculaSortirCotxe = sc.nextLine();
                            parking_lluc_matas.surtCotxe(matriculaSortirCotxe);
                        }
                        case 5 -> {
                            System.out.println("Escriviu la matricula del cotxe");
                            sc.nextLine();
                            String matriculaSortirCotxeDiscapacitat = sc.nextLine();
                            parking_lluc_matas.surtCotxeDiscapacitats(matriculaSortirCotxeDiscapacitat);
                        }
                        case 6 -> {
                            System.out.println("Introdueix una ruta valida.");
                            sc.nextLine();
                            String pathGuardar = sc.nextLine();
                            parking_lluc_matas.guardarMatricules(pathGuardar);
                        }
                        case 7 -> salida = true;
                    }
                } else throw new Exception("Introdueix un nombre valid");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

      /*
      Path exemple: C:\\Users\\skate\\IdeaProjects\\EjerciciosProgramacion\\src\\Parking\\matriculas.txt

      Cases prueba
      case 7 -> {
                            System.out.println("Introduiu un 1 si voleu veure les places ocupades normals i un 2 si voleu veure les places per discapacitats ");
                            sc.nextLine();
                            int resposta = sc.nextInt();
                            switch (resposta) {
                                case 1 -> parking_lluc_matas.getPlacesOcupades(TipusPlacesParking.No_Discapacitat);
                                case 2 -> parking_lluc_matas.getPlacesOcupades(TipusPlacesParking.Discapacitat);
                            }
                        }
                        case 8 -> {
                            System.out.println("Introduiu un 1 si voleu veure les places lliures normals i un 2 si voleu veure les places per discapacitats ");
                            sc.nextLine();
                            int respostaLliures = sc.nextInt();
                            switch (respostaLliures) {
                                case 1 -> {
                                    System.out.print("Hi ha un total de "
                                    );
                                    parking_lluc_matas.getPlacesLliures(TipusPlacesParking.No_Discapacitat);
                                    System.out.println(" places ocupades.");
                                }
                                case 2 -> parking_lluc_matas.getPlacesLliures(TipusPlacesParking.Discapacitat);
                            }
                        }
      */

