/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Controlador.Conexion;
import Modelo.Estudiante;
import Modelo.Grado;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CGrado {
    Conexion cone = new Conexion();
    Connection con = null;

    public ArrayList recuperaDatos(String sql) {
        ArrayList<Grado> lgra = new ArrayList();
        try {
            con = cone.conecta();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                Grado gra = new Grado();
                gra.setIdGrado(rs.getInt("idGrado"));
                gra.setGrado(rs.getString("grado"));
                lgra.add(gra);
            }
            cone.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage());
        }
        return lgra;
    }

    public ArrayList listarGra() {
        ArrayList<Grado> lgra = new ArrayList();
        String sql = "select * from Grado";
        lgra = recuperaDatos(sql);
        return lgra;
    }
}
