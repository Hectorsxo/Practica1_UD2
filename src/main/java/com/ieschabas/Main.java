package com.ieschabas;

/**
 * Práctica 1 unidad 2 de Progrmación
 * @author Hector Crespo
 * @version 1.0
 */
public class Main {

    /**
     * Conatructor por defecto de Main
     */
    public Main() {
    }

    /**
     * static void main
     * @param args argumentos
     */

    public static void main(String[] args) {
        /**
         * Uso de la clase Persona.
         */


        Persona persona1 = new Persona();

        //Asignacion de atributos al objeto persona1.
        persona1.setNombre(" Héctor");
        persona1.setApellidos("Crespo Buigues");
        persona1.setEdad(18);
        persona1.setDni("1020393989B");
        persona1.setTelefono("+34695683459");

        //Imprimir persona1
        System.out.println(persona1.toString());


        //Creacion de persona2 con sus parametros.
        Persona persona2 = new Persona(18,"1020393989B","Héctor","Crespo Buigues","+34695683459");

        //Cambiar edad y nombre de persona1
        persona1.setEdad(50);
        persona1.setNombre("Jesus");

        //Imprimir persona1 modificado y persona2.
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());


        /**
         * Uso de la clase Rectangulo
         */
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(2.4, 2.7);

        //Settear la base y altura del rectangulo1.
        rectangulo1.setBase(5.2);
        rectangulo1.setAltura(6.2);

        //Muestra por pantalla ambos rectángulos.
        System.out.println("Área del rectángulo 1: " + rectangulo1.calcularArea() + " m²");
        System.out.println("Área del rectángulo 2: " + rectangulo2.calcularArea() + " m²");


        /**
         * Uso de la clase cuentaBancaria.
         */
        cuentaBancaria cuenta = new cuentaBancaria(1000, "Carlos");
        //Usamos los métodos ingresar y retira.
        cuenta.ingresar(500);
        cuenta.retirar(300);
        //Muestra en pantalla el saldo actual.
        System.out.println("Saldo actual: " + cuenta.getSaldo());


        /**
         * Uso de la clase Coche
         */

        // Crear un coche con velocidad inicial de 50.
        Coche coche = new Coche(50);

        // Mostrar la velocidad inicial.
        System.out.println("Velocidad inicial: " + coche.getVelocidad() + " km/h");

        // Acelerar el coche en 20 km/h.
        coche.acelerar(20);
        System.out.println("Velocidad después de acelerar: " + coche.getVelocidad() + " km/h");

        // Frenar el coche en 30 km/h.
        coche.frenar(30);
        System.out.println("Velocidad después de frenar: " + coche.getVelocidad() + " km/h");

        // Frenar más de la velocidad actual para comprobar que no queda negativa.
        coche.frenar(50);
        System.out.println("Velocidad después de frenar demasiado: " + coche.getVelocidad() + " km/h");


        /**
         * uso de la clase PotenciaYRaiz
         */

        // Se crea un objeto de la clase PotenciaYRaiz para calcular la raíz cuadrada.
        PotenciaYRaiz raiz1 = new PotenciaYRaiz();
        raiz1.raiz();// Se llama al método que calcula y muestra la raíz cuadrada.

        // Se crea otro objeto de la clase PotenciaYRaiz para calcular la potencia.
        PotenciaYRaiz potencia1 = new PotenciaYRaiz();
        potencia1.potencia();// Se llama al método que calcula y muestra la potencia.

        /**
         * Uso de la clase Libro
         */

        // Creamos un objeto de tipo Libro usando el constructor por defecto.
        Libro libro1 = new Libro();
        libro1.setTitulo("La metamorfosis");
        libro1.setAutor("Franz Kafka");
        libro1.setPaginas(112);

        // Creamos un segundo objeto de tipo Libro usando el constructor sobrecargado
        Libro libro2 = new Libro("El extranjero", "Albert Camus", 128);

        // Mostramos la información del primer libro.
        libro1.mostrarInformacion();
        // Mostramos la información del segundo libro.
        libro2.mostrarInformacion();


        /**
         * Uso de la clase Alumno
         */

        // Creamos un primer alumno usando el constructor sobrecargado.
        Alumno alumno1 = new Alumno("Héctor", 7.5);

        // Creamos un segundo alumno con el constructor sobrecargado.
        Alumno alumno2 = new Alumno("Alex", 3.8);


        // Mostramos la información de cada alumno.
        System.out.println("Información del primer alumno:");
        alumno1.mostrarInformacion();


        System.out.println("Información del segundo alumno:");
        alumno2.mostrarInformacion();


        /**
         * uso de la clase Circulo
         */

        // Creamos un objeto Circulo usando el constructor sobrecargado.
        Circulo c1 = new Circulo(5.0); // Radio = 5m
        // Mostramos el radio usando el getter.
        System.out.println("Radio: " + c1.getRadio());
        // Calculamos y mostramos el área del círculo usando el método calcularArea.
        System.out.println("Área: " + c1.calcularArea() + " m²");


        /**
         * Uso de la clase Calculadora
         */

        // Crear un objeto Calculadora usando el constructor sobrecargado con a=10 y b=5.
        Calculadora calc = new Calculadora(10, 5);

        // Llamar a los métodos y mostrar el resultados.
        System.out.println("Suma: " + calc.suma());
        System.out.println("Resta: " + calc.resta());
        System.out.println("Multiplicación: " + calc.multiplicacion());
        System.out.println("División: " + calc.division());

        // Cambiando los valores usando setters.
        calc.setA(20);
        calc.setB(4);
        // Llamar nuevamente al método suma con los nuevos valores y mostrar el resultado.
        System.out.println("Nueva suma: " + calc.suma());
        System.out.println("Nueva resta: " + calc.resta());
        System.out.println("Nueva multiplicación: " + calc.multiplicacion());
        System.out.println("Nueva división: " + calc.division());

    }

}