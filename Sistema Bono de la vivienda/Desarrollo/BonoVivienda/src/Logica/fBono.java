package Logica;

import Datos.vBono;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class fBono {
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.Conectar();
    private String sSQL = "";    
    public Integer totalregistros;
    
    public DefaultTableModel Mostrar(String buscar) {
        DefaultTableModel modelo;
        String[] titulos = {"ID", "Nombre", "Apellido", "Edad", "Estabilidad Laboral", "Tiene Vivienda", "Ingresos", "Egresos", "Estado", "Fecha"};
        String[] registro = new String[10]; // es el número total de columnas
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);        
        sSQL = "select b.idBono, u.Nombre, u.Apellido, u.Cedula, b.Edad, b.Est_Laboral, b.Tiene_Vivienda, b.Ingresos, b.Egresos, b.Estado, b.fecha from bono b inner join usuario u on b.idUsuario = u.idUsuario where concat(u.Nombre,' ',u.Apellido,' ',u.Cedula) like '%" + buscar + "%'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idBono");
                registro[1] = rs.getString("Nombre");
                registro[2] = rs.getString("Apellido");
                registro[3] = rs.getString("Edad");
                registro[4] = rs.getString("Est_Laboral");
                registro[5] = rs.getString("Tiene_Vivienda");
                registro[6] = rs.getString("Ingresos");  
                registro[7] = rs.getString("Egresos");  
                registro[8] = rs.getString("Estado");
                registro[9] = rs.getString("fecha");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }

    public boolean Insertar (vBono dts){
        sSQL="insert into Bono (idUsuario,Edad,Est_Laboral,Tiene_Vivienda,Ingresos,Egresos,Estado) values (?,?,?,?,?,?,?)";
        try {           
            PreparedStatement pst=cn.prepareStatement(sSQL);
            pst.setInt(1, dts.getIdUsuario());
            pst.setInt(2, dts.getEdad());
            pst.setString(3, dts.getEstLaboral());
            pst.setString(4, dts.getTieneVivienda());
            pst.setDouble(5, dts.getIngresos());
            pst.setDouble(6, dts.getEgresos());
            pst.setString(7, dts.getEstado());            
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
    
    public boolean Eliminar (vBono dts){
        sSQL="delete from Bono where idBono=?";
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
}
