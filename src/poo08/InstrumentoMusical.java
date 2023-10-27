/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poo08;

/**
 *
 * @author poo08alu34
 */
public interface InstrumentoMusical {
  /**
     * Método que representa tocar el instrumento musical.
     * Las clases que implementen esta interfaz deben proporcionar una implementación específica de cómo se toca el instrumento.
     */
    void tocar();

    /**
     * Método que representa afinar el instrumento musical.
     * Las clases que implementen esta interfaz deben proporcionar una implementación específica de cómo se afina el instrumento.
     */
    void afinal();

    /**
     * Método que devuelve el tipo de instrumento musical.
     *
     * @return Una cadena que representa el tipo de instrumento.
     */
    String tipoInstrumento();
}
