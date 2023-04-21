package Ejercicio2.servicio;

import Ejercicio2.entidad.Matematica;

public class MatematicaServicio {

    public void mostrarValores(Matematica matematica) {
        System.out.println("Numero 1: " + matematica.getNumero1());
        System.out.println("Numero 2: " + matematica.getNumero2());
    }

    public void devolverMayor(Matematica matematica) {
        if (matematica.getNumero1() > matematica.getNumero2()) {
            System.out.println("El mayor es: " + matematica.getNumero1());
        } else {
            System.out.println("El mayor es: " + matematica.getNumero2());
        }
    }

    public void calcularPotencia(Matematica matematica) {
        if (matematica.getNumero1() > matematica.getNumero2()) {
            System.out.println(matematica.getNumero1() + " elevado a " + matematica.getNumero2());
            System.out.println(Math.pow(matematica.getNumero1(), matematica.getNumero2()));
        } else {
            System.out.println(matematica.getNumero2() + " elevado a " + matematica.getNumero1());
            System.out.println(Math.pow(matematica.getNumero2(), matematica.getNumero1()));
        }
    }

    public void calculaRaiz(Matematica matematica) {
        if (matematica.getNumero1() > matematica.getNumero2()) {
            double raizCuadrada = Math.sqrt(matematica.getNumero1());
            System.out.println("Raiz de : " + matematica.getNumero1() + " " + raizCuadrada);
        } else {
            double raizCuadrada = Math.sqrt(matematica.getNumero2());
            System.out.println("Raiz de : " + matematica.getNumero2() + " " + raizCuadrada);
        }
    }
}
