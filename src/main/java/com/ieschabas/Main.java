package com.ieschabas;

public class Main {
    public static void main(String[] args) {
        /**
         * Uso de la clase Persona.
         */
        Persona persona1 = new Persona();

        //Asignacion de atributos al objeto persona1
        persona1.setNombre(" Héctor");
        persona1.setApellidos("Crespo Buigues");
        persona1.setEdad(18);
        persona1.setDni("1020393989B");
        persona1.setTelefono("+34695683459");

        //Imprimir persona1
        System.out.println(persona1.toString());


        //Creacion de persona2 con sus parametros
        Persona persona2 = new Persona(18,"1020393989B","Héctor","Crespo Buigues","+34695683459");

        //Cambiar edad y nombre de persona1
        persona1.setEdad(50);
        persona1.setNombre("Jesus");

        //Imprimir persona1 modificado y persona2
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());


        /**
         * Uso de la clase Rectangulo
         */
        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(2.4, 2.7);

        //Settear la base y altura del rectangulo1
        rectangulo1.setBase(5.2);
        rectangulo1.setAltura(6.2);

        //Muestra por pantalla ambos rectángulos
        System.out.println("Área del rectángulo 1: " + rectangulo1.calcularArea());
        System.out.println("Área del rectángulo 2: " + rectangulo2.calcularArea());


        /**
         * Uso de la clase cuentaBancaria.
         */
        cuentaBancaria cuenta = new cuentaBancaria(1000, "Carlos");
        //Usamos los métodos ingresar y retira
        cuenta.ingresar(500);
        cuenta.retirar(300);
        //Muestra en pantalla el saldo actual
        System.out.println("Saldo actual: " + cuenta.getSaldo());


        /**
         * Uso de la clase Coche
         */

        // Crear un coche con velocidad inicial de 50
        Coche coche = new Coche(50);

        // Mostrar la velocidad inicial
        System.out.println("Velocidad inicial: " + coche.getVelocidad() + " km/h");

        // Acelerar el coche en 20 km/h
        coche.acelerar(20);
        System.out.println("Velocidad después de acelerar: " + coche.getVelocidad() + " km/h");

        // Frenar el coche en 30 km/h
        coche.frenar(30);
        System.out.println("Velocidad después de frenar: " + coche.getVelocidad() + " km/h");

        // Frenar más de la velocidad actual para comprobar que no queda negativa
        coche.frenar(50);
        System.out.println("Velocidad después de frenar demasiado: " + coche.getVelocidad() + " km/h");


        /**
         * uso de la clase PotenciaYRaiz
         */

        // Se crea un objeto de la clase PotenciaYRaiz para calcular la raíz cuadrada
        PotenciaYRaiz raiz1 = new PotenciaYRaiz();
        raiz1.raiz();// Se llama al método que calcula y muestra la raíz cuadrada.

        // Se crea otro objeto de la clase PotenciaYRaiz para calcular la potencia
        PotenciaYRaiz potencia1 = new PotenciaYRaiz();
        potencia1.potencia();// Se llama al método que calcula y muestra la potencia.

        /**
         * Uso de la clase Libro
         */

        // Creamos un objeto de tipo Libro usando el constructor por defecto
        Libro libro1 = new Libro();
        libro1.setTitulo("La metamorfosis");
        libro1.setAutor("Franz Kafka");
        libro1.setPaginas(112);

        // Creamos un segundo objeto de tipo Libro usando el constructor sobrecargado
        Libro libro2 = new Libro("El extranjero", "Albert Camus", 128);

        // Mostramos la información del primer libro
        libro1.mostrarInformacion();
        // Mostramos la información del segundo libro
        libro2.mostrarInformacion();

    }
}