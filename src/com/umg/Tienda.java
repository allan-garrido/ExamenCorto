package com.umg;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ALLAN GARRIDO on 5/07/2017.
 */
public class Tienda {
    //variables
    private String nombreGerente;
    private String direccionTienda;
    private int anioCreacion;
    private List<Mascota> Mascotas;


    public Tienda() {
        Mascotas = new ArrayList<>();
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

    public List<Mascota> getMascotas() {
        return Mascotas;
    }

    public void setMascotas(List<Mascota> mascotas) {
        Mascotas = mascotas;
    }

    public void  addMascota(Mascota e) {
        Mascotas.add(e);
    }

    public int sumaEdades(String queTipoAnimal){
        int suma=0;

        for (Mascota m:getMascotas()
                ) {
            if (m.getTipoAnimal().equals(queTipoAnimal))
                suma+=m.getEdadAnimal();
        }

        return suma;
    }
}
