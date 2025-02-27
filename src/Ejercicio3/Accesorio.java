package Ejercicio3;

public class Accesorio extends Articulo{

    private String name;

    public Accesorio(String nombre, boolean gratis, String name) {

        super(nombre, gratis);
        this.name = name;

    }

    @Override
    public String toString() {

        return "Accesorio Nombre: " + name;

    }

    @Override
    public void returnArticulo() {

        System.out.println("Es un accesorio.");

    }

    @Override
    public int returnPrice() {

        if (gratis){

            return 0;

        } else return 7;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
