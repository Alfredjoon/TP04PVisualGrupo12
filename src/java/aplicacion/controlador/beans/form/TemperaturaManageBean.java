/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.modelo.dominio.Temperatura;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alfred
 */
@ManagedBean
@ViewScoped
public class TemperaturaManageBean implements Serializable{
   private Temperatura temp;

    public Temperatura getTemp() {
        return temp;
    }

    public void setTemp(Temperatura temp) {
        this.temp = temp;
    }

    /**
     * Creates a new instance of TemperaturaManageBean
     */
    public TemperaturaManageBean() {
        temp = new Temperatura();
        
    }
    
}
