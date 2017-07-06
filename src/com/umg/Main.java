package com.umg;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //declarando la Tienda
        Tienda TiendaDeMascotas = new Tienda();
        TiendaDeMascotas.setNombreGerente("Gerente 1");
        TiendaDeMascotas.setDireccionTienda("Zona 1");
        TiendaDeMascotas.setAnioCreacion(2000);


        System.out.println("Nombre del Gerente: "+TiendaDeMascotas.getNombreGerente()+
                           " \nDireccion de la tienda: "+TiendaDeMascotas.getDireccionTienda()+
                           "\nAño de creacion: "+TiendaDeMascotas.getAnioCreacion());


        //Agregando mascotas

        Mascota m1 = new Mascota();
        m1.setTipoAnimal("Perro");
        m1.setRazaAnimal("Snauzer");
        m1.setEdadAnimal(5);
        TiendaDeMascotas.addMascota(m1);

        Mascota m2 = new Mascota();
        m2.setTipoAnimal("Perro");
        m2.setRazaAnimal("Bulldog");
        m2.setEdadAnimal(1);
        TiendaDeMascotas.addMascota(m2);

        Mascota m3 = new Mascota();
        m3.setTipoAnimal("Ave");
        m3.setRazaAnimal("Perica");
        m3.setEdadAnimal(15);
        TiendaDeMascotas.addMascota(m3);

        for (Mascota m:TiendaDeMascotas.getMascotas()
             ) {
            System.out.println("\nTipo animal: "+m.getTipoAnimal()+
                                "\nRaza animal: "+m.getRazaAnimal()+
                                "\nEdad animal: "+m.getEdadAnimal());
        }



        System.out.println("\nLas edades de los Perros suman: " + TiendaDeMascotas.sumaEdades("Perro"));
    }
}