/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.modelo.dominio.Autor;
import aplicacion.modelo.dominio.Libro;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author tito
 */
@ManagedBean
@SessionScoped
public class LibroManagedBean {

    private Libro libro;
    private Autor autor;
    private int idAutor;
    private List<Libro> libros;
    private List<Autor> autores;
    private String ISBM, titulo, categoria;
    private double precio;
    
    public LibroManagedBean() {
        libros = new ArrayList();
        autores = new ArrayList();
        autores.add(new Autor(1,"Jorge Luis", "Borges"));
        autores.add(new Autor(2,"Ernesto", "Sabato"));
        autores.add(new Autor(3,"George", "orwell"));
    }

    public void crearLibro(){
        Autor autor=new Autor();
        for( Autor a :  autores ){
           if(a.getId() == this.idAutor){
              autor.setId(a.getId());
              autor.setNombre(a.getNombre());
              autor.setApellido(a.getApellido());
           }
        }
        
        libro = new Libro(ISBM, titulo, autor, categoria, precio);
        agregarLibro();
    }
    
    public void agregarLibro(){
       libros.add(libro);
    }
    
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
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

    public String getISBM() {
        return ISBM;
    }

    public void setISBM(String ISBM) {
        this.ISBM = ISBM;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }
    
    
}
