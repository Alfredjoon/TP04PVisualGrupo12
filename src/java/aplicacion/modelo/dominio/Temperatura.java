/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Alfred
 */
public class Temperatura implements Serializable{
    
    private double grado;

    public Temperatura(double grado) {
        this.grado = grado;
    }

    public Temperatura() {
    }

    public double getGrado() {
        return grado;
    }

    public void setGrado(double grado) {
        this.grado = grado;
    }
    
    public double conversorGradosCelcius(){
    return (5*(grado-32))/9;
    }
    public double conversorGradosKelvin(){
    return ((5*(grado-32))/9)+273.15;
    }
    public double conversorGradosFahrenheit(){
    return grado;
    }
}
