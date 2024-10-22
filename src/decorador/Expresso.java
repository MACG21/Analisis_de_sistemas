/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author cgale
 */
public class Expresso extends Bebida{
    
    public Expresso(){
        descripcion = "Expresso";
    }

    @Override
    public double precio() {
        return 20.00;
    }
    
}
