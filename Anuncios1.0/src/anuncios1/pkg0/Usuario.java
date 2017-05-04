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
public class Usuario {
    
    private String nombre;
    private int tipoUser;//0 admin, 1 vendedor
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the tipoUser
     */
    public int getTipoUser() {
        return tipoUser;
    }

    /**
     * @param tipoUser the tipoUser to set
     */
    public void setTipoUser(int tipoUser) {
        this.tipoUser = tipoUser;
    }
}
