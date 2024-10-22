/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import interfaces.Observador;
import interfaces.Sujeto;

/**
 *
 * @author cgale
 */
public class Smartphone implements Observador {
    
    private float temperatura;
    private float presion;
    private float humendad;
    private Sujeto sujeto;

    public void Smartphone(Sujeto sujeto) {
        this.sujeto = sujeto;
        sujeto.registrarObservador(this);
    }

    @Override
    public void actualiza(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        this.humendad = humedad;
        this.presion = presion;
        visualizar();
    }

    private void visualizar() {
        System.out.println("Condiciones climaticas: " +
                this.temperatura + " grados celcius, " +
                this.humendad + " % de humedad y " + 
                this.presion + " unidades de presion.");
    }
    
    
}
