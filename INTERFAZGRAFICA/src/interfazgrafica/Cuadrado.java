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
public class Cuadrado extends AreayPerimetro{
    private Puntos puntoC;
    private Puntos puntoD;

    /**
     *
     * @param puntoC
     * @param puntoD
     * @param puntoA
     * @param puntoB
     */
    public Cuadrado(Puntos puntoC, Puntos puntoD, Puntos puntoA, Puntos puntoB) {
        super(puntoA, puntoB);
        this.puntoC = puntoC;
        this.puntoD = puntoD;
    }

    /**
     *
     */
    @Override
    public void hallarInformacion() {
        
        double lado1 = hallarLado(this.getPuntoA(), this.getPuntoB());
        double lado2 = hallarLado(this.getPuntoB(), this.puntoC);
        double lado3 = hallarLado(this.puntoC, this.getPuntoA());
        double lado4 = hallarLado(this.puntoD, this.getPuntoA());
        this.setPerimetro(lado1+lado2+lado3+lado4);
        this.setArea (lado1*lado2);
    }    
}
