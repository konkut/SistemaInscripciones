package Controlador;
import Controlador.CDocente;
import Modelo.Docente;
import Modelo.Estudiante;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aquis
 */
@WebServlet(name = "InsDocente", urlPatterns = {"/InsDocente"})
public class InsDocente extends HttpServlet {
    
    String accesa;
    CDocente cdoc = new CDocente();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ProductoControlador</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ProductoControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    //@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("adicionarDocente");
        if (accion.equalsIgnoreCase("Listado")) {
           // accesa = "Vista/Productos/listar.jsp";
        } else if (accion.equalsIgnoreCase("Eliminar")) {
           // String id1 = request.getParameter("id");
            //int idi = Integer.parseInt(id1);
            //cprod.elimina(idi);
            //accesa = "Vista/Productos/eliminar.jsp";
            //accesa = "Vista/Productos/listar.jsp"; 
        } else
            if(accion.equalsIgnoreCase("Adiciona"))
            {
             //accesa = "Vista/Productos/adicionar.jsp";   
            }
        else
            if(accion.equalsIgnoreCase("ENVIAR"))
            {
               try{
                   int ci, telefono, celular, numPuerta, idProvincia, idCiudad, idDepartamento, idNacionalidad;
                   String expedido, nombres, apellidoPaterno, apellidoMaterno, correo, genero, fechaNacimiento, estadoCivil, idCalle, idZona;
                    ci = Integer.parseInt(request.getParameter("ci"));
                    expedido = request.getParameter("expedido");
                    nombres = request.getParameter("nombres");
                    apellidoPaterno = request.getParameter("apellidoPaterno");
                    apellidoMaterno = request.getParameter("apellidoMaterno");
                    fechaNacimiento = request.getParameter("fechaNacimiento");
                    telefono = Integer.parseInt(request.getParameter("telefono"));
                    celular = Integer.parseInt(request.getParameter("celular"));
                    correo = request.getParameter("correo");
                    estadoCivil = request.getParameter("estadoCivil");
                    genero = request.getParameter("genero");
                    numPuerta = Integer.parseInt(request.getParameter("numPuerta"));
                    idCalle = request.getParameter("idCalle");
                    idZona = request.getParameter("idZona");
                    idDepartamento = Integer.parseInt(request.getParameter("idDepartamento"));
                    idProvincia = Integer.parseInt(request.getParameter("idProvincia"));
                    idCiudad = Integer.parseInt(request.getParameter("idCiudad"));
                    idNacionalidad = Integer.parseInt(request.getParameter("idNacionalidad"));     
                    if(request.getParameter("adicionarDocente")!=null){
                        if(expedido != "" && nombres != "" && apellidoPaterno!="" && apellidoMaterno!="" && correo!="" && genero!="" && fechaNacimiento!="" && estadoCivil!="" && idCalle!="" && idZona!=""){
                             if(ci!=0 && telefono!=0 && celular!=0 && numPuerta!=0 && idProvincia!=0 && idCiudad!=0 && idDepartamento!=0 && idNacionalidad!=0){
                                    if(expedido != "null" && genero!="null" && estadoCivil!="null"){
                                        Docente doc = new Docente(ci, telefono, celular, numPuerta, idProvincia, idCiudad, idDepartamento, idNacionalidad, expedido, nombres, apellidoPaterno, apellidoMaterno, correo, genero, fechaNacimiento, estadoCivil, idCalle, idZona);
                                        cdoc.adiciona(doc);
                                    }
                              }   
                        }
                    }
                } catch(java.lang.NumberFormatException e){
                   accesa = "inscripcionDoc.jsp"; 
                }
            }
        RequestDispatcher vista = request.getRequestDispatcher(accesa);
        vista.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    //@Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

