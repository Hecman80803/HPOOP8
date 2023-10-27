/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo08;

/**
 *
 * @author hecman,Damian y Jhony
 */
public class POO08 {

    public static void main(String[] args) {
       // Declaración de objetos de diferentes clases
        Poligono poligono;
        Triangulo triangulo = new Triangulo();
        Cuadrilatero cuadrilatero = new Cuadrilatero();

        // Impresión de mensajes en la consola
        System.out.println("triangulo");
        System.out.println("cuadrilatero");

        // Configuración de propiedades de los objetos Triangulo y Cuadrilatero
        triangulo.setBase(5);
        triangulo.setAlt(3);
        cuadrilatero.setBase(4);
        cuadrilatero.setAlt(6);

        // Impresión de información sobre los objetos
        System.out.println(triangulo);
        System.out.println(cuadrilatero);
        System.out.println(triangulo.area());
        System.out.println(cuadrilatero.area());

        // Asignación de objetos de subclases a una referencia de la superclase
        poligono = new Triangulo();
        System.out.println(poligono);

        // Llamada a la función getPoligono con diferentes tipos de polígonos
        getPoligono(poligono);
        poligono = new Cuadrilatero();
        getPoligono(poligono);

        // Creación de un objeto Flauta y llamada al método tipoInstrumento
        Flauta flauta = new Flauta();
        System.out.println(flauta.tipoInstrumento());

        // Impresión del valor de PI de la clase Math
        System.out.println(Math.PI);

        // Iteración a través de los nombres de los meses en el enum Meses
        for (int i = Meses.UNO; i <= Meses.DOCE; i++) {
            System.out.println(Meses.NOMBRE_MESES[i]);
        }
    }

    // Función que imprime el tipo de polígono
    private static void getPoligono(Poligono poligono) {
        if (poligono instanceof Triangulo) {
            System.out.println("Es un triangulo");
        } else if (poligono instanceof Cuadrilatero) {
            System.out.println("Es un Cuadrilatero");
        } else {
            System.out.println("Es un poligono");
        }
    }
}
