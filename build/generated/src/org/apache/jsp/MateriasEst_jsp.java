package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.CInscrito;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import Controlador.Conexion;

public final class MateriasEst_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"style.style.css\" rel=\"stylesheet\"></link>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(imagenes/paisa.jpg)\">\n");
      out.write("        ");

            int id = Integer.parseInt(request.getParameter("id"));
            Exception a = null;
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form  class=\"form-group\" method=\"get\" action=\"InsInscrito\" >\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <tr>\n");
      out.write("                    ");

                        if(request.getParameter("valor")==null){   
                    
      out.write("    \n");
      out.write("                    <form method=\"get\" action=\"InsInscrito\">\n");
      out.write("                        <td>Semestre y Paralelo:<select name=\"idParalelo\" id=\"idParalelo\" class=\"form-control text-dark border\">\n");
      out.write("                                <option value=\"");
      out.print(a);
      out.write("\">Seleccione su paralelo</option>\n");
      out.write("                                <optgroup label=\"1 SEMESTRE\">\n");
      out.write("                                        <option  value=\"1\">PARALELO A</option>\n");
      out.write("                                        <option value=\"2\">PARALELO B</option>\n");
      out.write("                                        <option value=\"3\">PARALELO C</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                                <optgroup label=\"2 SEMESTRE\">\n");
      out.write("                                        <option value=\"4\">PARALELO A</option>\n");
      out.write("                                        <option  value=\"5\">PARALELO B</option>\n");
      out.write("                                        <option  value=\"6\">PARALELO C</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                                <optgroup label=\"3 SEMESTRE\">\n");
      out.write("                                        <option  value=\"7\">PARALELO A</option>\n");
      out.write("                                        <option  value=\"8\">PARALELO B</option>\n");
      out.write("                                        <option  value=\"9\">PARALELO C</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                                <optgroup label=\"4 SEMESTRE\">\n");
      out.write("                                        <option value=\"10\">PARALELO A</option>\n");
      out.write("                                        <option value=\"11\">PARALELO B</option>\n");
      out.write("                                        <option value=\"12\">PARALELO C</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                                <optgroup label=\"5 SEMESTRE\">\n");
      out.write("                                        <option value=\"13\">PARALELO A</option>\n");
      out.write("                                        <option value=\"14\">PARALELO B</option>\n");
      out.write("                                        <option value=\"15\">PARALELO C</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                                <optgroup label=\"6 SEMESTRE\">\n");
      out.write("                                        <option value=\"16\">PARALELO A</option>\n");
      out.write("                                        <option value=\"17\">PARALELO B</option>\n");
      out.write("                                        <option value=\"18\">PARALELO C</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                                <optgroup label=\"7 SEMESTRE\">\n");
      out.write("                                        <option value=\"19\">PARALELO B</option>\n");
      out.write("                                        <option value=\"20\">PARALELO C</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                                <optgroup label=\"8 SEMESTRE\">\n");
      out.write("                                        <option value=\"21\">PARALELO B</option>\n");
      out.write("                                        <option value=\"22\">PARALELO C</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                                <optgroup label=\"9 SEMESTRE\">\n");
      out.write("                                        <option value=\"23\">PARALELO B</option>\n");
      out.write("                                        <option value=\"24\">PARALELO C</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                                <optgroup label=\"10 SEMESTRE\">\n");
      out.write("                                        <option value=\"25\">PARALELO B</option>\n");
      out.write("                                        <option value=\"26\">PARALELO C</option>\n");
      out.write("                                </optgroup>\n");
      out.write("                            </select>\n");
      out.write("                        </td>\n");
      out.write("                        <td><input type=\"submit\" name=\"registro\" value=\"Confirmar\" class=\"btn bg-dark text-light badge-pill mt-4\"/></td>\n");
      out.write("                        <tr>\n");
      out.write("                        <td><input type=\"hidden\" name=\"idEst\" value=\"");
      out.print(id);
      out.write("\" id=\"envio\" class=\"btn bg-dark text-light btn-block badge-pill mt-4\"/></td>\n");
      out.write("                        </tr> \n");
      out.write("                        <form>\n");
      out.write("                        </tr> \n");
      out.write("                        ");

                        }
                        if(request.getParameter("registro")!=null){  
                             int paralelo = Integer.parseInt(request.getParameter("idParalelo"));
                             CInscrito cins = new CInscrito();
                             String nombres = cins.ObtenerNombre(paralelo);   
                        
      out.write("\n");
      out.write("                        <td>Semestre y Paralelo:<select name=\"idParalelo\" id=\"idParalelo\" class=\"form-control text-dark border\">\n");
      out.write("                                <option value=\"");
      out.print(paralelo);
      out.write('"');
      out.write('>');
      out.print(nombres);
      out.write("</option>\n");
      out.write("                        </td>\n");
      out.write("                        <tr>\n");
      out.write("                        <td>Materia:<select name=\"idMateria\" id=\"idMateria\" class=\"form-control text-dark border\">\n");
      out.write("                                <option value=\"");
      out.print(a);
      out.write("\">Seleccione su materia</option>\n");
      out.write("                                ");

                                  
                                    if (request.getParameter("idParalelo").equals("1") ||request.getParameter("idParalelo").equals("2")||request.getParameter("idParalelo").equals("3")){
                                        
      out.write("\n");
      out.write("                                        <optgroup label=\"1 SEMESTRE\">\n");
      out.write("                                            <option value=\"1\">INTRODUCCIÓN A LA PROGRAMACIÓN</option>\n");
      out.write("                                            <option value=\"2\">QUÍMICA GENERAL</option>\n");
      out.write("                                            <option value=\"3\">CALCULO I</option>\n");
      out.write("                                            <option value=\"4\">ÁLGEBRA I</option>\n");
      out.write("                                            <option value=\"5\">FÍSICA I</option>\n");
      out.write("                                            <option value=\"6\">HISTORIA Y CULTURA ANDINA</option>\n");
      out.write("                                        </optgroup>\n");
      out.write("                                        ");

                                      }
                                    if (request.getParameter("idParalelo").equals("4") ||request.getParameter("idParalelo").equals("5")||request.getParameter("idParalelo").equals("6")){
                                        
      out.write("\n");
      out.write("                                        <optgroup label=\"2 SEMESTRE\">\n");
      out.write("                                            <option value=\"7\">PROGRAMACIÓN I</option>\n");
      out.write("                                            <option value=\"8\">SISTEMAS CONTABLES</option>\n");
      out.write("                                            <option value=\"9\">CALCULO II</option>\n");
      out.write("                                            <option value=\"10\">ÁLGEBRA II</option>\n");
      out.write("                                            <option value=\"11\">FÍSICA II</option>\n");
      out.write("                                            <option value=\"12\">INGLES TÉCNICO I</option>\n");
      out.write("                                        </optgroup>\n");
      out.write("                                        ");

                                      }
                                    if (request.getParameter("idParalelo").equals("7") ||request.getParameter("idParalelo").equals("8")||request.getParameter("idParalelo").equals("9")){
                                        
      out.write("\n");
      out.write("                                        <optgroup label=\"3 SEMESTRE\">\n");
      out.write("                                            <option value=\"13\">PROGRAMACIÓN II</option>\n");
      out.write("                                            <option value=\"14\">ESTRUCTURA DE DATOS</option>\n");
      out.write("                                            <option value=\"15\">CÁLCULO III</option>\n");
      out.write("                                            <option value=\"16\">ESTADÍSTICA I</option>\n");
      out.write("                                            <option value=\"17\">FÍSICA III</option>\n");
      out.write("                                            <option value=\"18\">INGLÉS TÉCNICO II</option>\n");
      out.write("                                        </optgroup>\n");
      out.write("                                        ");

                                      }
                                    if (request.getParameter("idParalelo").equals("10") ||request.getParameter("idParalelo").equals("11")||request.getParameter("idParalelo").equals("12")){
                                        
      out.write("\n");
      out.write("                                         <optgroup label=\"4 SEMESTRE\">\n");
      out.write("                                            <option value=\"19\">BASE DE DATOS I</option>\n");
      out.write("                                            <option value=\"20\">SISTEMAS OPERATIVOS</option>\n");
      out.write("                                            <option value=\"21\">SISTEMAS ADMINISTRATIVOS</option>\n");
      out.write("                                            <option value=\"22\">ANÁLISIS NUMÉRICO</option>\n");
      out.write("                                            <option value=\"23\">ESTADISTICA II</option>\n");
      out.write("                                            <option value=\"24\">ELECTRONICA BASICA</option>\n");
      out.write("                                        </optgroup>\n");
      out.write("                                        ");

                                      }
                                     if (request.getParameter("idParalelo").equals("13") ||request.getParameter("idParalelo").equals("14")||request.getParameter("idParalelo").equals("15")){
                                        
      out.write("\n");
      out.write("                                         <optgroup label=\"5 SEMESTRE\">\n");
      out.write("                                            <option value=\"25\">ANALISIS Y DISEÑO</option>\n");
      out.write("                                            <option value=\"26\">SISTEMAS DIGITALES</option>\n");
      out.write("                                            <option value=\"27\">ARQUITECTURA DE COMPUTADORAS</option>\n");
      out.write("                                            <option value=\"28\">BASE DE DATOS II</option>\n");
      out.write("                                            <option value=\"29\">METODOLOGIA DE INVESTIGACION</option>\n");
      out.write("                                            <option value=\"30\">ORGANIZACION Y METODOS</option>\n");
      out.write("                                            <option value=\"31\">INVESTIGACION OPERATIVA</option>\n");
      out.write("                                        </optgroup>\n");
      out.write("                                        ");

                                      }
                                
      out.write("   \n");
      out.write("                            </select></td>\n");
      out.write("                        </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"hidden\" name=\"idEst\" value=\"");
request.getParameter("idEstudiante");
      out.write("\" id=\"envio\" class=\"btn bg-dark text-light btn-block badge-pill mt-4\"/></td>\n");
      out.write("                    </tr>    \n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" name=\"registro\" value=\"ADICIONAR Y SALIR\" id=\"envio\" class=\"btn bg-dark text-light btn-block badge-pill mt-4\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" name=\"registro\" value=\"ADICIONAR Y ELEGIR OTRA MATERIA\" id=\"envio\" class=\"btn bg-dark text-light btn-block badge-pill mt-4\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                       } 
                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("                ");
    
               try { 
               if(request.getParameter("registro")!=null){      
                    if(request.getParameter("idParalelo").equals("null")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">SELECCIONE UN PARALELO PORFAVOR!!</div>\n");
      out.write("                           ");

                    }else if(request.getParameter("idMateria").equals("null")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO SELECCIONO UNA MATERIA!!</div>\n");
      out.write("                            <div class=\"alert alert-danger\">VOLVER A INGRESAR SUS DATOS</div>\n");
      out.write("                            ");
 
                    }else{
                        
      out.write("                 \n");
      out.write("                        <div id=\"exito\" class=\"alert alert-success\">REGISTRO EXITOSO</div> \n");
      out.write("                        ");

                    }        
                }     
                }catch (Exception e){
                    
      out.write("\n");
      out.write("                    <div class=\"alert alert-danger\">DEBE VALIDAR CORRECTAMENTE LOS DATOS</div>\n");
      out.write("                     <meta http-equiv=\"refresh\" content=\"2; url=MateriasEst.jsp\">\n");
      out.write("                    ");

                }  
      out.write("\n");
      out.write("         </div>\n");
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
