package tp3;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TP3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Login log = new Login();

      
        
        // Cargar el icono para el JFrame
        ImageIcon icon = new ImageIcon("mensaje.png"); // Asegúrate de proporcionar la ruta correcta al icono
        log.setIconImage(icon.getImage());

        // Ajustar el tamaño y hacer visible el JFrame
        log.setResizable(false);
        log.setVisible(true);
    }
    
}
