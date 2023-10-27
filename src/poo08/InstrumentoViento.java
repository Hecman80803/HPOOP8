/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo08;

/**
 *
 * @author poo08alu34
 */
public class InstrumentoViento extends Object implements InstrumentoMusical {

    /**
     * Constructor sin argumentos de la clase InstrumentoViento.
     */
    public InstrumentoViento() {
    }

    /**
     * Sobrescribe el método "tipoInstrumento" de la interfaz InstrumentoMusical para obtener el tipo de instrumento, que es "instrumentoViento".
     *
     * @return Una cadena que representa el tipo de instrumento, que en este caso es "instrumentoViento".
     */
    @Override
    public String tipoInstrumento() {
        return "instrumentoViento";
    }

    /**
     * Sobrescribe el método "tocar" de la interfaz InstrumentoMusical para simular el acto de tocar un instrumento de viento.
     */
    @Override
    public void tocar() {
        System.out.println("Tocas instrumento de viento");
    }

    /**
     * Sobrescribe el método "afinal" de la interfaz InstrumentoMusical para simular el acto de afinar un instrumento de viento.
     */
    @Override
    public void afinal() {
        System.out.println("Afinar instrumento de viento");
    }

    /**
     * Sobrescribe el método "toString" para obtener una representación en forma de cadena del instrumento de viento.
     *
     * @return Una cadena que representa el instrumento de viento.
     */
    @Override
    public String toString() {
        return "InstrumentoViento{}";
    }
    
    
}
