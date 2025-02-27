package Ejercicio3;

import java.util.Objects;

public class Pokeball extends Articulo{

    public enum Tipo{

        POKEBALL, GREAT_BALL, ULTRA_BALL

    }

    private Tipo tipo;

    public Pokeball(String nombre, boolean gratis, Tipo tipo) {

        super(nombre, gratis);
        this.tipo = tipo;

    }

    @Override
    public String toString() {

        return "Pokeball Tipo: " + this.tipo;

    }

    @Override
    public void returnArticulo() {

        System.out.println("Es una Pokéball de tipo " + this.tipo + ".");

    }

    @Override
    public int returnPrice() {

        if (gratis){

            return 0;

        } else {

            if (this.tipo == Tipo.POKEBALL){

                return 2;

            } else if (this.tipo == Tipo.GREAT_BALL){

                return 5;

            } else return 10;

        }

    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
