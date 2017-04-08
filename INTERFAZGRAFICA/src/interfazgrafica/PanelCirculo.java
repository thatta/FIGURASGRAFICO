/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public class PanelCirculo extends JPanel{

    /**
     *
     */
    public Color colorLinea;

    /**
     *
     */
    public Color colorFondo;

    /**
     *
     */
    public Puntos puntoA;

    /**
     *
     */
    public Puntos puntoB;

    private VentanaCirculo principal;
    private BotonCuadrado botones;
    
    /**
     *
     * @param principal
     */
    public PanelCirculo(VentanaCirculo principal) {
        this.principal =principal;
        setBackground(Color.LIGHT_GRAY);
        
        
    }
    
    
      
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        this.botones = botones;
        g.setColor(Color.BLACK);
        g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
        g.drawLine(this.getWidth()/2, 0,this.getWidth()/2 , this.getHeight());
 
        
        Graphics2D grafico = (Graphics2D) g;
        Polygon polygon = new Polygon();
        if(puntoA != null){
        g.drawOval(((int)puntoA.getX()+(this.getWidth()/2)),((this.getHeight()/2)-(int)puntoA.getY()) ,((this.getWidth()/2)+(int) puntoB.getX()), ((this.getHeight()/2)-(int)puntoB.getY()));
        grafico.setColor(colorFondo);
        }
        grafico.setColor(colorFondo);
        grafico.setColor(colorLinea);
    }

    /**
     *
     * @return
     */
    public Color getColorLinea() {
        return colorLinea;
    }

    /**
     *
     * @param colorLinea
     */
    public void setColorLinea(Color colorLinea) {
        this.colorLinea = colorLinea;
    }

    /**
     *
     * @return
     */
    public Color getColorFondo() {
        return colorFondo;
    }

    /**
     *
     * @param colorFondo
     */
    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
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
    
}

