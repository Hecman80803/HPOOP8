/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo08;

/**
 *
 * @author poo08alu34
 */
public abstract class Poligono extends Object{

    /**
     * Constructor sin argumentos de la clase Poligono.
     */
    public Poligono() {
    }

    /**
     * Método abstracto para calcular el área del polígono.
     * Las clases derivadas deben proporcionar una implementación concreta de este método.
     *
     * @return El área del polígono como un entero.
     */
    public abstract int area();

    /**
     * Método abstracto para calcular el perímetro del polígono.
     * Las clases derivadas deben proporcionar una implementación concreta de este método.
     *
     * @return El perímetro del polígono como un entero.
     */
    public abstract int perimetro();

    /**
     * Sobrescribe el método "toString" para obtener una representación en forma de cadena del polígono.
     *
     * @return Una cadena que representa el polígono.
     */
    @Override
    public String toString() {
        return "Poligono{}";
    }
}
