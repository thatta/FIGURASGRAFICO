/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public abstract class AreayPerimetro implements Operaciones {
    
    private Puntos puntoA;
    
    private Puntos puntoB;
    
    private double area;
    
    private double perimetro;
    
    private double altura;
    
    private double radio;
    
    /**
     *
     */
    public static final double PI = 3.1416;

    /**
     *
     * @param puntoA
     * @param puntoB
     */
    public AreayPerimetro (Puntos puntoA, Puntos puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }
    
    /**
     *
     * @param puntoAuxA
     * @param puntoAuxB
     * @return
     */
    protected double hallarLado(Puntos puntoAuxA, Puntos puntoAuxB) {
        double auxiliarX = Math.pow(puntoAuxB.getX() - puntoAuxA.getX(), 2);
        double auxiliarY = Math.pow(puntoAuxB.getY() - puntoAuxA.getY(), 2);        
        double lado = Math.sqrt(auxiliarX +  auxiliarY);
        return lado;                
    }
                
    /**
     *
     * @return
     */
    public Puntos getPuntoA() {
        return puntoA;
    }

    /**
     *
     * @param puntoA
     */
    public void setPuntoA(Puntos puntoA) {
        this.puntoA = puntoA;
    }

    /**
     *
     * @return
     */
    public Puntos getPuntoB() {
        return puntoB;
    }

    /**
     *
     * @param puntoB
     */
    public void setPuntoB(Puntos puntoB) {
        this.puntoB = puntoB;
    }

    /**
     *
     * @return
     */
    public double getArea() {
        return area;
    }

    /**
     *
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     *
     * @return
     */
    public double getAltura() {
        return altura;
    }

    /**
     *
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     *
     * @return
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     *
     * @param perimetro
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    /**
     *
     * @return
     */
    public double getRadio() {
        return radio;
    }

    /**
     *
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
}