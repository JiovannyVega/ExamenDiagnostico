package Metodos;

import static LogIn.Menu.Login1.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Conexion {

    public static boolean login(Statement st, String nombre, String contrseña) {
        int cont = 0;

        try {
            ResultSet rs = st.executeQuery("select * from Admin");
            while (rs.next()) {
                if (nombre.equals(rs.getString("Nombre")) && contrseña.equals(rs.getString("Contraseña"))) {
                    cont++;
                    return true;
                }
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                System.out.println("Usuario o contraseña incorrectos");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static void mostrar(Statement st, ResultSet rs) {
        try {
            rs = st.executeQuery("select * from usuarios");
            while (rs.next()) {
                System.out.println("Usuario:" + rs.getString("Nombre") + "\nContraseña: " + rs.getString("contraseña") + "\n");
            }
            //con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void mostrarCP(Statement st, int cp, JTextField estado, JTextField municipio, JTextField colonia) {
        try {
            ResultSet rs = st.executeQuery("select * from codigoPostal where id = " + cp);
            rs.next();
            estado.setText(rs.getString("estado"));
            //ciudad.setText(rs.getString("ciudad"));
            municipio.setText(rs.getString("ciudad"));
            colonia.setText(rs.getString("colonia"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void mostrarNC(JTextField txtNumControl) {
        try {
            Statement st = LogIn.Menu.Login1.con.createStatement();
            int max = 0;
            ResultSet rs = st.executeQuery("select NumControl from alumno");
            while (rs.next()) {
                max = Math.max(max, rs.getInt("NumControl"));
            }
            txtNumControl.setText(String.valueOf(max + 1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void registrarMaterial(String Nombre, String Tipo, String Marca, String Modelo, String Serie, int cantidad, String Ubicacion, String Especificaciones) {
        try {
            Statement st = LogIn.Menu.Login1.con.createStatement();
            PreparedStatement ps = con.prepareStatement("insert into Material values (?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, Nombre);
            ps.setString(3, Tipo);
            ps.setString(4, Marca);
            ps.setString(5, Modelo);
            ps.setString(6, Serie);
            ps.setInt(7, cantidad);
            ps.setString(8, Ubicacion);
            ps.setString(9, Especificaciones);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Nuevo material registrado con exito!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void mostrarMaterial(String Nombre, DefaultTableModel modelo) {
        try {
            Statement st = LogIn.Menu.Login1.con.createStatement();
            ResultSet rs = st.executeQuery("select * from Material");
            String [] Datos = new String[9];
            while (rs.next()) {
                for (int i = 0; i < 9; i++) {
                    Datos[i] = rs.getString(i + 1);
                }
                modelo.addRow(Datos);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
