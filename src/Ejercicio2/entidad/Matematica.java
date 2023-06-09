package Ejercicio2.entidad;

public class Matematica {

    private double numero1;
    private double numero2;

    public Matematica() {
        this.numero1 = (int) (Math.random() * (10 - 1 + 1)) + 1;
        this.numero2 = (int) (Math.random() * (10 - 1 + 1)) + 1;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Matematicas{"
                + "numero1=" + numero1
                + ", numero2=" + numero2
                + '}';
    }
}
