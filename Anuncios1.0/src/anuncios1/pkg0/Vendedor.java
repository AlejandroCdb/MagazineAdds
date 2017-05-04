/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anuncios1.pkg0;

/**
 *
 * @author Sala1
 */
public class Vendedor extends Usuario{
    
    private int bonos;
    private int contra;
    
    /**
     * @return the contra
     */
    public int getContra() {
        return contra;
    }

    /**
     * @param contra the contra to set
     */
    public void setContra(int contra) {
        this.contra = contra;
    }
    
    /**
     * @return the bonos
     */
    public int getBonos() {
        return bonos;
    }

    /**
     * @param bonos the bonos to set
     */
    public void setBonos(int bonos) {
        this.bonos = bonos;
    }
    
    public void hacerVenta(){
        Ventas venta = new Ventas();
        venta.registrarVenta(null, null, bonos, bonos, bonos, bonos, bonos);
    }
}
