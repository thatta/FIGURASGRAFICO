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
public class Botones extends JPanel implements ActionListener{
    
    String x1, x2, x3, y1, y2, y3;
    double a1, a2, a3, b1, b2, b3;
    Triangulo triangulo;

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
    
    private VentanaTriangulo principal;
    private AreayPerimetro areayperimetro;

    /**
     *
     * @param principal
     */
    public Botones(VentanaTriangulo principal){
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
        Puntos puntoC = new Puntos(4, 4);
               
        puntoA = new Puntos(0, 0);
        puntoB = new Puntos(4, 0);
        puntoC = new Puntos(2, 2);
        areayperimetro = new Triangulo(puntoA, puntoB, puntoC);
        areayperimetro.hallarInformacion();
        
        DecimalFormat numero = new DecimalFormat("#0.0000");
        
        LArea = new JLabel("Area:" + numero.format(areayperimetro.getArea()));
        add(LArea);
        
        LPerimetro = new JLabel("Perimetro:" + numero.format(areayperimetro.getPerimetro()));
        add(LPerimetro);
        
        LAltura = new JLabel("Altura:" + numero.format(areayperimetro.getAltura()));
        add(LAltura);
        
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
           if(BOTON_COLOR_FONDO.equals(e.getActionCommand())){
            JColorChooser color = new JColorChooser();
                Color cl = color.showDialog(this, "SELECCIONE COLOR", Color.GRAY);
                this.principal.getPanelTriangulo().setColorFondo(cl);
                this.principal.getPanelTriangulo().repaint();
            }
           else if (BOTON_COLOR_LINEA.equals(e.getActionCommand())){
                JColorChooser color = new JColorChooser();
                Color cl = color.showDialog(this, "SELECCIONE COLOR", Color.GRAY);
                this.principal.getPanelTriangulo().setColorLinea(cl);
                this.principal.getPanelTriangulo().repaint();
                
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
        x3 = JOptionPane.showInputDialog(botonPunto,"Digite coordenada x3");
        a3 = Double.parseDouble(x3);
        y3 = JOptionPane.showInputDialog(botonPunto,"Digite coordenada y3");
        b3 = Double.parseDouble(y3);
        
        Puntos puntoA = new Puntos(a1, b1);
        Puntos puntoB = new Puntos(a2, b2);
        Puntos puntoC = new Puntos(a3, b3);
        areayperimetro = new Triangulo(puntoA, puntoB, puntoC);
        areayperimetro.hallarInformacion();
        
        DecimalFormat numero = new DecimalFormat("#0.000");

        
        LArea.setText("Area:" + numero.format(areayperimetro.getArea()));
        LPerimetro.setText("Perimetro:" + numero.format(areayperimetro.getPerimetro()));
        LAltura.setText("Altura:" + numero.format(areayperimetro.getAltura()));
        
        this.principal.getPanelTriangulo().setPuntoA(puntoA);
        this.principal.getPanelTriangulo().setPuntoB(puntoB);
        this.principal.getPanelTriangulo().setPuntoC(puntoC);
        this.principal.getPanelTriangulo().repaint();

    }


}