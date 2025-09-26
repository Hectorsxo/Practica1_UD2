package com.ieschabas;

/**
 * Clase que define un círculo
 * @author Héctor Crespo
 * @version 1.0
 */
public class Circulo {
    private double radio;

    /**
     * Constructor por defecto de la clase Circulo
     */
    public Circulo() {}

    /**
     * Constructor sobrecargado de la clase Circulo
     * @param radio Radio del círculo
     */
    public Circulo(double radio) {
        this.radio = radio;
    }


    /**
     * Método que establece el radio del círculo
     * @param radio atributo de un double
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }



    /**
     * Método que devuelve el radio del círculo
     * @return radio
     */
    public double getRadio() {
        return this.radio;
    }

    /**
     * Método que calcula el área del círculo
     * Fórmula: π * radio^2
     * @return devuelve el radio
     */
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
}
