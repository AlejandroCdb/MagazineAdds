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
public class Admin extends Usuario{
    
    Vendedor vende = new Vendedor();
    
    Vendedor buscarVendedor(){
        return vende;
    }
}
