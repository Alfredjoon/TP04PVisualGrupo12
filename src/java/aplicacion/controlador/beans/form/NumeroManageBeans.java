/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.modelo.dominio.Numero;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alfred
 */
@ManagedBean
@RequestScoped
public class NumeroManageBeans implements Serializable{
    private Numero num = new Numero();
    private static ArrayList <Numero> lista =  new ArrayList<Numero>();

    public Numero getNum() {
        return num;
    }

    public void setNum(Numero num) {
        this.num = num;
    }

    public ArrayList<Numero> getLista() {
        return (ArrayList<Numero>) lista;
    }

    public void setLista(ArrayList<Numero> lista) {
        NumeroManageBeans.lista = lista;
    }

 
    public void agregarNumero(){
        lista.add(this.num);
    
    }
   
    
  
}
