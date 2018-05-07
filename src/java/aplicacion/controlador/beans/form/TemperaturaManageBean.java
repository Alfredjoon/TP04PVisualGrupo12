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
   private double n;
   private Temperatura temp;
   private char unidadOrigen;
   private char unidadSalida;

    public char getUnidadOrigen() {
        return unidadOrigen;
    }

    public void setUnidadOrigen(char unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    public char getUnidadSalida() {
        return unidadSalida;
    }

    public void setUnidadSalida(char unidadSalida) {
        this.unidadSalida = unidadSalida;
    }

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
     public double convertirUnidades(){
        
        double resultado=.0;
        
        temp.setGrado(n);
        if(unidadOrigen == 'C' && unidadSalida == 'F')
            resultado = temp.conversorGradosFahrenheit();
                else if (unidadOrigen == 'C' && unidadSalida == 'K')
                    resultado = temp.conversorGradosKelvin();
                else if(unidadOrigen == 'F' && unidadSalida == 'C')
                    resultado= temp.conversorGradosCelcius();
                else if (unidadOrigen == 'F' && unidadSalida == 'K')
                resultado = temp.conversorGradosKelvin();
                else if (unidadOrigen == 'K' && unidadSalida =='F')
                    resultado= temp.conversorGradosFahrenheit();
                else if (unidadOrigen == 'K' && unidadSalida =='C')
                    resultado = temp.conversorGradosCelcius();
        
            
        return resultado;
    }
    
}
