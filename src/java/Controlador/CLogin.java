
package Controlador;
import java.util.ArrayList;
import Modelo.Inscrito;
import Modelo.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CLogin {
    Conexion cone = new Conexion();
    Connection con = null;
    
    public void adiciona(Login log) {
        String sql = "insert into Login (usuario,contrasena) values('" + log.getUsuario() + "','" + log.getContrasena() + "')";
        con = cone.conecta();
        try {
            Statement smt = con.createStatement();
            smt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "mistake query" + ex.getMessage());
        }
    }
    
    public boolean verifica(String user, String clave) {
        boolean sw = false;
        try {
            con = cone.conecta();
            String sql = "select * from Login where usuario = '" + user + "' and contrasena = '" + clave + "'";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            if (rs.next()) {
                sw = true;
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sw;
    } 
    
    public int ObtenerId(String user,String pass) {
       int id=0;
        try {
            con = cone.conecta();
            String sql = "select * from Login where usuario = '"+user+"' and contrasena = '"+pass+"'";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            if (rs.next()) {
                id = rs.getInt("idLogin");
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "errorobtenerci " + ex.getMessage());
        }
        return id;
    }
    public int ObtenerIdEstudiante(String user,String pass) {
       int id=0;
        try {
            con = cone.conecta();
            String sql = "select * from Login l,Estudiante e where e.idLogin = l.idLogin and usuario = '"+user+"' and contrasena = '"+pass+"'";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            if (rs.next()) {
                id = rs.getInt("id");
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "errorobtenerci " + ex.getMessage());
        }
        return id;
    }
    
}