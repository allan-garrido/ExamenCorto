package com.umg;

/**
 * Created by ALLAN GARRIDO on 5/07/2017.
 */
public class Mascota {
    private String tipoAnimal;
    private String razaAnimal;
    private int edadAnimal;

    public Mascota(String tipoAnimal, String razaAnimal, int edadAnimal) {
        this.tipoAnimal = tipoAnimal;
        this.razaAnimal = razaAnimal;
        this.edadAnimal = edadAnimal;
    }

    public Mascota() {
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getRazaAnimal() {
        return razaAnimal;
    }

    public void setRazaAnimal(String razaAnimal) {
        this.razaAnimal = razaAnimal;
    }

    public int getEdadAnimal() {
        return edadAnimal;
    }

    public void setEdadAnimal(int edadAnimal) {
        this.edadAnimal = edadAnimal;
    }
}
