package com.ieschabas;

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
     * @param edad
     * @param dni
     * @param nombre
     * @param apellidos
     * @param telefono
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
     * @param edad
     */


    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Inserta el Dni en el objeto persona
     * @param dni
     */

    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Inserta el nombre en el objeto persona
     * @param nombre
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Inserta el apellido en el objeto persona
     * @param apellidos
     */

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *Inserta el telefono en el objeto persona
     * @param telefono
     */

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Devuelve la edad del objeto persona
     * @return
     */

    public int getEdad() {
        return edad;
    }

    /**
     * Devuelve el dni del objeto persona
     * @return
     */

    public String getDni() {
        return dni;
    }

    /**
     * Devuelve el nombre del objeto persona
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el apellidos del objeto persona
     * @return
     */

    public String getApellidos() {
        return apellidos;
    }

    /**
     * Devuelve el telefono del objeto persona
     * @return
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
