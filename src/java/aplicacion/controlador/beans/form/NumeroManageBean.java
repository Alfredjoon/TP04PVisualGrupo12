/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.modelo.dominio.Numero;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alfred
 */
@ManagedBean
@ViewScoped
public class NumeroManageBean implements Serializable{

    /**
     * Creates a new instance of NumeroManageBean
     */
    private Numero num;
    public NumeroManageBean() {
        
        
    }
    
}
