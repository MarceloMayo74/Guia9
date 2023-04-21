/*
 * Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
 * A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
 * programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
 * pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
 * 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
 * elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
 * elementos y el combinado de 20.
 */
package Ejercicio3;

import Ejercicio3.servicio.ArregloServicio;

public class Ejercicio3 {

    public static void main(String[] args) {
        ArregloServicio service = new ArregloServicio();
        double[] arregloA = new double[10];
        double[] arregloB = new double[20];
        service.inicializarA(arregloA);
        System.out.println("Arreglo A:");
        service.mostrar(arregloA);
        System.out.println();
        System.out.println("Arreglo A de mayor a menor:");
        service.ordenar(arregloA);
        service.mostrar(arregloA);
        System.out.println();
        System.out.println("Arreglo B:");
        service.inicializarB(arregloA, arregloB);
        service.mostrar(arregloB);

    }
}
