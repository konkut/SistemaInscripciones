package Controlador;

import Modelo.Estudiante;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CEstudiante {
    Conexion cone = new Conexion();
    Connection con = null;
    
    public ArrayList recuperaDatos(String sql) {
        ArrayList<Estudiante> lest = new ArrayList();
        try {
            con = cone.conecta();
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                Estudiante est = new Estudiante();
                est.setCi(rs.getInt("ci"));
                est.setExpedido(rs.getString("expedido"));
                est.setNombres(rs.getString("nombres"));
                est.setApellidoPaterno(rs.getString("apellidoPaterno"));
                est.setApellidoMaterno(rs.getString("apellidoMaterno"));
                est.setTelefono(rs.getInt("telefono"));
                est.setCelular(rs.getInt("celular"));
                est.setCorreo(rs.getString("correo"));
                est.setGenero(rs.getString("genero"));
                est.setFechaNacimiento(rs.getString("fechaNacimiento"));
                est.setEstadoCivil(rs.getString("estadoCivil"));
                est.setNumPuerta(rs.getInt("numPuerta"));
                est.setIdCalle(rs.getString("idCalle"));
                est.setIdZona(rs.getString("idZona"));
                est.setIdProvincia(rs.getInt("idProvincia"));
                est.setIdCiudad(rs.getInt("idCiudad"));
                est.setIdDepartamento(rs.getInt("idDepartamento"));
                est.setIdNacionalidad(rs.getInt("idNacionalidad"));
                lest.add(est);
            }
            cone.desconecta();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error :" + e.getMessage());
        }
        return lest;
    }

    public void adiciona(Estudiante est,int idLogin) {
        String sql = "insert into Estudiante (ci,expedido,nombres,apellidoPaterno,apellidoMaterno,telefono,celular,correo,genero,fechaNacimiento,estadoCivil,numPuerta,idCalle,idZona,idProvincia,idCiudad,idDepartamento,idNacionalidad,idLogin) values(" + est.getCi() + ",'" + est.getExpedido() + "','" + est.getNombres() + "','" + est.getApellidoPaterno() + "','" + est.getApellidoMaterno() + "'," + est.getTelefono() + "," + est.getCelular() + ",'" + est.getCorreo() + "','" + est.getGenero() + "','" + est.getFechaNacimiento() + "','" + est.getEstadoCivil() + "'," + est.getNumPuerta() + ",'" + est.getIdCalle()+ "','" + est.getIdZona() +  "'," + est.getIdProvincia() + "," + est.getIdCiudad() + "," + est.getIdDepartamento() + "," + est.getIdNacionalidad() + "," + idLogin + ")";
        con = cone.conecta();
        try {
            Statement smt = con.createStatement();
            smt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "mistake query" + ex.getMessage());
        }
    }
    
    public ArrayList listarEst() {
        ArrayList<Estudiante> lest = new ArrayList();
        String sql = "select * from Estudiante";
        lest = recuperaDatos(sql);
        return lest;
    }
    public ArrayList listarId(int id) {
        ArrayList<Estudiante> lest = new ArrayList();
        String sql = "select * from Estudiante where ci = " + id + "";
        lest = recuperaDatos(sql);
        return lest;
    }
    public void modifica(Estudiante est) {
        String sql = "update Estudiante set ci = "+est.getCi()+",expedido = '"+est.getExpedido()+"',nombres = '"+est.getNombres()+"',apellidoPaterno = '"+est.getApellidoPaterno()+"',apellidoMaterno='"+est.getApellidoPaterno()+"',telefono="+est.getTelefono()+",celular="+est.getCelular()+",correo='"+est.getCorreo()+"',genero='"+est.getGenero()+"',fechaNacimiento='"+est.getFechaNacimiento()+"',estadoCivil='"+est.getEstadoCivil()+"',numPuerta="+est.getNumPuerta()+",idCalle='"+est.getIdCalle()+"',idZona='"+est.getIdZona()+"',idProvincia="+est.getIdProvincia()+",idCiudad="+est.getIdCiudad()+",idDepartamento="+est.getIdDepartamento()+",idNacionalidad="+est.getIdNacionalidad()+" where ci = "+est.getCi()+"";
        con = cone.conecta();
        try {
            Statement smt = con.createStatement();
            smt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error " + ex.getMessage());
        }
    }
    public void elimina(int id) {
        String sql = "delete from Estudiante where ci = "+id+"";
        con = cone.conecta();
        try {
            Statement smt = con.createStatement();
            smt.executeUpdate(sql);
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error " + ex.getMessage());
        }
    }
    public int ObtenerId(int ci) {
       int niv=0;
        try {
            con = cone.conecta();
            String sql = "select * from Estudiante where ci = "+ci+"";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            if (rs.next()) {
                niv = rs.getInt("id");
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "errorobtenerid " + ex.getMessage());
        }
        return niv;
    }
    public int ObtenerCi(int id) {
       int niv=0;
        try {
            con = cone.conecta();
            String sql = "select * from Estudiante where id = "+id+"";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            if (rs.next()) {
                niv = rs.getInt("ci");
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "errorobtenerid " + ex.getMessage());
        }
        return niv;
    }
    
    public int ObtenerIdEst(int idLogin) {
       int id=0;
        try {
            con = cone.conecta();
            String sql = "select * from Estudiante where idLogin = "+idLogin+"";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            if (rs.next()) {
                id = rs.getInt("id");
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "errorobtenerid " + ex.getMessage());
        }
        return id;
    }
    
    public String ObtenerNombre(int id) {
       String nombre="";
        try {
            con = cone.conecta();
            String sql = "select * from Estudiante where id = "+id+"";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            if (rs.next()) {
                nombre = rs.getString("nombres");
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "errorobtenerid " + ex.getMessage());
        }
        return nombre;
    }
    public String Obtenerdata(int id) {
       String nombre="";
       String pass="";
        try {
            con = cone.conecta();
             String sql = "select * from Login l,Estudiante e where e.idLogin = l.idLogin and l.idLogin = "+id+"";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            if (rs.next()) {
                nombre = rs.getString("usuario");
                pass = rs.getString("contrasena"); 
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "errorobtenerid " + ex.getMessage());
        }
        return "NOMBRE USUARIO: "+nombre+"  CONTRASEÑA: "+pass;
    }
    public String ObtenerMaterias(int id) {
       String materias="";
        try {
            con = cone.conecta();
             String sql = "select * from Estudiante e,Inscrito i,Materia m where e.id = i.id and i.idMateria = m.idMateria and e.id = "+id+"";
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                materias += rs.getString("materia") +",  ";
            }
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "errorobtenerid " + ex.getMessage());
        }
        return materias;
    }
   

}
    
    
    
    
    
    