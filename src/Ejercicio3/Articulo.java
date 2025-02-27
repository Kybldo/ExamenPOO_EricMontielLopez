package Ejercicio3;

abstract class Articulo {

    String nombre;
    boolean gratis;

    public Articulo(String nombre, boolean gratis) {
        this.nombre = nombre;
        this.gratis = gratis;
    }

    public void returnArticulo() {}

    public int returnPrice() {return 0;}

}
