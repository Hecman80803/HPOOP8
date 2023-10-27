/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo08;

/**
 *
 * @author poo08alu34
 */
public class Cuadrilatero extends Poligono {

    private int alfa, beta, gama; //Angulos internos del cuadrilatero
    private float a, b, c, base, alt; //lados del cuadrilatero/Base y altura del cuadrilatero
    
    /**
     * Constructor sin argumentos de la clase Cuadrilatero
     */
    public Cuadrilatero() {
    }
    
    /**
     * Constructor con argumentos de la clase Cuadrilatero.
     *
     * @param alfa  Ángulo alfa del cuadrilátero.
     * @param beta  Ángulo beta del cuadrilátero.
     * @param gama  Ángulo gama del cuadrilátero.
     * @param a     Lado a del cuadrilátero.
     * @param b     Lado b del cuadrilátero.
     * @param c     Lado c del cuadrilátero.
     * @param base  Base del cuadrilátero.
     * @param alt   Altura del cuadrilátero.
     */
    
    public Cuadrilatero(int alfa, int beta, int gama, float a, float b, float c, float base, float alt) {
        this.alfa = alfa;
        this.beta = beta;
        this.gama = gama;
        this.a = a;
        this.b = b;
        this.c = c;
        this.base = base;
        this.alt = alt;
    }
    
      // Métodos get y set para los atributos

    public int getAlfa() {
        return alfa;
    }
    
    public void setAlfa(int alfa) {
        this.alfa = alfa;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public int getGama() {
        return gama;
    }

    public void setGama(int gama) {
        this.gama = gama;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAlt() {
        return alt;
    }

    public void setAlt(float alt) {
        this.alt = alt;
    }
    
    /**
     * Sobrescribe el método "area" de la clase Poligono para calcular el área del cuadrilátero.
     *
     * @return El área del cuadrilátero como un entero.
     */

   @Override
    public int area(){
        return (int)(base*alt);
        
    }
    
        /**
     * Sobrescribe el método "perimetro" de la clase Poligono para calcular el perímetro del cuadrilátero.
     *
     * @return El perímetro del cuadrilátero como un entero.
     */
    
    @Override
    public int perimetro(){
        return (int)(2*a+2*b);
    }
    
     /**
     * Sobrescribe el método "toString" para obtener una representación en forma de cadena del cuadrilátero.
     *
     * @return Una cadena que representa los atributos del cuadrilátero.
     */

    @Override
    public String toString() {
        return "Cuadrilatero{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", alt=" + alt + '}';
    }
   
}
