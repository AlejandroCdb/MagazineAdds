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
public class Ventas {
    
    private String cliente;
    private String caracteristicas;
    private int fecha;
    private int valor;
    private int tipoPago;
    private int estado;
    private int saldo;
    private int folio;
    
    /*
    int folio;
    int opc;
    
    int registrarVenta(String cliente, String caracteristicas, int fecha, int valor, int tipoPago, int estado, int saldo){
        return folio;
    }
    
    int eliminarVenta(int folio){
        return opc;
    }
*/

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the tipoPago
     */
    public int getTipoPago() {
        return tipoPago;
    }

    /**
     * @param tipoPago the tipoPago to set
     */
    public void setTipoPago(int tipoPago) {
        this.tipoPago = tipoPago;
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the folio
     */
    public int getFolio() {
        return folio;
    }

    /**
     * @param folio the folio to set
     */
    public void setFolio(int folio) {
        this.folio = folio;
    }
}
