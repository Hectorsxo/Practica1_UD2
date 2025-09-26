package com.ieschabas;

/**
 *  Clase que representa un coche con un atributo de velocidad y permite modificar la velocidad frenando o acelerando.
 * @author Hector Crespo
 * @version 1.0
 */
public class Coche {
    private double velocidad;

    /**
     * Constructor por defecto que crea un coche sin velocidad inicial.
     */
    public Coche() {
    }

    /**
     * Constructor que crea un coche con una velocidad inicial.
     * @param velocidad atributo de un double
     */
    public Coche(double velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Establece la velocidad del coche.
     * @param velocidad atributo de un double
     */
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * Obtiene la velocidad actual del coche
     * @return devuelve la velocidad actual
     */
    public double getVelocidad() {
        return this.velocidad;
    }

    /**
     * Método que aumenta la velocidad del coche en la cantidad indicada.
     * @param incremento atributo de un double
     */
    public void acelerar(double incremento) {
        this.velocidad += incremento;
    }

    /**
     * Método que disminuye la velocidad del coche en la cantidad indicada.
     * @param decremento atributo de un double
     */
    public void frenar(double decremento) {
        this.velocidad -= decremento;

    }
}
