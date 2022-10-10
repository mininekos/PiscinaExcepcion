/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Excepcion.SalidaDelRango;

/**
 *
 * @author Dam
 */
public class Piscina {
    private int nivel; 
    public final int MAX_NIVEL;
    
    public Piscina(int max){
        if (max<0) max=0;
        MAX_NIVEL=max;
    }
    
    public int getNivel(){
        return nivel;}
    
    public void vaciar(int cantidad) throws SalidaDelRango{
       
            int temporal = nivel - cantidad;
            if (temporal<0)
                throw new SalidaDelRango("Error no hay sufiente agua");
            else{
                nivel = temporal;
            }
        
        }
    
     public void llenar(int cantidad) throws SalidaDelRango{
       
            int temporal = nivel + cantidad;
            if (temporal>MAX_NIVEL)
                throw new SalidaDelRango("Error desvordamiento");
            else{
                nivel = temporal;
            }
        
        }
}
