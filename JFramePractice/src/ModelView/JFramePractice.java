
package ModelView;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JFramePractice{


    public static void main(String[] args) {
        JFrame root = CreacionFrame();
        //CheckButtonDemo.GenerarRoot(root);
        RadioButtonDemo.MostrarDemo(root);
        
        //Configuación del marco
        
//        JFrame ventanita = new JFrame("Nueva ventana") ;   
//        
//        ventanita.setVisible(true);     
//        ventanita.setDefaultCloseOperation(3);
//        ventanita.setBounds(100, 100, 500, 500);
//
//           
//        //Panel principal
//        JPanel panel = new JPanel();
//        panel.setBackground(Color.red);
//        //panel.setLayout(null);
//        ventanita.add(panel);
//        
//        //Boton
//        JButton boton = new JButton("Boton");
//        boton.setBounds(50, 50, 200, 100);
//        panel.add(boton);
//        
//        //Etiqueta
//        JLabel etiqueta = new JLabel("Etiqueta");
//        etiqueta.setBounds(50, 50, 20, 20);
//        panel.add(etiqueta);
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    public static JFrame CreacionFrame(){
        JFrame root = new JFrame("");
        root.setVisible(true);
        root.setBounds(100, 100, 500, 500);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return root;
    }
}
