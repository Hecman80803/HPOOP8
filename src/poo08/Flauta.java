/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo08;

/**
 *
 * @author poo08alu34
 */
public class Flauta extends InstrumentoViento {
    /**
     * Sobrescribe el método "tipoInstrumento" de la clase InstrumentoViento para obtener el tipo de instrumento, que es "flauta".
     *
     * @return Una cadena que representa el tipo de instrumento, que en este caso es "flauta".
     */
    @Override
    public String tipoInstrumento() {
        return "flauta";
    }

    /**
     * Sobrescribe el método "toString" para obtener una representación en forma de cadena de la flauta.
     *
     * @return Una cadena que representa la flauta.
     */
    @Override
    public String toString() {
        return "Flauta{}";
    }
}
