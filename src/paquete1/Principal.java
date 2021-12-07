package paquete1;
/** @author rafael
 * ***** Ejercicio 1 *********
 * Crea un proyecto de Java desde 0. Dentro del proyecto tenéis que crear un paquete.
 * En el paquete tendréis que crear una clase. Dentro de la clase tenéis que crear el
 * método main e imprimir todos los datos que se han visto en las sesiones.
 * Recordatorio: los tipos más comunes son int, long, double, boolean, String.
 * **/
public class Principal {
    public static void main(String args []){
        // System.out.println("Hola, esto es una prueba");
        int precio = 10;
        long cantidad = 15;
        double precio2 = 2.0d;
        boolean cierto = true;
        String imprime = "texto aleatorio";

        System.out.println("El precio es: " + precio + "\nLa cantidad es: " + cantidad
                + "\nEl precio2 es: " + precio2 + "\nLa variable cierto es: " + cierto
                + "\nImprime es: " + imprime);
    }
}
