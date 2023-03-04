package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.CEstudiante;
import java.util.Iterator;
import Modelo.Estudiante;
import java.util.List;

public final class listarEstudiante_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style/iniciarSesion.css\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            int ci = Integer.parseInt(request.getParameter("ci"));
        
      out.write("\n");
      out.write("        <div class=\"row\" style=\"margin-top: 25px;\">\n");
      out.write("        <div class=\"col-lg-2 col-md-4 col-sm-12 col-12 bg-light\">\n");
      out.write("            <a class =\"ps-5 btn btn-block btn-danger\" href=\"InsEstudiante?adicionarEstudiante=IMPRIMA&ci=");
      out.print(ci);
      out.write("\">Descargar boleta de inscripcion </a>\n");
      out.write("            <img class=\"rounded img-fluid\" id=\"estilo\" src=\"imagenes/boletaimage.jpg\" alt=\"inscripcion-2021-upea-ingenieria\" title=\"descargan boleta inscripcion\"/>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"content\" class=\"container-fluid col-lg-10 col-md-8 col-sm-12 col-12\">\n");
      out.write("            <video class=\"\" autoplay muted loop>\n");
      out.write("                 <source src=\"imagenes/video.mp4\" type=\"video/mp4\"/>\n");
      out.write("            </video>\n");
      out.write("            <div class=\"container-fluid\" id=\"fijo\">\n");
      out.write("                <h1 id=\"titulo\" class=\"pt-5 text-center text-danger\">BIENVENIDO A LA PAGINA DE LA INSTITUCION ....</h1>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-12 col-12 \">\n");
      out.write("                        <img id=\"imagen\" src=\"imagenes/user.png\" alt=\"user-2021\" title=\"usuario\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-6 col-md-6 col-sm-12 col-12 \">\n");
      out.write("                        ");

                            CEstudiante cest = new CEstudiante();
                            List <Estudiante> lest = cest.listarEst();
                            Iterator <Estudiante> iter = lest.iterator();
                            Estudiante est = null;
                            while(iter.hasNext())
                            {
                                est = iter.next();
                                if(ci == est.getCi()){
                                    
      out.write("\n");
      out.write("                                    <b class=\"text-center text-dark\">CI:&nbsp;&nbsp;</b><i>");
      out.print(est.getCi());
      out.write("</i><br>\n");
      out.write("                                    <b class=\"text-center text-dark\">NOMBRES:&nbsp;&nbsp;</b><i>");
      out.print(est.getNombres());
      out.write("</i><br>\n");
      out.write("                                    <b class=\"text-center text-dark\">APELLIDO PATERNO:&nbsp;&nbsp;</b><i>");
      out.print(est.getApellidoPaterno());
      out.write("</i><br>\n");
      out.write("                                    <b class=\"text-center text-dark\">APELLIDO MATERNO:&nbsp;&nbsp;</b><i>");
      out.print(est.getApellidoMaterno());
      out.write("</i><br>\n");
      out.write("                                    <b class=\"text-center text-dark\">CELULAR:&nbsp;&nbsp;</b><i>");
      out.print(est.getCelular());
      out.write("</i><br>\n");
      out.write("                                    <b class=\"text-center text-dark\">CORREO:&nbsp;&nbsp;</b><i>");
      out.print(est.getCorreo());
      out.write("</i><br>\n");
      out.write("                                    <b class=\"text-center text-dark\">GENERO:&nbsp;&nbsp;</b><i>");
      out.print(est.getGenero());
      out.write("</i><br>\n");
      out.write("                                    <b class=\"text-center text-dark\">FECHA NACIMIENTO:&nbsp;&nbsp;</b><i>");
      out.print(est.getFechaNacimiento());
      out.write("</i><br>\n");
      out.write("                                    <b class=\"text-center text-dark\">ESTADO CIVIL:&nbsp;&nbsp;</b><i>");
      out.print(est.getEstadoCivil());
      out.write("</i><br>\n");
      out.write("                                    <b class=\"text-center text-dark\">CALLE:&nbsp;&nbsp;</b><i>");
      out.print(est.getIdCalle());
      out.write("</i><br>\n");
      out.write("                                    <b class=\"text-center text-dark\">ZONA:&nbsp;&nbsp;</b><i>");
      out.print(est.getIdZona());
      out.write("</i><br>\n");
      out.write("                                    ");
 
                               }
                            }
                           
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                     <a class =\"btn btn-block btn-dark\" href=\"InsEstudiante?adicionarEstudiante=MODIFICA&ci=");
      out.print(ci);
      out.write("\">EDITAR</a>\n");
      out.write("                     \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("    </div> \n");
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
