/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelView;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


/**
 *
 * @author Juan David Patarroyo
 */
public class CheckButtonDemo{
    
    public static void GenerarRoot(JFrame root){        
        JPanel panel = new JPanel();
        panel.setLayout(null);
        root.add(panel);
        
        JCheckBox checkEspanol = new JCheckBox("Español");
        checkEspanol.setBounds(200, 250, 100, 50);
        panel.add(checkEspanol);
        
        JCheckBox checkIngles = new JCheckBox("Inglés");
        checkIngles.setBounds(200, 300, 100, 50);
        panel.add(checkIngles);
        
        JCheckBox checkFrances = new JCheckBox("Frances");
        checkFrances.setBounds(200, 350, 100, 50);
        panel.add(checkFrances);
        
        JLabel titulo = new JLabel("El idioma seleccionado  es:");
        titulo.setBounds(200, 100, 300, 20);
        panel.add(titulo);
        
        ChangeListener changeListen = new ChangeListener(){
            @Override
            public void stateChanged(ChangeEvent event){
                String idiomas = "";
                if (checkEspanol.isSelected()){
                    idiomas += " Español";
                }
                if (checkIngles.isSelected()){
                    idiomas += " Inglés";
                }
                if (checkFrances.isSelected()){
                    idiomas += " Francés";
                } 
                titulo.setText("El idioma seleccionado  es:" + idiomas);
            }
        };
        checkEspanol.addChangeListener(changeListen);
        checkFrances.addChangeListener(changeListen);
        checkIngles.addChangeListener(changeListen);
    }

}
