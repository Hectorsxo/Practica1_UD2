package com.ieschabas;

/**
 * Clase que define un Libro
 * @author Héctor Crespo
 * @version 1.0
 */
public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    /**
     * Constructor por defecto de la clase Libro
     */
    public Libro() {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    /**
     * Constructor sobrecargado de la clase Libro
     * @param titulo Título del libro
     * @param autor Autor del libro
     * @param paginas Número de páginas
     */
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Setters

    /**
     * Método que establece el título del libro
     * @param titulo atributo de un String
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método que establece el autor del libro
     * @param autor atributo de un String
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Método que establece el número de páginas
     * @param paginas atributo de un int
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    // Getters

    /**
     * Método que devuelve el título del libro
     * @return título
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Método que devuelve el autor del libro
     * @return autor
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * Método que devuelve el número de páginas
     * @return páginas
     */
    public int getPaginas() {
        return this.paginas;
    }

    /**
     * Método que muestra toda la información del libro
     */
    public void mostrarInformacion() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Páginas: " + this.paginas);
    }
}
