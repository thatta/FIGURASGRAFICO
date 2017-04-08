/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Tatiana Almansa
 * @author Juan David Ojeda
 */
public class MenuOpciones extends JPanel implements ActionListener{
    private JButton botonOpcion1;
    private JButton botonOpcion2;
    private JButton botonOpcion3;
    private VentanaTriangulo ventanatriangulo;
    private VentanaCuadrado ventanacuadrado;
    private VentanaCuadrado ventanacirculo;
    
    private static final String OPCION_1 = "OPCION 1";
    private static final String OPCION_2 = "OPCION 2";
    private static final String OPCION_3 = "OPCION 3";
    
    /**
     *
     */
    public MenuOpciones(){
        
        setBackground(Color.WHITE);
        setBorder(new TitledBorder("Opciones"));
        setLayout(new GridLayout(1,2));
        
        botonOpcion1 = new JButton("Triangulo");
        botonOpcion1.addActionListener(this);
        botonOpcion1.setActionCommand(OPCION_1);
        add(botonOpcion1);
        
        botonOpcion2 = new JButton("Cuadrado");
        botonOpcion2.addActionListener(this);
        botonOpcion2.setActionCommand(OPCION_2);
        add(botonOpcion2);
        
        botonOpcion3 = new JButton("Circulo");
        botonOpcion3.addActionListener(this);
        botonOpcion3.setActionCommand(OPCION_3);
        add(botonOpcion3);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(OPCION_1.equals(e.getActionCommand())){
            ventanatriangulo =new VentanaTriangulo();
        }
        else if (OPCION_2.equals(e.getActionCommand())){
            ventanacuadrado =new VentanaCuadrado();
        }else if(OPCION_3.equals(e.getActionCommand())){
            ventanacirculo =new VentanaCuadrado();
        }
    }
}
