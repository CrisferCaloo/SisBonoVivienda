package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    public String db="dbvivienda";
    public String url="jdbc:mysql://127.0.0.1/" +db;
    public String user="root";
    public String pass="";

    public Conexion() {
    }
    
    public Connection Conectar(){
        Connection direccion=null;        
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            direccion=DriverManager.getConnection(this.url, this.user, this.pass);            
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(null, e);            
        }       
        return direccion;
    }
}
