
package Controlador;

import Modelo.Estudiante;
import Modelo.Inscrito;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CInscrito {
    Conexion cone = new Conexion();
    Connection con = null;
    
    public void adiciona(Inscrito ins) {
        String sql = "insert into Inscrito (id,idParalelo,idMateria) values(" + ins.getId() + "," + ins.getIdParalelo() + "," + ins.getIdMateria() + ")";
        con = cone.conecta();
        try {
            Statement smt = con.createStatement();
            smt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "mistake query" + ex.getMessage());
        }
    }
    
    public int ObtenerCi(int id) {
       int ci=0;
        try {
            con = cone.conecta();
            String sql = "select * from Estudiante where id = "+id+"";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            if (rs.next()) {
                ci = rs.getInt("ci");
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "errorobtenerci " + ex.getMessage());
        }
        return ci;
    }
    
    public String ObtenerNombre(int id) {
       String nombreParalelo = "",nombreGrado = "";
       int idSemestre=0;
        try {
            con = cone.conecta();
            String sql = "select * from Paralelo where idParalelo = "+id+"";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            if (rs.next()) {
                nombreParalelo = rs.getString("paralelo");
                idSemestre = rs.getInt("idGrado");
            }
            String sql1 = "select * from Grado where idGrado = "+idSemestre+"";
            Statement smt1 = con.createStatement();
            ResultSet rs1 = smt1.executeQuery(sql1);
            if (rs1.next()) {
                nombreGrado = rs1.getString("grado");
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "errorobtenerid " + ex.getMessage());
        }
        return nombreGrado+"  "+nombreParalelo;
    }
}

