package Parking;/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 23/01/2021
  
  Hora inicio: 17:01
  
  Descripción:  

*/

import java.io.*;
import java.util.HashMap;

enum TipusPlacesParking {
    Discapacitat,
    No_Discapacitat
}

public class Parking_Lluc_Matas {
    public int places_no_discapacitats;
    public int places_discapacitats;
    public int num_places_no_discapacitats = 0;
    public int num_places_discapacitats = 0;

    /*Se crean 2  hashmaps en los que se guardara un int que sera el numero de la plaza y un String
    que sera la matricula, cada hashmap corresponde a un tipo de vehiculo el de no discapacitados y
    el de discapacitados
     */
    HashMap<Integer, String> matricules_no_discapacitats = new HashMap<>();
    HashMap<Integer, String> matricules_discapacitats = new HashMap<>();

    public Parking_Lluc_Matas(int places_no_discapacitats, int places_discapacitats) {
        this.places_no_discapacitats = places_no_discapacitats;
        this.places_discapacitats = places_discapacitats;
    }

    /*
    En este metodo pasaremos un string que sera la direccion del archivo txt que este sera leido.
    Para gestionar las excepciones usamos un try catch, el metodo recorre las lineas del archivo
    que supuestamente son matriculas y estas son pasadas como parametro para iniciar los metodos
    de entrar un coche y entrar un coche discapacitado, se iniciara un metodo u otro dependiendo
    del numero generado aleatoriamente.
     */
    public void llegirMatricules(String path) throws Exception {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader bf = new BufferedReader(fr);
            String linea;
            int aleatori;
            while ((linea = bf.readLine()) != null) {
                aleatori = (int) (Math.random() * 10);
                if (aleatori > 1) {
                    entradaCotxe(linea);
                } else {
                    entradaCotxeDiscapacitat(linea);
                }
            }
            fr.close();

        } catch (FileNotFoundException e) {
            throw new Exception("ALERTA =====> Fitxer incorrecte o inexistent.");
        }
    }

    /*
    La principal funcion de este metodo es meter los coches en las plazas de no discapacitados,
    para ello le pasamos la matricula en forma de String como paremetro, se comprueba si la
    matricula tiene el formato correcto mediante el uso de una expresion regular, se comprueba
    si ese mismo coche(matricula) ya esta dentro del parking, de ser asi sera lanzada una
    excepcion. Se genera un numero aleatorio entre 0 y 10, en el caso de que sea menor que 1,
    un garrulo (no discapacitado) se metera en una plaza para discapacitados, en el caso de que
    el numero sea mayor de 1 se comprueba si hay plazas disponibles, si hay plazas el coche sera
    introducido en un HashMap en el cual la Key sera su numero de la plaza y el value sera su
    matricula. En el caso de que la ocupacion del parking supere el 85% se printara por pantalla
    una alerta avisando de ello.
     */
    public int entradaCotxe(String matricula) throws Exception {
        int aleatori = (int) (Math.random() * 10);
        if (matricula.matches("^[0-9]{4}[A-Z]{3}$")) {
            if (!matricules_no_discapacitats.containsValue(matricula)) {
                if (aleatori < 1) {
                    entradaCotxeDiscapacitat(matricula);
                    num_places_discapacitats++;
                    throw new Exception("ALERTA =====> Garrulo detected!!! Ha aparcat a la plaça: " + num_places_discapacitats);
                } else {
                    if (places_no_discapacitats > matricules_no_discapacitats.size()) {
                        matricules_no_discapacitats.put(num_places_no_discapacitats, matricula);
                        num_places_no_discapacitats++;
                        if ((matricules_no_discapacitats.size() * 100 / places_no_discapacitats) > 85) {
                            System.out.println("ALERTA =====> Ocupació de places per no discapacitats supera el 85%.");
                        }
                    } else throw new Exception("ALERTA =====> Parking per no discapacitats ple.");
                }
            } else throw new Exception("El cotxe ja està al parking. No pot entrar.");
        } else throw new Exception("ALERTA =====> Matrícula incorrecte.");
        System.out.println("Cotxes no discapacitats " + matricules_no_discapacitats);
        return num_places_no_discapacitats;
    }

    /*
    La principal funcion de este metodo es meter los coches en las plazas de discapacitados,
    siempre que existan plazas disponibles, de no ser asi el coche podra aparcar en una plaza
    de no discapacitado mientras existan plazas disponibles.
    Para ello le pasamos la matricula en forma de String como paremetro, se comprueba si la
    matricula tiene el formato correcto mediante el uso de una expresion regular, se comprueba
    si ese mismo coche(matricula) ya esta dentro del parking, de ser asi sera lanzada una
    excepcion.
    Si hay plazas el coche sera introducido en un HashMap en el cual la Key sera su numero de
    la plaza y el value sera su matricula. En el caso de que la ocupacion del parking supere
    el 85% se printara por pantalla una alerta avisando de ello.
     */
    public int entradaCotxeDiscapacitat(String matricula) throws Exception {
        if (matricula.matches("^[0-9]{4}[A-Z]{3}$")) {
            if (!matricules_discapacitats.containsValue(matricula)) {
                if (places_discapacitats > matricules_discapacitats.size()) {
                    matricules_discapacitats.put(num_places_discapacitats, matricula);
                    num_places_discapacitats++;
                    if ((matricules_discapacitats.size() * 100 / places_discapacitats) > 85) {
                        System.out.println("ALERTA =====> Ocupació de places per discapacitats supera el 85%.");
                    }
                } else if (places_discapacitats <= matricules_discapacitats.size() && places_no_discapacitats > matricules_no_discapacitats.size()) {
                    matricules_no_discapacitats.put(num_places_no_discapacitats, matricula);
                    System.out.println("Parking per discapacitats ple. Ha ocupat plaça normal num " + num_places_no_discapacitats);
                }
            } else throw new Exception("El cotxe ja està al parking. No pot entrar.");
        } else throw new Exception("ALERTA =====> Matrícula incorrecte.");
        System.out.println("Coches discapacitats " + matricules_discapacitats);
        return num_places_discapacitats;
    }

    /*
    Metodo que su principal funcion es de sacar el coche del parking de no discapacitados.
    Para ello se introduce la matricula en forma de String, se comprueba si la matricula
    tiene el formato correcto y si el coche(matricula) esta dentro del parking, de ser asi
    se elimina el el coche de la plaza dejandola libre.
     */
    public void surtCotxe(String matricula) throws Exception {
        if (matricula.matches("^[0-9]{4}[A-Z]{3}$")) {
            if (matricules_no_discapacitats.containsValue(matricula)) {
                matricules_no_discapacitats.values().remove(matricula);
            } else throw new Exception("El cotxe no és al parking.");
        } else throw new Exception("ALERTA =====> Matrícula incorrecte.");
        System.out.println(matricules_no_discapacitats);
    }

    /*
    Metodo que su principal funcion es de sacar el coche del parking de discapacitados.
    Para ello se introduce la matricula en forma de String, se comprueba si la matricula
    tiene el formato correcto y si el coche(matricula) esta dentro del parking, de ser asi
    se elimina el el coche de la plaza dejandola libre.
    */
    public void surtCotxeDiscapacitats(String matricula) throws Exception {
        if (matricula.matches("^[0-9]{4}[A-Z]{3}$")) {
            if (matricules_discapacitats.containsValue(matricula)) {
                matricules_discapacitats.values().remove(matricula);
            } else throw new Exception("El cotxe no és al parking.");
        } else throw new Exception("ALERTA =====> Matrícula incorrecte.");
        System.out.println(matricules_discapacitats);
    }

    /*
    Metodo que su principal funcion es devolver la cantidad de plazas ocupadas.
    Para ello se usa como parametro de entrada el parking de las plazas que queremos que se
    muestren. El metodo comprueba el parametro introducido y nos devuelve el numero total de
    plazas ocupadas de ese tipo de parking.
     */
    public int getPlacesOcupades(TipusPlacesParking tipus) throws Exception {
        if (tipus.equals(TipusPlacesParking.Discapacitat)) {
            System.out.println(matricules_discapacitats.size());
            return matricules_discapacitats.size();
        } else if (tipus.equals(TipusPlacesParking.No_Discapacitat)) {
            System.out.println(matricules_no_discapacitats.size());
            return matricules_no_discapacitats.size();
        } else throw new Exception("Introdueix un tipus de plaça de pàrquing correcte");
    }

    /*
    Metodo que su principal funcion es devolver la cantidad de plazas libres.
    Para ello se usa como parametro de entrada el parking de las plazas que queremos que se
    muestren. El metodo comprueba el parametro introducido y nos devuelve el numero total de
    plazas libres de ese tipo de parking.
     */
    public int getPlacesLliures(TipusPlacesParking tipus) throws Exception {
        if (tipus.equals(TipusPlacesParking.Discapacitat)) {
            System.out.println(places_discapacitats - matricules_discapacitats.size());
            return places_discapacitats - matricules_discapacitats.size();
        } else if (tipus.equals(TipusPlacesParking.No_Discapacitat)) {
            System.out.println(places_no_discapacitats - matricules_no_discapacitats.size());
            return places_no_discapacitats - matricules_no_discapacitats.size();
        } else throw new Exception("Introdueix un tipus de plaça de pàrquing correcte");
    }

    /*
    Metodo que su principial funcion es guardar en un fichero las matriculas del parking.
    Para ello se pasa como parametro un String que es la direccion del archivo donde se
    van a escribir las matriculas, comprueba si la direccion existe y escribe las distintas
    matriculas. Con \n conseguimos que solo escriba una matricula por cada fila.
    */
    public void guardarMatricules(String path) throws Exception {
        try {

            int index = path.lastIndexOf('.');
            if (index > 0) {
                String extension = path.substring(index + 1);
                if (extension.equals("txt")) {
                    File archivo = new File(path);
                    FileWriter escribir = new FileWriter(archivo, true);
                    for (String value : matricules_no_discapacitats.values()) {
                        escribir.write(value + "\n");
                    }
                    for (String value : matricules_discapacitats.values()) {
                        escribir.write(value + "\n");
                        escribir.close();
                    }
                }

            } else throw new Exception("ALERTA =====> Fitxer incorrecte o inexistent");
        } catch (FileNotFoundException e) {
            throw new Exception("ALERTA =====> Fitxer incorrecte o inexistent.");
        }
    }
}
