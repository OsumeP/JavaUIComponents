
package ModelView;


import javax.swing.JFrame;


public class JFramePractice{


    public static void main(String[] args) {
        JFrame root = CreacionFrame();
        //CheckButtonDemo.GenerarRoot(root);
        //RadioButtonDemo.MostrarDemo(root);
        //ComboBoxDemo.CBDemostracion(root);
        ListDemo.MostrarLista(root);
    }
    public static JFrame CreacionFrame(){
        JFrame root = new JFrame("");
        root.setBounds(100, 100, 500, 500);
        root.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return root;
    }
}
