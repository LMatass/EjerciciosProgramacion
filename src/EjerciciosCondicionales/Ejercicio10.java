package EjerciciosCondicionales;

import java.util.Scanner;

/*
  Ejercicios
  
  Created by: Lluc Matas

  GitHub: https://github.com/LMatass
    
  Date: 11/11/20
  
  Hora inicio: 17:09
  
  Descripción:  Escriu un programa que ens digui l’horòscop al que es pertany a partir del dia i mes de naixement..

*/
public class Ejercicio10 {
    public static void main(String[] args) {
        //Leemos datos por teclado, y las almacenamos en las variables dia y mes
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el dia de su fecha de nacimiento");
        int dia = sc.nextInt();
        System.out.println("Introduzca el mes de su fecha de nacimiento");
        int mes = sc.nextInt();
        String horoscopo = "";//Inicializamos la variable horoscopo y la dejamos vacia
            switch(mes) {//Condicional switch en el que cada numero hace referencia al mes del año
                case 1:
                    if (dia < 21) {// Si, eres de enero y tu fecha de nacimento es menor que 21 eres capricornio
                        horoscopo = "capricornio";
                    } else {//Si tu dia de nacimiento es mayor a 21 entonces eres acuario.
                        horoscopo = "acuario";
                    }
                    break;
                case 2:
                    if (dia < 20) {
                        horoscopo = "acuario";
                    } else {
                        horoscopo = "piscis";
                    }
                    break;
                case 3:
                    if (dia < 21) {
                        horoscopo = "piscis";
                    } else {
                        horoscopo = "aries";
                    }
                    break;
                case 4:
                    if (dia < 21) {
                        horoscopo = "aries";
                    } else {
                        horoscopo = "tauro";
                    }
                    break;
                case 5:
                    if (dia < 20) {
                        horoscopo = "tauro";
                    } else {
                        horoscopo = "géminis";
                    }
                    break;
                case 6:
                    if (dia < 22) {
                        horoscopo = "géminis";
                    } else {
                        horoscopo = "cáncer";
                    }
                    break;
                case 7:
                    if (dia < 22) {
                        horoscopo = "cáncer";
                    } else {
                        horoscopo = "Leo";
                    }
                    break;
                case 8:
                    if (dia < 24) {
                        horoscopo = "leo";
                    } else {
                        horoscopo = "virgo";
                    }
                    break;
                case 9:
                    if (dia < 23) {
                        horoscopo = "virgo";
                    } else {
                        horoscopo = "libra";
                    }
                    break;
                case 10:
                    if (dia < 23) {
                        horoscopo = "libra";
                    } else {
                        horoscopo = "escorpio";
                    }
                    break;
                case 11:
                    if (dia < 23) {
                        horoscopo = "escorpio";
                    } else {
                        horoscopo = "sagitario";
                    }
                    break;
                case 12:
                    if (dia < 21) {
                        horoscopo = "sagitario";
                    } else {
                        horoscopo = "capricornio";
                    }
                    break;
                default:
            }
        System.out.println("Tu horoscopo es " + horoscopo);
        }

    }

