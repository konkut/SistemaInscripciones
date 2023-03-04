package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.swing.JOptionPane;
import Controlador.CEstudiante;
import Modelo.Estudiante;
import java.util.regex.*;

public final class control_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            CEstudiante cest = new CEstudiante();
            try {
                
            int ci = 0, telefono=0, celular=0, numPuerta=0, idProvincia=0, idCiudad=0, idDepartamento=0, idNacionalidad=0;
            String expedido= "", nombres=null, apellidoPaterno=null, apellidoMaterno=null, correo=null, genero=null, fechaNacimiento=null, estadoCivil=null, idCalle=null, idZona=null;

                if (request.getParameter("ci") != null || !request.getParameter("ci").equals("") || !request.getParameter("ci").equals(0)) {
                ci = Integer.parseInt(request.getParameter("ci"));
                
      out.write("<a href=\"error.jsp?ci1=");
      out.print(ci);
      out.write("\"></a>");

                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR CI</div>\n");
      out.write("                ");
         
                }
                if (request.getParameter("expedido") != null) {
                expedido = request.getParameter("expedido");
                
      out.write("<a href=\"error.jsp?expedido1=");
      out.print(expedido);
      out.write("\"></a>");

                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR EXPEDIDO</div>\n");
      out.write("                ");
         
                }
                
                if (!request.getParameter("nombres").equals("")) {
                    if(request.getParameter("nombres").matches("\\d*")){
                        
      out.write("\n");
      out.write("                        <div style=\"color: purple\">ERROR NOMBRES digito</div>\n");
      out.write("                        ");
  
                    }else{
                        nombres = request.getParameter("nombres");
                        
      out.write("<a href=\"error.jsp?nombres1=");
      out.print(nombres);
      out.write("\"></a>");

                    }   
                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (!request.getParameter("apellidoPaterno").equals("")) {
                    if(request.getParameter("apellidoPaterno").matches("\\d*")){
                        
      out.write("\n");
      out.write("                        <div style=\"color: purple\">ERROR NOMBRES digito</div>\n");
      out.write("                        ");
  
                    }else{
                        apellidoPaterno = request.getParameter("apellidoPaterno");
                        
      out.write("<a href=\"error.jsp?apellidoPaterno1=");
      out.print(apellidoPaterno);
      out.write("\"></a>");

                    }                    
                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBREs vacio</div>\n");
      out.write("                ");
         
                }
                if (!request.getParameter("apellidoMaterno").equals("")) {
                    if(request.getParameter("apellidoMaterno").matches("\\d*")){
                        
      out.write("\n");
      out.write("                        <div style=\"color: purple\">ERROR NOMBRES digito</div>\n");
      out.write("                        ");
  
                    }else{
                        apellidoMaterno = request.getParameter("apellidoMaterno");
                         
      out.write("<a href=\"error.jsp?apellidoMaterno1=");
      out.print(apellidoMaterno);
      out.write("\"></a>");

                    }  
                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (!request.getParameter("fechaNacimiento").equals("")) {
                    if(request.getParameter("fechaNacimiento").matches("\\d*")){
                        
      out.write("\n");
      out.write("                        <div style=\"color: purple\">ERROR NOMBRES digito</div>\n");
      out.write("                        ");
  
                    }else{
                        fechaNacimiento = request.getParameter("fechaNacimiento");
                        
      out.write("<a href=\"error.jsp?fechaNacimiento1=");
      out.print(fechaNacimiento);
      out.write("\"></a>");

                    } 
                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (request.getParameter("telefono") != null) {
                telefono = Integer.parseInt(request.getParameter("telefono"));
                
      out.write("<a href=\"error.jsp?telefono1=");
      out.print(telefono);
      out.write("\"></a>");

                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (request.getParameter("celular") != null) {
                celular = Integer.parseInt(request.getParameter("celular"));
                
      out.write("<a href=\"error.jsp?celular1=");
      out.print(celular);
      out.write("\"></a>");

                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (!request.getParameter("correo").equals("")) {
                    if(request.getParameter("correo").matches("\\d*")){
                        
      out.write("\n");
      out.write("                        <div style=\"color: purple\">ERROR NOMBRES digito</div>\n");
      out.write("                        ");
  
                    }else{
                        correo = request.getParameter("correo");
                         
      out.write("<a href=\"error.jsp?correo1=");
      out.print(correo);
      out.write("\"></a>");

                    } 
                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (!request.getParameter("genero").equals("")) {
                genero = request.getParameter("genero");
                
      out.write("<a href=\"error.jsp?genero1=");
      out.print(genero);
      out.write("\"></a>");

                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (request.getParameter("numPuerta") != null) {
                    if(request.getParameter("numPuerta").matches("[0]*")){
                        
      out.write("\n");
      out.write("                        <div style=\"color: purple\">ERROR puro 0</div>\n");
      out.write("                        ");
  
                    }else{
                        numPuerta = Integer.parseInt(request.getParameter("numPuerta"));
                        
      out.write("<a href=\"error.jsp?numPuerta1=");
      out.print(numPuerta);
      out.write("\"></a>");

                    }   
                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR nulo</div>\n");
      out.write("                ");
         
                }
                if (!request.getParameter("idCalle").equals("")) {
                    if(request.getParameter("idCalle").matches("\\d*")){
                        
      out.write("\n");
      out.write("                        <div style=\"color: purple\">ERROR NOMBRES digito</div>\n");
      out.write("                        ");
  
                    }else{
                        idCalle = request.getParameter("idCalle");
                        
      out.write("<a href=\"error.jsp?idCalle1=");
      out.print(idCalle);
      out.write("\"></a>");

                    }        
                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (!request.getParameter("idZona").equals("")) {
                    if(request.getParameter("idZona").matches("\\d*")){
                        
      out.write("\n");
      out.write("                        <div style=\"color: purple\">ERROR NOMBRES digito</div>\n");
      out.write("                        ");
  
                    }else{
                        idZona = request.getParameter("idZona");
                        
      out.write("<a href=\"error.jsp?idZona1=");
      out.print(idZona);
      out.write("\"></a>");

                    } 
                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (request.getParameter("idDepartamento") != null) {
                idDepartamento = Integer.parseInt(request.getParameter("idDepartamento"));
                
      out.write("<a href=\"error.jsp?idDepartamento1=");
      out.print(idDepartamento);
      out.write("\"></a>");

                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (!request.getParameter("estadoCivil").equals("")) {
                estadoCivil = request.getParameter("estadoCivil");
                
      out.write("<a href=\"error.jsp?idDepartamento1=");
      out.print(idDepartamento);
      out.write("\"></a>");

                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (request.getParameter("idProvincia") != null) {
                idProvincia = Integer.parseInt(request.getParameter("idProvincia"));
                
      out.write("<a href=\"error.jsp?idProvincia1=");
      out.print(idProvincia);
      out.write("\"></a>");

                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (request.getParameter("idCiudad") != null) {
                idCiudad = Integer.parseInt(request.getParameter("idCiudad"));
                
      out.write("<a href=\"error.jsp?idCiudad1=");
      out.print(idCiudad);
      out.write("\"></a>");

                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                if (request.getParameter("idNacionalidad") != null) {
                idNacionalidad = Integer.parseInt(request.getParameter("idNacionalidad"));
                
      out.write("<a href=\"error.jsp?idNacionalidad1=");
      out.print(idNacionalidad);
      out.write("\"></a>");

                }else{
                
      out.write("\n");
      out.write("                <div style=\"color: purple\">ERROR NOMBRES</div>\n");
      out.write("                ");
         
                }
                    
                Estudiante est = new Estudiante(ci, telefono, celular, numPuerta, idProvincia, idCiudad, idDepartamento, idNacionalidad, expedido, nombres, apellidoPaterno, apellidoMaterno, correo, genero, fechaNacimiento, estadoCivil, idCalle, idZona);
                cest.adiciona(est);
                

            }catch (Exception e){
                
      out.write("\n");
      out.write("                <div style=\"color: blue\">Datos de entrada no validos</div>\n");
      out.write("                ");

            }

            /*if(ci1.matches("\\d+") && telefono1.matches("\\d+") && celular1.matches("\\d+")
            && numPuerta1.matches("\\d+") && idProvincia1.matches("\\d+") 
            && idCiudad1.matches("\\d+") && idDepartamento1.matches("\\d+") 
            && idNacionalidad1.matches("\\d+") && expedido.matches("\\w+") 
            && nombres.matches("\\w+\\s\\w+") && apellidoPaterno.matches("\\w+") 
            && apellidoMaterno.matches("\\w+") && correo.matches("\\w+") 
            && genero.matches("\\w+") && fechaNacimiento.matches("\\w+")
            && estadoCivil.matches("\\w+") && idZona.matches("\\w+")
            && idCalle.matches("\\w+")){
        Estudiante est = new Estudiante(ci, telefono, celular, numPuerta, idProvincia, idCiudad, idDepartamento, idNacionalidad, expedido, nombres, apellidoPaterno, apellidoMaterno, correo, genero, fechaNacimiento, estadoCivil, idCalle, idZona);
        cest.adiciona(est);
        }
        //(a.equals("fdsa"))?true:false;
        try (PrintWriter out = response.getWriter()) {
        out.println("<div>REGISTRO EXITOSO</div>");
        }
        
             */
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
