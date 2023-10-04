/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Juan David Patarroyo
 */
public class ComboBoxDemo {
    public static void CBDemostracion(JFrame root){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        root.add(panel);
        
        JLabel lRojo = new JLabel("Rojo:");
        lRojo.setBounds(10, 10, 100, 30);
        panel.add(lRojo);
        
        JComboBox cbRojo = new JComboBox<String>();
        cbRojo.setBounds(120, 10, 50, 30);
        for (int i = 0; i <= 255; i++){
            cbRojo.addItem(String.valueOf(i));
        }
        panel.add(cbRojo);
        
        JLabel lVerde = new JLabel("Verde:");
        lVerde.setBounds(10, 50, 100, 30);
        panel.add(lVerde);
        
        JComboBox cbVerde = new JComboBox<String>();
        cbVerde.setBounds(120, 50, 50, 30);
        for (int i = 0; i <= 255; i++){
            cbVerde.addItem(String.valueOf(i));
        }
        panel.add(cbVerde);
        
        JLabel lAzul = new JLabel("Azul:");
        lAzul.setBounds(10, 90, 100, 30);
        panel.add(lAzul);
        
        JComboBox cbAzul = new JComboBox<String>();
        cbAzul.setBounds(120, 90, 50, 30);
        for (int i = 0; i <= 255; i++){
            cbAzul.addItem(String.valueOf(i));
        }
        panel.add(cbAzul);
        
        JButton btnInsertarColor = new JButton("Clickeame");
        btnInsertarColor.setBounds(10, 130, 100, 30);
        panel.add(btnInsertarColor);
        
        ActionListener actionListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String strColor1 = (String)cbVerde.getSelectedItem();
                int Color1 = Integer.parseInt(strColor1);
                String strColor2 = (String)cbRojo.getSelectedItem();
                int Color2 = Integer.parseInt(strColor2);
                String strColor3 = (String)cbAzul.getSelectedItem();
                int Color3 = Integer.parseInt(strColor3);
                
                Color Color = new Color(Color2, Color1, Color3);
                btnInsertarColor.setBackground(Color);
            }
        };
        
        btnInsertarColor.addActionListener(actionListener);
        
        root.setVisible(true);
    }
}
