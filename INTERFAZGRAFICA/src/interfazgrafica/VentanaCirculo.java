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
public class VentanaCirculo extends JFrame{
    private Imagen imagen;
    
    private MenuOpciones opciones;
    
    private BotonCirculo botones;
    
    private PanelCirculo panelCirculo;
    
    /**
     *
     */
    public VentanaCirculo(){
        
        setSize(700, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("TRABAJO FIGURAS");
        getContentPane().setLayout(new BorderLayout());
        
        imagen = new Imagen();
        getContentPane().add(imagen, BorderLayout.NORTH);
        
        botones = new BotonCirculo(this);
        getContentPane().add(botones, BorderLayout.WEST);
        
        opciones = new MenuOpciones();
        getContentPane().add(opciones, BorderLayout.SOUTH);
        
        panelCirculo = new PanelCirculo(this);
        getContentPane().add(panelCirculo, BorderLayout.CENTER);
        

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
    public BotonCirculo getBotones() {
        return botones;
    }

    /**
     *
     * @param botones
     */
    public void setBotones(BotonCirculo botones) {
        this.botones = botones;
    }

    /**
     *
     * @return
     */
    public PanelCirculo getPanelCirculo() {
        return panelCirculo;
    }

    /**
     *
     * @param panelCirculo
     */
    public void setPanelCirculo(PanelCirculo panelCirculo) {
        this.panelCirculo = panelCirculo;
    }

}
