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
public class Circulo extends AreayPerimetro{
    private Puntos puntoC;
    private Puntos puntoD;

    /**
     *
     * @param puntoA
     * @param puntoB
     */
    public Circulo(Puntos puntoA, Puntos puntoB) {
        super(puntoA, puntoB);
    }

    /**
     *
     */
    @Override
    public void hallarInformacion() {
        
        double lado1 = hallarLado(this.getPuntoA(), this.getPuntoB());
        this.setRadio(lado1);
        this.setArea (PI*lado1*lado1);
    }    
}

