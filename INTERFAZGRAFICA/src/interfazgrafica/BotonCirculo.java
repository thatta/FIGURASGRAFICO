/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public class BotonCirculo extends JPanel implements ActionListener{
    
    String x1, x2, x3,x4, y1, y2, y3,y4;
    double a1, a2, a3,a4, b1, b2, b3,b4;
    Circulo cuadrado;

    /**
     *
     */
    public JButton botonColorFondo;
    private JButton botonPunto;
    private JButton botonColorLinea;
    private JLabel LArea;
    private JLabel LPerimetro;
    private JLabel LAltura;
    
    /**
     *
     */
    public static final String BOTON_COLOR_FONDO = "COLORFONDO";
    private static final String BOTON_COLOR_LINEA = "COLORLINEA";
    private static final String BOTON_PUNTO = "PUNTO";
    
    private VentanaCirculo principal;
    private AreayPerimetro areayperimetro;

    /**
     *
     * @param principal
     */
    public BotonCirculo(VentanaCirculo principal){
        this.principal=principal;
        setBackground(Color.WHITE);
        setLayout(new GridLayout(6, 1));
        
        botonColorFondo = new JButton ("Cambiar fondo");
        botonColorFondo.addActionListener((ActionListener) this);
        botonColorFondo.setActionCommand(BOTON_COLOR_FONDO);
        add(botonColorFondo, BorderLayout.WEST);

        
        botonColorLinea = new JButton ("Cambiar linea");
        botonColorLinea.addActionListener((ActionListener) this);
        botonColorLinea.setActionCommand(BOTON_COLOR_LINEA);
        add(botonColorLinea);
        
        botonPunto = new JButton ("Cambiar punto");
        botonPunto.addActionListener((ActionListener) this);
        botonPunto.setActionCommand(BOTON_PUNTO);
        add(botonPunto);
       
        Puntos puntoA = new Puntos(0, 0);
        Puntos puntoB = new Puntos(4, 0);
               
        puntoA = new Puntos(0, 0);
        puntoB = new Puntos(4, 0);
        areayperimetro = new Circulo(puntoA,puntoB);
        areayperimetro.hallarInformacion();
        
        DecimalFormat numero = new DecimalFormat("#0.0000");
        
        LArea = new JLabel("Area:" + numero.format(areayperimetro.getArea()));
        add(LArea);
        
        LPerimetro = new JLabel("Radio:" + numero.format(areayperimetro.getRadio()));
        add(LPerimetro);
        
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
           if(BOTON_COLOR_FONDO.equals(e.getActionCommand())){
            JColorChooser color = new JColorChooser();
                Color cl = color.showDialog(this, "SELECCIONE COLOR", Color.GRAY);
                this.principal.getPanelCirculo().setColorFondo(cl);
                this.principal.getPanelCirculo().repaint();
            }
           else if (BOTON_COLOR_LINEA.equals(e.getActionCommand())){
                JColorChooser color = new JColorChooser();
                Color cl = color.showDialog(this, "SELECCIONE COLOR", Color.GRAY);
                this.principal.getPanelCirculo().setColorLinea(cl);
                this.principal.getPanelCirculo().repaint();
                
        }
        else if (BOTON_PUNTO.equals(e.getActionCommand())){
            pidePuntos();
            
        }
    }
    
    /**
     *
     */
    public void pidePuntos(){
        x1 = JOptionPane.showInputDialog(botonPunto,"Digite coordenada x1");
        a1 = Double.parseDouble(x1);
        y1 = JOptionPane.showInputDialog(botonPunto,"Digite coordenada y1");
        b1 = Double.parseDouble(y1);
        x2 = JOptionPane.showInputDialog(botonPunto,"Digite coordenada x2");
        a2 = Double.parseDouble(x2);
        y2 = JOptionPane.showInputDialog(botonPunto,"Digite coordenada y2");
        b2 = Double.parseDouble(y2);
        
        Puntos puntoA = new Puntos(a1, b1);
        Puntos puntoB = new Puntos(a2, b2);
        areayperimetro = new Circulo(puntoA,puntoB);
        areayperimetro.hallarInformacion();
        
        DecimalFormat numero = new DecimalFormat("#0.000");

        
        LArea.setText("Area:" + numero.format(areayperimetro.getArea()));
        LPerimetro.setText("Radio:" + numero.format(areayperimetro.getRadio()));
        
        this.principal.getPanelCirculo().setPuntoA(puntoA);
        this.principal.getPanelCirculo().setPuntoB(puntoB);
        this.principal.getPanelCirculo().repaint();

    }


}