import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.Container;
import java.util.ArrayList;
import java.util.Scanner;

public class Interfaz extends JFrame{
    
    Container contenedor;
    private JComboBox menu;

    


    public Interfaz(){
        //contenedor = getContentPane();
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        menu = new JComboBox<>();
        add(menu);

        menu.addItem("Mondongo");
        menu.setBounds(220,213,220,25);
        menu.setBackground(new java.awt.Color(224, 224, 224));
        menu.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menu.setForeground(new java.awt.Color(255, 0, 0));
        
    }

    public static void main(String[] args) {
        Interfaz window = new Interfaz();
        window.setBounds(0,0,640,535);
        window.setVisible(true);
        window.setResizable(false);
        window.setLocationRelativeTo(null);
    }
}
