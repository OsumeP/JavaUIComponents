/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Juan David Patarroyo
 */
public class RadioButtonDemo {
    public static void MostrarDemo(JFrame root){
        root.setSize(500, 700);
        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        root.add(panel);
        
        JPanel panelColor = new JPanel();
        panelColor.setBounds(0, 0, 500, 200);
        panelColor.setBackground(Color.red);
        panel.add(panelColor);
        
        ButtonGroup grupo = new ButtonGroup();
        
        JRadioButton radioRojo = new JRadioButton("Rojo", true);
        radioRojo.setBounds(200, 250, 100, 20);
        panel.add(radioRojo);
        grupo.add(radioRojo);
        
        JRadioButton radioVerde = new JRadioButton("Verde");
        radioVerde.setBounds(200, 300, 100, 20);
        panel.add(radioVerde);
        grupo.add(radioVerde);
        
        JRadioButton radioAzul = new JRadioButton("Azul");
        radioAzul.setBounds(200, 200, 100, 20);
        panel.add(radioAzul);
        grupo.add(radioAzul);
        
        JButton btnCambiarColor = new JButton("Clickeame");
        btnCambiarColor.setBounds(200, 350, 100, 30);
        panel.add(btnCambiarColor);
        
        ActionListener actionListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (radioRojo.isSelected()){
                    panelColor.setBackground(Color.red);
                }
                if (radioAzul.isSelected()){
                    panelColor.setBackground(Color.blue);
                }
                if (radioVerde.isSelected()){
                    panelColor.setBackground(Color.green);
                }
            }
        };
        btnCambiarColor.addActionListener(actionListener);
        root.setVisible(true);
    }
}
