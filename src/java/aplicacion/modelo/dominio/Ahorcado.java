/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Alfred
 */
public class Ahorcado implements Serializable{
    
    private String palabraAdivinar;
    private int intentos;
    private char[] palabraAhorcado;

    public Ahorcado() {
        reiniciarJuego();
    }
    

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
   

    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    public char[] getPalabraAhorcado() {
        return palabraAhorcado;
    }

    public void setPalabraAhorcado(char[] palabraAhorcado) {
        this.palabraAhorcado = palabraAhorcado;
    }
    public void comenzarJuego(String palabra){
        this.palabraAdivinar=palabra;
    
    
    }
    public boolean buscarLetra(char letra){
        boolean encontro = false;
        for (int i=0;i<palabraAdivinar.length();i++){
            if(palabraAdivinar.charAt(i)==letra){
                palabraAhorcado[i]=letra;
                encontro=true;
            }
        }
        if (encontro == false){
            this.intentos --;
            return false;
        }else{
            return true;
        }
        
    }
    public boolean juegoGanado(){
        
        boolean ganador = true;
        for (int i=0;i<palabraAdivinar.length();i++){
            if(palabraAdivinar.charAt(i)!= palabraAhorcado[i]){
                ganador = false;
            }
        }
        return ganador;
    }
    public void cargarPalabraAhorcado(){
        palabraAhorcado = new char[10];
        for(int i=0;i<palabraAhorcado.length;i++){
         palabraAhorcado[i]='_';        
        }
    }
    public void reiniciarJuego(){
        cargarPalabraAhorcado();
        palabraAdivinar = "";
        intentos = 5;
    }
    public ArrayList<String> getPalabraAhorcadoFormat(){
        ArrayList<String> caracteresPalabra = new ArrayList<String>();
        for (int i = 0; i< palabraAdivinar.length();i++){
            caracteresPalabra.add(String.valueOf(palabraAhorcado[i]));
        }
        return caracteresPalabra;
    }
 
    
}
