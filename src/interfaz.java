import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class interfaz {
    private JTextField logintxt;
    private JPasswordField passwordtxt;
    public JPanel interfaz_conexion;
    private JButton Button;

    public interfaz() {

        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/informacionC";
                String username = "root";
                String password = "1234";

                try{
                    String parametro1=logintxt.getText();
                    String parametro2=passwordtxt.getText();
                    Connection con = DriverManager.getConnection(url,username,password);
                    System.out.println("BIENVENIDO");
                    Statement stmt = con.createStatement();
                    String query = "SELECT * FROM personas where nombres= "+parametro1;

                    ResultSet rs = stmt.executeQuery(query);
                    while(rs.next()){
                        System.out.println(rs.getString("identificacion"));
                        System.out.println(rs.getString("nombres"));
                        System.out.println(rs.getString("apellidos"));
                        System.out.println(rs.getString("telefono"));
                        System.out.println(rs.getString("correo"));
                        System.out.println(rs.getString("direccion"));
                    }
                    con.close();
                } catch (SQLException e1) {
                    throw new RuntimeException(e1);
                }



            }
        });
    }


}
