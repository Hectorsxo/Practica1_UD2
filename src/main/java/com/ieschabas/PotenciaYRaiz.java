package com.ieschabas;

/**
 * Clase que permite calcular la raíz cuadrada y la potencia de un número.
 * @author Héctor Crespo
 * @version 1.0
 */
public class PotenciaYRaiz {
    /**
     * Constructor por defecto
     */
    public PotenciaYRaiz(){

    }
    /**
     * base y exponente para calcular la raíz cuadrada y la potencia.
     */
    double numero1 = 8;
    double numero2 = 2;

    /**
     * Método que calcula y muestra la raíz cuadrada de {@code numero1} utilizando {@link Math#sqrt(double)} para obtener el resultado.
     */
    public void raiz() {
        double raizCuadrada = Math.sqrt(numero1);
        System.out.println("La raiz cuadrada de " + numero1 + " es : " + raizCuadrada);
    }

    /**
     *  Método que calcula y muestra la potencia de {@code numero1} elevado a {@code numero2} y utiliza {@link Math#pow(double, double)} para obtener el resultado.
     */
    public void potencia(){
        double potencia = Math.pow(numero1, numero2);
        System.out.println("La potencia de " + numero1 + " es: " + potencia);
        }
    }

