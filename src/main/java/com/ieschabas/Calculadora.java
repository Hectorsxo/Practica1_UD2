package com.ieschabas;

/**
 * Clase que define una calculadora básica
 * @author Héctor Crespo
 * @version 1.0
 */
public class Calculadora {
    private double a;
    private double b;

    /**
     * Constructor por defecto de la clase Calculadora
     */
    public Calculadora() {}

    /**
     * Constructor sobrecargado de la clase Calculadora
     * @param a Primer número
     * @param b Segundo número
     */
    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    /**
     * Establece el valor de a
     * @param a atributo de un double
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * Establece el valor de b
     * @param b atributo de un double
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * Devuelve el valor de a
     * @return a
     */
    public double getA() {
        return this.a;
    }

    /**
     * Devuelve el valor de b
     * @return b
     */
    public double getB() {
        return this.b;
    }

    /**
     * Suma a y b
     * @return resultado de la suma
     */
    public double suma() {
        return this.a + this.b;
    }

    /**
     * Resta a y b
     * @return resultado de la resta
     */
    public double resta() {
        return this.a - this.b;
    }

    /**
     * Multiplica a y b
     * @return resultado de la multiplicación
     */
    public double multiplicacion() {
        return this.a * this.b;
    }

    /**
     * Divide a y b
     * @return resultado de la división
     * @throws IllegalArgumentException si b es 0
     */
    public double division() {
        if (this.b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return this.a / this.b;
    }
}

