package com.ieschabas;

/**
 *Clase que define los atributos de una persona, tales como el dni, el nombre, etc.
 * @author Héctor Crespo
 * @version 1.0
 */
public class Persona {
    private int edad;
    private String dni;
    private String nombre;
    private String apellidos;
    private String telefono;

    //Constructor por defecto
   /* public Persona () {
        this.edad = 18;
        this.dni = "1020393989B";
        this.nombre = "Héctor";
        this.apellidos = "Crespo Buigues";
        this.telefono = "+34695683459";

    }
    */

    /**
     * Constructor por defecto que crea una instancia de persona sin datos
     */
    public Persona ()  {

    }


    /**
     * Constructor sobre cargado de la clase persona, crea una instancia con los datos pasados como parametros
     * @param edad atributo de un int
     * @param dni atributo de un String
     * @param nombre atributo de un String
     * @param apellidos atributo de un String
     * @param telefono atributo de un String
     */

    public Persona(int edad, String dni, String nombre, String apellidos, String telefono) {
        this.edad = edad;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    /**
     * Inserta la edad en el objeto personas
     * @param edad int
     */


    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Inserta el Dni en el objeto persona
     * @param dni String
     */

    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Inserta el nombre en el objeto persona
     * @param nombre String
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Inserta el apellido en el objeto persona
     * @param apellidos String
     */

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *Inserta el telefono en el objeto persona
     * @param telefono String
     */

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve la edad del objeto persona
     * @return edad
     */

    public int getEdad() {
        return edad;
    }

    /**
     * Devuelve el dni del objeto persona
     * @return dni
     */

    public String getDni() {
        return dni;
    }

    /**
     * Devuelve el nombre del objeto persona
     * @return nombre
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el apellidos del objeto persona
     * @return apellidos
     */

    public String getApellidos() {
        return apellidos;
    }

    /**
     * Devuelve el telefono del objeto persona
     * @return telefono
     */

    public String getTelefono() {
        return telefono;
    }

    /**
     * Devuelve el objeto persona en formato cadena
     * @return cadena con los valores de persona
     */

    //Metodo toString

    public String toString(){
        return "Nombre:" + this.nombre + "\napellidos " + this.apellidos + "\nedad: " + this.edad + "\ndni: " + this.dni + "\ntelefono: " + this.telefono;



    }
}
