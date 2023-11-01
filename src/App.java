import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("Ejemplo de TextArea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JTextArea textArea = new JTextArea("Este es un ejemplo de TextArea.\nPuedes editar este texto.");
        textArea.setLineWrap(true); // Hace que el texto se ajuste automáticamente a las líneas.
        textArea.setWrapStyleWord(true); // Rompe palabras largas si no caben en una línea.
        textArea.setEditable(true); // Puedes cambiar esto a false para hacer el TextArea no editable.

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
