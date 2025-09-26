package com.ieschabas;
/**
 * Clase que define un rectángulo
 * @author Héctor Crespo Buigues
 * @version 1.0
 */
public class Rectangulo {
    private double base;
    private double altura;

    /**
     * Constructor por defecto de la clase Rectangulo
     */
    public Rectangulo(){}

    /**
     * Constructor sobrecargado de la clase Rectangulo
     * @param base atributo de un double
     * @param altura atributo de un double
     */

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //Setters

    /**
     * Método que establece la base del Rectángulo
     * @param base atributo de un double
     */
    public void setBase(double base){
        this.base = base;
    }

    /**
     * Método que establece la altura del rectángulo
     * @param altura atributo de un double
     */
    public void setAltura(double altura){
        this.altura = altura;
    }

    //Getters

    /**
     * Método que devuelve la base del rectangulo
     * @return base
     */
    public double getBase(){
        return this.base;
    }

    /**
     * Método que devuelve la altura del rectángulo
     * @return altura
     */

    public double getAltura(){
        return this.altura;
    }

    /**
     * Método que calcula el área
     * @return área
     */
    public double calcularArea(){
        return this.base * this.altura;
    }



}
