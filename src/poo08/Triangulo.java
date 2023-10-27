/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo08;

/**
 *
 * @author poo08alu34
 */
public class Triangulo extends Poligono {
    private int alfa, beta, gama; // Ángulos internos del triángulo
    private float a, b, c; // Lados del triángulo
    private float base, alt; // Base y altura del triángulo

    /**
     * Constructor sin argumentos de la clase Triangulo.
     */
    public Triangulo() {
    }
    
    /**
     * Constructor con argumentos de la clase Triangulo.
     *
     * @param alfa  Ángulo alfa del triángulo.
     * @param beta  Ángulo beta del triángulo.
     * @param gama  Ángulo gama del triángulo.
     * @param a     Lado a del triángulo.
     * @param b     Lado b del triángulo.
     * @param c     Lado c del triángulo.
     * @param base  Base del triángulo.
     * @param alt   Altura del triángulo.
     */
    public Triangulo(int alfa, int beta, int gama, float a, float b, float c, float base, float alt) {
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
     * Sobrescribe el método "area" de la clase Poligono para calcular el área del triángulo.
     *
     * @return El área del triángulo como un entero.
     */
    @Override
    public int area(){
        return (int)(base*alt)/2;
        
    }
    
    /**
     * Sobrescribe el método "perimetro" de la clase Poligono para calcular el perímetro del triángulo.
     *
     * @return El perímetro del triángulo como un entero.
     */
    @Override
    public int perimetro(){
        return (int)(a+b+c);
    }
    
    
     /**
     * Sobrescribe el método "toString" para obtener una representación en forma de cadena del triángulo.
     *
     * @return Una cadena que representa el triángulo y sus atributos.
     */
    @Override
    public String toString() {
        return "Triangulo{" + "alfa=" + alfa + ", beta=" + beta + ", gama=" + gama + ", a=" + a + ", b=" + b + ", c=" + c + ", base=" + base + ", alt=" + alt + '}';
    }   

}
