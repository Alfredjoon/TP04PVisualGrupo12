/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.modelo.dominio.Ahorcado;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Alfred
 */
@ManagedBean
@ViewScoped
public class AhorcadoManagedBean implements Serializable{
    
    private Ahorcado juego;
    private String palabraIngresada;
    private char letraIngresada;

    /**
     * Creates a new instance of AhorcadoManagedBean
     */
    public AhorcadoManagedBean() {
        juego=new Ahorcado();
    }

    public Ahorcado getJuego() {
        return juego;
    }

    public void setJuego(Ahorcado juego) {
        this.juego = juego;
    }

    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    public char getLetraIngresada() {
        return letraIngresada;
    }

    public void setLetraIngresada(char letraIngresad) {
        this.letraIngresada = letraIngresad;
    }
    public void controlarLetra(){
        boolean esLetraEncontrada = juego.buscarLetra(letraIngresada);
        if (esLetraEncontrada == true){
      
            if (juego.juegoGanado() == true){
                FacesContext context = FacesContext.getCurrentInstance();
                palabraIngresada = new String();
                juego.reiniciarJuego();
                context.addMessage(null,new FacesMessage("Usted gano el Juego!"));
              
            }
        }else{
          
            if(juego. getIntentos()<=0){
                FacesContext context = FacesContext.getCurrentInstance();
               
               palabraIngresada = new String();
               juego.reiniciarJuego();
                
                context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_FATAL,"GAME OVER","Usted perdio el Juego!"));
            }
       

        }
    }
    
    public void empezarJuego(){       
        
        juego.comenzarJuego(palabraIngresada);
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,"JUEGO INICIADO","Que tengas suerte!"));    
      
    }
}
