/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Juan David Patarroyo
 */
public class ListDemo {
    public static void MostrarLista(JFrame root){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        root.add(panel);
        
        JTextField inNombre = new JTextField();
        inNombre.setBounds(10, 30, 200, 30);
        panel.add(inNombre);
        
        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(250, 30, 100, 30);
        panel.add(btnAgregar);
        
        String nombres[] = {"Pedro", "Laura", "Nicolás"};
        
        JList lsNombres = new JList(nombres);
        lsNombres.setBounds(10, 70, 350, 250);
        panel.add(lsNombres);
        
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < nombres.length; i++){
            model.addElement(nombres[i]);
        }
        
        ActionListener actionListener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event){
                if (!inNombre.getText().equals("")){
                    model.addElement(inNombre.getText());
                    lsNombres.setModel(model);
                }
            }
        };
        
        btnAgregar.addActionListener(actionListener);
        
        root.setVisible(true);
    }
}
