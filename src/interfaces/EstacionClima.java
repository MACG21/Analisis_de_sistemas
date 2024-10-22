/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import interfaces.Observador;
import interfaces.Sujeto;
import java.util.ArrayList;

/**
 *
 * @author cgale
 */
public class EstacionClima implements Sujeto {
    
    private float humedad;
    private float temperatura;
    private float presion;
    private ArrayList<Observador> observadores;
    
    @Override
    public void registrarObservador(Observador o) {
        this.observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
        int i = this.observadores.indexOf(o);
        if(i >= 0){
            this.observadores.remove(o);
        }
    }
    @Override
    public void notificarObservadores() {
        for(int i =0; i < this.observadores.size(); i++){
        Observador observador = this.observadores.get(i);
        observador.actualiza(temperatura, humedad, presion);
        }
    }
    public void EstacionClima(float humedad, float temperatura, float presion, ArrayList<Observador> observadores) {
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.presion = presion;
        this.observadores = observadores;
    }
    
    public void setMediciones(float humedad, float temperatura, float presion){
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.presion = presion;
        notificarObservadores();
    }    
    
}
