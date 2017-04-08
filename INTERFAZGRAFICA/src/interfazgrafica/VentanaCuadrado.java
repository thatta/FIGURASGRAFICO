/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public class VentanaCuadrado extends JFrame{
    private Imagen imagen;
    
    private MenuOpciones opciones;
    
    private BotonCuadrado botones;
    
    private PanelCuadrado panelCuadrado;
    
    /**
     *
     */
    public VentanaCuadrado (){
        
        setSize(700, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("TRABAJO FIGURAS");
        getContentPane().setLayout(new BorderLayout());
        
        imagen = new Imagen();
        getContentPane().add(imagen, BorderLayout.NORTH);
        
        botones = new BotonCuadrado(this);
        getContentPane().add(botones, BorderLayout.WEST);
        
        opciones = new MenuOpciones();
        getContentPane().add(opciones, BorderLayout.SOUTH);
        
        panelCuadrado = new PanelCuadrado(this);
        getContentPane().add(panelCuadrado, BorderLayout.CENTER);
        

        setVisible(true);
        

    }

    /**
     *
     * @return
     */
    public Imagen getImagen() {
        return imagen;
    }

    /**
     *
     * @param imagen
     */
    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    /**
     *
     * @return
     */
    public MenuOpciones getOpciones() {
        return opciones;
    }

    /**
     *
     * @param opciones
     */
    public void setOpciones(MenuOpciones opciones) {
        this.opciones = opciones;
    }

    /**
     *
     * @return
     */
    public BotonCuadrado getBoton() {
        return botones;
    }

    /**
     *
     * @param botones
     */
    public void setBoton(BotonCuadrado botones) {
        this.botones = botones;
    }

    /**
     *
     * @return
     */
    public PanelCuadrado getPanelCuadrado() {
        return panelCuadrado;
    }

    /**
     *
     * @param panelCuadrado
     */
    public void setPanelTriangulo(PanelCuadrado panelCuadrado) {
        this.panelCuadrado = panelCuadrado;
    }

}

