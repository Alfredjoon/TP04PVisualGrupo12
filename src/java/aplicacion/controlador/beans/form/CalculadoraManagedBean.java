/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador.beans.form;

import aplicacion.modelo.dominio.Calculadora;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alfred
 */
@ManagedBean
@RequestScoped
public class CalculadoraManagedBean implements Serializable{
    
    private double numero1;
    private double numero2;
    private Calculadora cal;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public Calculadora getCal() {
        return cal;
    }

    public void setCal(Calculadora cal) {
        this.cal = cal;
    }

    /**
     * Creates a new instance of CalculadoraManagedBean
     */
    public CalculadoraManagedBean() {
        cal = new Calculadora();
    }
    
    public double sumar(){
    
    return cal.sumar(numero1, numero2);
    }
    public double restar (){
    return cal.restar(numero1, numero2);
    }
    public double multiplicar (){
    return cal.multiplicar(numero1, numero2);
    
    }
    public double dividir (){
    return cal.dividir(numero1, numero2);
    }
    public double calcularpotencia(){
    
    return cal.potencia(numero1, numero2);
    }
    
}
