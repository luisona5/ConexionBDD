import javax.swing.*;
import java.awt.*;
import java.sql.*;
public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("\t Programacion (POO)");
        // conectar la interfaz con el main
        // e; contido del panel
        frame.setContentPane(new interfaz().interfaz_conexion);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // para ajustar el tamaño
        frame.setSize(1020,850);
        // para una nueva dimension
        frame.setPreferredSize(new Dimension(440,330));
        frame.pack();
        // para q nos muestre la ventana de como nos esta quedando
        frame.setVisible(true);

    }
}