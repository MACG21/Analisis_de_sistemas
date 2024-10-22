/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorador;

/**
 *
 * @author cgale
 */
public class HouseBlend extends Bebida {
    
    public HouseBlend(){
        descripcion = "House Blende";
    }

    @Override
    public double precio() {
        return 18.00;
    }
    
}
