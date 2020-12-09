package EjerciciosClases;/*
  Ejercicios
  
  Created by: EjerciciosClases

  GitHub: https://github.com/LMatass
    
  Date: 18/11/20
  
  Hora inicio: 8:21
  
  Descripción:  A continuació tens una llista en la qual estan barrejades diverses classes amb instàncies d'aquestes classes.
  Per posar-ho una mica més difícil, tots els elements estan escrits en minúscula. Digues quines són les classes, quines les instàncies,
  a quina classe pertany cadascuna d'aquestes instàncies i quina és la jerarquia entre les classes:
  paula, goofy, gardfiel, gos, mineral, cavall, tom, silvestre, pirita, rocinante, milu, snoopy, gat, pluto, animal, javier, bucéfalo, pegàs, ajudant_del_pare_noel, quars, laika,
  persona, pato_lucas.


*/

public class Ejercicio2 {
    public class Animal {
        public class Perro {
            public String name;
            public Perro(String name) {
                this.name = name;
            }
        }
        public class Caballo {
            public String name;
        }
        public class Gato {
            public String name;
        }

    }

    public class Mineral {
        public String name;
    }
    public class Persona {
        public String name;
    }
/*
    public static void main(String[] args) {
        Animal.Perro perro1 = new Animal.Perro();
        perro1.name = "Goofy";
        System.out.println(perro1);

    }*/
}
