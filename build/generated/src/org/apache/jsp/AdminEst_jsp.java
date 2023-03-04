package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.CEstudiante;
import java.util.Iterator;
import Modelo.Estudiante;
import java.util.List;

public final class AdminEst_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js\" integrity=\"sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"style/style_1.css\" rel=\"stylesheet\"></link>\n");
      out.write("        <title>Administrador</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(imagenes/cielo.jpg)\">\n");
      out.write("        ");
/*
            HttpSession session1;
            session1 = request.getSession();
            try{
                String se = session1.getAttribute("vsec").toString();
                if(se.equalsIgnoreCase("1")){*/
        
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("              <img id=\"escudo\" class=\"navbar-brand\" src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6oRlTbvLPtYVAd62ocjengkvclk8f1eHdicuikgr3sUpM70SWsWhhlkXS8A&s\"></img>\n");
      out.write("              <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("              </button>\n");
      out.write("              <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"AdminEst.jsp\">LISTADO ESTUDIANTES</a>\n");
      out.write("                  </li>\n");
      out.write("                  <li class=\"nav-item\">\n");
      out.write("                      <a class=\"nav-link\" href=\"inscripcionDoc.jsp\">INSCRIPCION DOCENTE</a>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("                <form class=\"d-flex\">\n");
      out.write("                  <input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                  <button class=\"btn btn-outline-success\" type=\"submit\">Search</button>\n");
      out.write("                </form>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"text-center text-dark\">LISTADO DE ESTUDIANTES</h1>\n");
      out.write("            ");

                  CEstudiante cest = new CEstudiante();
                  List <Estudiante> lest = cest.listarEst();
                  Iterator <Estudiante> iter = lest.iterator();
                  Estudiante est = null;
                  while(iter.hasNext())
                  {
                      est = iter.next();
                   
      out.write("\n");
      out.write("                   <div class=\"btn-group mt-2\">\n");
      out.write("                    <div class=\"btn btn-dark w-75 text-white\">");
      out.print(est.getNombres());
      out.write("&nbsp;");
      out.print(est.getApellidoPaterno());
      out.write("<a href=\"InsEstudiante?adicionarEstudiante=LISTA&ci=");
      out.print(est.getCi());
      out.write("\"><br>ver mas</a></div>\n");
      out.write("                    <!--<a class =\"btn btn-success w-75\" href=\"MateriasEst.jsp?ci=");
      out.print(est.getCi());
      out.write("\">ASIGNAR MATERIAS</a>-->\n");
      out.write("                    <a class =\"btn btn-success w-75\" href=\"InsEstudiante?adicionarEstudiante=MODIFICA&ci=");
      out.print(est.getCi());
      out.write("\">modifica Estudiante </a>\n");
      out.write("                    <a class =\"btn btn-warning w-75\" href=\"InsEstudiante?adicionarEstudiante=IMPRIMA&ci=");
      out.print(est.getCi());
      out.write("\">Imprime Estudiante</a>\n");
      out.write("                    <a class =\"btn btn-danger w-75\" href=\"InsEstudiante?adicionarEstudiante=ELIMINA&ci=");
      out.print(est.getCi());
      out.write("\">Elimina Estudiante</a>\n");
      out.write("                   </div><br>\n");
      out.write("                    \n");
      out.write("                    ");
     
                  }
                 
      out.write("\n");
      out.write("                \n");
      out.write("        </div>\n");
      out.write("         <!--       \n");
      out.write("        ");

         //    }
         //   }catch(NullPointerException ex){
        
      out.write("\n");
      out.write("        <meta http-equiv=\"refresh\" content=\"2; url = Registrarse.jsp\">\n");
      out.write("        ");

          //  }
        
      out.write("\n");
      out.write("        -->\n");
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
