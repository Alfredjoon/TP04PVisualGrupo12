/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.modelo.dominio.Profesor;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.PrimeFaces;

/**
 *
 * @author Alfred
 */
@ManagedBean
@RequestScoped
public class ProfesorManagedBean implements Serializable{
    
    private Profesor unProfesor;
    private String nombre;
    private String apellido;
    private int edad;
    private String especialidad;
    
    private static ArrayList <Profesor> lista = new ArrayList<>();

    /**
     * Creates a new instance of ProfesorManagedBean
     */
    public ProfesorManagedBean() {
        unProfesor =  new Profesor();
    }

    public Profesor getUnProfesor() {
        return unProfesor;
    }

    public void setUnProfesor(Profesor unProfesor) {
        this.unProfesor = unProfesor;
    }

    public ArrayList<Profesor> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Profesor> lista) {
        ProfesorManagedBean.lista = lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    
    
    public void agregarProfesor(){
        lista.add(new Profesor(nombre, apellido, edad, especialidad));   
    }

    /**
     *
     */
    public void mostrarProfesor() {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "INFORMACION", "nombre: " + nombre + "  Apellido : " + apellido + " Edad :"  + edad + "  Especialidad:"+ especialidad);
         
        PrimeFaces.current().dialog().showMessageDynamic(message);
    }

   
 
}
