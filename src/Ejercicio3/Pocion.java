package Ejercicio3;

import java.util.Arrays;

public class Pocion extends Articulo {

    private int nivel;
    private String[] efectos = new String[2];

    public Pocion(String nombre, boolean gratis, int nivel, String[] efectos) {

        super(nombre, gratis);
        this.nivel = nivel;
        this.efectos = efectos;

    }

    @Override
    public String toString() {

        return "Poción Nivel: " + this.nivel + " Efectos: " + Arrays.toString(this.efectos);

    }

    @Override
    public void returnArticulo() {

        System.out.println("Es una Poción.");

    }

    @Override
    public int returnPrice() {

        if (gratis) {

            return 0;

        } else return nivel * 5;

    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String[] getEfectos() {
        return efectos;
    }

    public void setEfectos(String[] efectos) {
        this.efectos = efectos;
    }
}
