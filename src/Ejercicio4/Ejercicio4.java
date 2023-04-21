/*
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
 * la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
 * clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
 * pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
 * de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
 * fecha actual, que se puede conseguir instanciando un objeto Date con constructor
 * vacío.
 * Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
 * Ejemplo fecha actual: Date fechaActual = new Date();
 */
package Ejercicio4;

import Ejercicio4.servicio.FechaServicio;
import java.util.Date;

public class Ejercicio4 {
    public static void main(String[] args) {
        FechaServicio service = new FechaServicio();

        Date fecha = service.fechaNacimiento();
        System.out.println(fecha);

        Date fechaActual = service.fechaActual();
        System.out.println(fechaActual);
        service.diferencia(fecha,fechaActual);
        System.out.println(service.diferencia2(fecha,fechaActual));
    }
}
