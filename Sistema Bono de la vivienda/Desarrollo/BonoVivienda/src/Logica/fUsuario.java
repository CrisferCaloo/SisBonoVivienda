package Logica;

import Datos.vUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fUsuario {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.Conectar();
    private String sSQL = "";    
    public Integer totalregistros;
    
    public DefaultTableModel Mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Cédula", "Nombre", "Apellido", "Email", "Teléfono", "Acceso", "Usuario", "Contraseña"};
        String[] registro = new String[9]; // es el número total de columnas
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);        
        sSQL = "select * from usuario where Nombre like '%"+ buscar +"%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idUsuario");
                registro[1] = rs.getString("Cedula");
                registro[2] = rs.getString("Nombre");
                registro[3] = rs.getString("Apellido");
                registro[4] = rs.getString("Email");
                registro[5] = rs.getString("Telefono");
                registro[6] = rs.getString("Acceso");  
                registro[7] = rs.getString("Usuario");  
                registro[8] = rs.getString("Clave");  
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean Insertar (vUsuario dts){
        sSQL="insert into usuario (Cedula,Nombre,Apellido,Email,Telefono,Acceso,Usuario,Clave) values (?,?,?,?,?,?,?,?);";
        try {           
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getCedula());
            pst.setString(2, dts.getNombre());
            pst.setString(3, dts.getApellido());
            pst.setString(4, dts.getEmail());
            pst.setString(5, dts.getTelefono());
            pst.setString(6, dts.getAcceso());
            pst.setString(7, dts.getUsuario());
            pst.setString(8, dts.getClave());
            int n=pst.executeUpdate();           
            if (n!=0){
                return true;
            }
           else {
                return false;
           }                                 
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean Editar (vUsuario dts){
        sSQL="update Usuario set Cedula=?,Nombre=?,Apellido=?,Email=?,Telefono=?,Acceso=?,Usuario=?,Clave=? where idUsuario=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setString(1, dts.getCedula());
            pst.setString(2, dts.getNombre());
            pst.setString(3, dts.getApellido());
            pst.setString(4, dts.getEmail());
            pst.setString(5, dts.getTelefono());
            pst.setString(6, dts.getAcceso());
            pst.setString(7, dts.getUsuario());            
            pst.setString(8, dts.getClave());
            pst.setInt(9, dts.getIdUsuario());
            int n=pst.executeUpdate();
            if (n!=0){
                return true;
            }
            else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean Eliminar (vUsuario dts){
        sSQL="delete from Usuario where idUsuario=?";
        try {
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdUsuario());
            int n=pst.executeUpdate();
            if (n!=0){
                return true;
            }
            else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }  
    
    public DefaultTableModel Login(String usuario, String clave) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Cédula", "Nombre", "Apellido", "Email", "Teléfono", "Acceso", "Usuario", "Contraseña"};
        String[] registro = new String[9];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from usuario where usuario = '" + usuario + "' and clave = '" + clave + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idUsuario");
                registro[1] = rs.getString("Cedula");
                registro[2] = rs.getString("Nombre");
                registro[3] = rs.getString("Apellido");
                registro[4] = rs.getString("Email");
                registro[5] = rs.getString("Telefono");
                registro[6] = rs.getString("Acceso");  
                registro[7] = rs.getString("Usuario");  
                registro[8] = rs.getString("Clave");  
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultTableModel ValidarCedula(String cedula) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Cédula", "Nombre", "Apellido", "Email", "Teléfono", "Acceso", "Usuario", "Contraseña"};
        String[] registro = new String[9];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "select * from usuario where Cedula = '" + cedula + "'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idUsuario");
                registro[1] = rs.getString("Cedula");
                registro[2] = rs.getString("Nombre");
                registro[3] = rs.getString("Apellido");
                registro[4] = rs.getString("Email");
                registro[5] = rs.getString("Telefono");
                registro[6] = rs.getString("Acceso");  
                registro[7] = rs.getString("Usuario");  
                registro[8] = rs.getString("Clave");  
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
}
