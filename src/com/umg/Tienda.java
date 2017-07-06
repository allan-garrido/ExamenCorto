package com.umg;

/**
 * Created by ALLAN GARRIDO on 5/07/2017.
 */
public class Tienda {
    //variables
    private String nombreGerente;
    private String direccionTienda;
    private int anioCreacion;

    public Tienda(String nombreGerente, String direccionTienda, int anioCreacion) {
        this.nombreGerente = nombreGerente;
        this.direccionTienda = direccionTienda;
        this.anioCreacion = anioCreacion;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public String getDireccionTienda() {
        return direccionTienda;
    }

    public void setDireccionTienda(String direccionTienda) {
        this.direccionTienda = direccionTienda;
    }

    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }
}
