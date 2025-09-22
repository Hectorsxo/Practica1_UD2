package com.ieschabas;

public class Main {
    public static void main(String[] args) {
        //objeto Persona
        Persona persona1 = new Persona();

        /**
         * Asignacion de atributos al objeto persona1
         */
        persona1.setNombre(" Héctor");
        persona1.setApellidos("Crespo Buigues");
        persona1.setEdad(18);
        persona1.setDni("1020393989B");
        persona1.setTelefono("+34695683459");

        /**
         * Imprimir persona1
         */


        System.out.println(persona1.toString());

        /**
         * Creacion de persona2 con sus parametros
         */

        Persona persona2 = new Persona(18,"1020393989B","Héctor","Crespo Buigues","+34695683459");

        /**
         * Cambiar edad de persona1
         */

        persona1.setEdad(50);

        /**
         *Cambiamos nombre de persona 1
         */


        persona1.setNombre("Jesus");

        /**
         * Imprimir persona1 modificado y persona2
         */

        System.out.println(persona1.toString());

        System.out.println(persona2.toString());

        //Uso de la clase Rectangulo
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(2.4, 2.7);

        //Settear la base y altura del rectangulo1
        rectangulo1.setBase(5.2);
        rectangulo1.setAltura(6.2);

        System.out.println("Área del rectángulo 1: " + rectangulo1.calcularArea());
        System.out.println("Área del rectángulo 2: " + rectangulo2.calcularArea());

    }
}