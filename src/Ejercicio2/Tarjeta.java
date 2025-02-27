package Ejercicio2;

public class Tarjeta extends Dinero implements IDinero{

    private String numero;
    private double saldo;
    private double credito;

    public Tarjeta(String numero, double saldo, double credito) {

        this.numero = numero;
        this.saldo = saldo;
        this.credito = credito;

    }

    public Tarjeta() {

        this.numero = "";
        this.saldo = 0;
        this.credito = 0;

    }

    @Override
    public String toString() {

        return "Valor: " + this.valor();

    }

    @Override
    public int valor() {

        return (int) (this.credito + this.saldo);

    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }
}