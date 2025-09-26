package com.ieschabas;

/**
 * Clase que define a un alumno con nombre y nota y verifica si ha aprobado.
 * @author Héctor Crespo
 * @version 1.0
 */

public class Alumno {
    private String nombre;
    private double nota;

    /**
     * Constructor por defecto de la clase Alumno
     */
    public Alumno() {
        this.nombre = nombre;
        this.nota = nota;
    }

    /**
     * Constructor sobrecargado de la clase Alumno
     * @param nombre Nombre del alumno
     * @param nota Nota del alumno
     */
    public Alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }


    /**
     * Método que establece el nombre del alumno
     * @param nombre atributo de un String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que establece la nota del alumno
     * @param nota atributo de un double
     */
    public void setNota(double nota) {
        this.nota = nota;
    }


    /**
     * Método que devuelve el nombre del alumno
     * @return nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Método que devuelve la nota del alumno
     * @return nota
     */
    public double getNota() {
        return this.nota;
    }

    /**
     * Método que indica si el alumno está aprobado
     * @return true si la nota es mayor o igual a 5, false en caso contrario
     */
    public boolean aprobado() {
        return this.nota >= 5;
    }

    /**
     * Método que muestra la información del alumno
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Nota: " + this.nota);
        System.out.println("Estado: " + aprobado());
    }
}
