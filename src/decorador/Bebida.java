/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author cgale
 */
public abstract class Bebida {
    String descripcion = "Bebida desconocida";
    
    public String getDescripcion(){
        return descripcion;
    }
    public abstract double precio();
}
