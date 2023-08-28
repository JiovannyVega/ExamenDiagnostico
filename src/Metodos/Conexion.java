package Metodos;

import static Log.Login1.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Vector;
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
            Statement st = Log.Login1.con.createStatement();
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
    
    public static void llenadoMaterial(Vector<String> Material, Map<String, Integer> map) {
        try {
            Statement st = Log.Login1.con.createStatement();
            ResultSet rs = st.executeQuery("select * from Material");
            while (rs.next()) {
                Material.addElement(rs.getString("Nombre"));
                map.put(rs.getString("Nombre"), rs.getInt("id"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void registrarPrestamo(String Nombre, String fInicio, String Matricula, int idMaterial, int Cantidad) {
        try {
            Statement st = Log.Login1.con.createStatement();
            PreparedStatement ps = con.prepareStatement("insert into Historial values (0, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, fInicio);
            ps.setString(2, null);
            ps.setString(3, Nombre);
            ps.setString(4, Matricula);
            ps.setInt(5, idMaterial);
            ps.setInt(6, Cantidad);
            ps.setInt(7, 0);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Material prestado con exito");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void registrarMaterial(String Nombre, String Tipo, String Marca, String Modelo, String Serie, int cantidad, String Ubicacion, String Especificaciones) {
        try {
            Statement st = Log.Login1.con.createStatement();
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
    
    public static void mostrarMaterial(DefaultTableModel modelo) {
        try {
            Statement st = Log.Login1.con.createStatement();
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
    public static void mostrarPrestamos(DefaultTableModel modelo, Map<String, Integer> map){
        try {
            //id, Nombre, Matricula, fInicio, fFin, Material, Cantidad, Devuelto
            //id, fInicio, fFin, Nombre, Matricula, Material, Cantidad, Devuelto
            Statement st = Log.Login1.con.createStatement();
            Statement st2 = Log.Login1.con.createStatement();
            ResultSet rs = st.executeQuery("select id, Nombre, Matricula, Fecha_I, Fecha_F, id_Material, Cantidad, Devuelto from Historial");
            String [] Datos = new String[7];
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    Datos[i] = rs.getString(i + 1);
                    System.out.println(Datos[i] + " " + i);
                }
                ResultSet rs2 = st2.executeQuery("select Nombre from Material where id = " + Datos[5]);
                rs2.next();
                Datos[5] = rs2.getString(1);
                modelo.addRow(Datos);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void actualizarMaterial(String Nombre, String Tipo, String Marca, String Modelo, String Serie, int cantidad, String Ubicacion, String Especificaciones, int id) {
        try {
            Statement st = Log.Login1.con.createStatement();
            PreparedStatement ps = con.prepareStatement("update Material set Nombre = ?, Tipo = ?, Marca = ?, Modelo = ?, Serie = ?, Cantidad = ?, Ubicacion = ?, Especificaciones = ? where (id = " + id + ");");
            ps.setString(1, Nombre);
            ps.setString(2, Tipo);
            ps.setString(3, Marca);
            ps.setString(4, Modelo);
            ps.setString(5, Serie);
            ps.setInt(6, cantidad);
            ps.setString(7, Ubicacion);
            ps.setString(8, Especificaciones);
            ps.executeUpdate();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
