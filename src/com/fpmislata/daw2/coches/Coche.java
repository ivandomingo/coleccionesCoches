/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.coches;

/**
 *
 * @author ivan
 */
public class Coche {
    private Marca marca;
    private String modelo;
    private int cilindrada;
    private String dniPropietario;
    
    public Coche(Marca marca, String modelo, int cilindrada, String dniPropietario){
        this.marca=marca;
        this.modelo=modelo;
        this.cilindrada=cilindrada;
        this.dniPropietario=dniPropietario;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getDniPropietario() {
        return dniPropietario;
    }

    public void setDniPropietario(String dniPropietario) {
        this.dniPropietario = dniPropietario;
    }
    
    
}
