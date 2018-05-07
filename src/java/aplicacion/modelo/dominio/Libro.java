/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author tito
 */
public class Libro {
    private String iSBM, titulo, categoria;
    private double precio;
    private Autor autor;
    
    public Libro() {
    }
    public Libro(String iSBM, String titulo, Autor autor,String categoria, double precio) {
     
        this.iSBM = iSBM;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getISBM() {
        return iSBM;
    }

    public void setISBM(String iSBM) {
        this.iSBM = iSBM;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    
}
