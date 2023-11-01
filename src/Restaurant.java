import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Restaurant extends JFrame{
    //Atributes dishes
    String nombre;
    String descripcion;
    int costo;
    short tiempoPre;
    Tipo tipo;
    private ArrayList<Platos> lista = new ArrayList<>();


    //Interfaz resources
    JComboBox menu;

    public Restaurant(){    //Interfaz beginning
        rellenar_menu();

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        menu = new JComboBox<>();
        menu.addItem("- -");
        
        for(Platos plato: lista){
            menu.addItem(plato.getNombre());
        }
        add(menu);

        //menu.addItem("Mondongo");
        menu.setBounds(220,213,220,25);
        menu.setBackground(new java.awt.Color(224, 224, 224));
        menu.setFont(new java.awt.Font("Andale Mono", 1, 14));
        menu.setForeground(new java.awt.Color(255, 0, 0));
        
    }

    public void rellenar_menu(){
        try {
            byte opcion;
            do {
                opcion = Byte.parseByte(JOptionPane.showInputDialog("Ingrese la opcion que desea ejecutar\n1- INSERTAR PLATO \n2 - FACTURA"));
            switch (opcion) {
                case 1:
                    crearPlato();
                    break;
                case 2:
                    System.out.println("Ha decidido salir del menu");
                    break;
                default:
                    System.out.println("Opcion no válida. Intente nuevamente.");
            }
        } while (opcion != 2);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Dato equivocado, do it again");
        }
        
    }

    private void crearPlato(){
        String tipoPlato;
        try{
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del plato");
            descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del plato");
            costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del plato"));
            tiempoPre = Short.parseShort(JOptionPane.showInputDialog("Ingrese el tiempo de preparacion del plato"));
            tipoPlato =  JOptionPane.showInputDialog("Ingrese el tipo del plato");
            Tipo tipo = Tipo.valueOf(tipoPlato.toUpperCase());
            lista.add(new Platos(nombre, descripcion, costo, tiempoPre, tipo));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Dato equivocado, do it again");
        }
        
    }
}




