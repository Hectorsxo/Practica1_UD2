package com.ieschabas;
/**
 * Clase que simula una cuenta bancaria en la cual se puede retirar e ingresar saldo.
 * @author Héctor Crespo
 * @version 1.0
 */
public class cuentaBancaria {
    private double saldo;
    private String titular;
    private double retirar;
    private double ingresar;

    /**
     * Constructor por defecto que crea una instancia de cuentaBancaria sin datos.
     */
    public cuentaBancaria() {
    }

    /**
     * Constructor que inicializa la cuenta con un saldo y un titular.
     * @param saldo atributo de un double
     * @param titular atributo de un String
     */

    public cuentaBancaria(double saldo, String titular){
        this.saldo = saldo;
        this.titular = titular;
        this.retirar = retirar;
        this.ingresar = ingresar;
    }

    /**
     * Establece el saldo de la cuenta.
     * @param saldo atributo de un double
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Establece el titular de la cuenta.
     * @param titular atributo de un String
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }

    /**
     * Establece el monto a retirar.
     * @param retirar atributo de un double
     */
    public void setRetirar(double retirar) {
        this.retirar = retirar;
    }

    /**
     * Establece el monto a ingresar.
     * @param ingresar atributo de un double
     */

    public void setIngresar(double ingresar) {
        this.ingresar = ingresar;
    }

    //Getters

    /**
     * Obtiene el saldo actual de la cuenta.
     * @return devuelve el saldo actual
     */
    public double getSaldo(){
        return this.saldo;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * @return devuelve el el titular
     */
    public String getTitular(){
        return this.titular;
    }

    /**
     * Obtiene el monto que se desea retirar.
     * @return devuelve el monto que retira
     */
    public double getRetirar(){
        return this.retirar;
    }

    /**
     * Obtiene el monto que se desea ingresar.
     * @return devuelve el monto que ingresa
     */
    public double getIngresar(){
        return this.ingresar;
    }

    /**
     * Método que ingresa una cantidad al saldo de la cuenta.
     * @param ingreso atributo de un double
     */
    public void ingresar(double ingreso){
        this.saldo += ingreso;
    }

    /**
     * Método que retira una cantidad del saldo de la cuenta.
     * @param retiro atributo de un double
     */
    public void retirar(double retiro){
        this.saldo -= retiro;
    }

}