/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Docente;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class CDocente {
    Conexion cone = new Conexion();
    Connection con = null;

    public void adiciona(Docente doc) {
        
        String sql = "insert into Docente (ci,expedido,nombres,apellidoPaterno,apellidoMaterno,telefono,celular,correo,genero,fechaNacimiento,estadoCivil,numPuerta,idCalle,idZona,idProvincia,idCiudad,idDepartamento,idNacionalidad) values(" + doc.getCi() + ",'" + doc.getExpedido() + "','" + doc.getNombres() + "','" + doc.getApellidoPaterno() + "','" + doc.getApellidoMaterno() + "'," + doc.getTelefono() + "," + doc.getCelular() + ",'" + doc.getCorreo() + "','" + doc.getGenero() + "','" + doc.getFechaNacimiento() + "','" + doc.getEstadoCivil() + "'," + doc.getNumPuerta() + ",'" + doc.getIdCalle()+ "','" + doc.getIdZona() +  "'," + doc.getIdProvincia() + "," + doc.getIdCiudad() + "," + doc.getIdDepartamento() + "," + doc.getIdNacionalidad() + ")";
        con = cone.conecta();
        try {
            Statement smt = con.createStatement();
            smt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "mistake query" + ex.getMessage());
        }
    }
}
