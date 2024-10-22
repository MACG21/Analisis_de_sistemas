/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdediseño;

import interfaces.EstacionClima;
import interfaces.Smartphone;

/**
 *
 * @author cgale
 */
public class PatronesDeDiseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //cambia el EstacionClima por el setEstacion
        EstacionClima estacionClima = new EstacionClima();
        estacionClima.setMediciones(80, 100, 90);
        /*
        Smartphone smartPhone = new Smartphone();
        
        estacionClima.setMediciones(12, 13, 14);
        estacionClima.setMediciones(14, 15, 16);*/
        
        
        
    }
    
}
