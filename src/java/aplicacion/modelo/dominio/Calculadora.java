/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author Alfred
 */
public class Calculadora {
    
    public double sumar(double num1, double num2){
    return num1+num2;
    
    }
    public double restar (double num1, double num2){
    
    return num1-num2;
    
    } 
    public double dividir (double num1, double num2){
        double res = 0;
    
        if (num2>0) 
            res= num1/num2;
        else 
            return res;
            
        return res;
    }
    public double multiplicar (double num1 , double num2){
    
    return num1*num2;
    }
    public double potencia (double num1 , double num2){
    return Math.pow(num1, num2);
    
    }
    }
    

