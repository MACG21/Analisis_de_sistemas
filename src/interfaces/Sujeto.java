/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author cgale
 */
public interface Sujeto {
    public void registrarObservador(Observador o);
    public void eliminarObservador(Observador o);
    public void notificarObservadores();
}
