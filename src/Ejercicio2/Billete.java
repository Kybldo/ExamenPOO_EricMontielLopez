package Ejercicio2;

public class Billete extends Dinero implements IDinero{

    private int value;

    public Billete(int value) {

        this.value = value;

    }

    public Billete() {

        this.value = 0;

    }

    @Override
    public String toString() {

        return "Valor: " + this.valor();

    }

    @Override
    public int valor() {

        return this.value;

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
