package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import java.util.Iterator;
import Modelo.Grado;
import Controlador.CGrado;
import Controlador.CEstudiante;
import Modelo.Estudiante;
import java.util.regex.*;

public final class inscripcion_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"style/style_1.css\" rel=\"stylesheet\"></link>\n");
      out.write("        <title>Pagina Inscripcion Estudiante</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(imagenes/fondo.jpg)\">\n");
      out.write("        ");

        Exception a = null;
        String ci="",nombres="",apellidoPaterno="",apellidoMaterno="",fechaNacimiento="",telefono="",celular="",correo="",numPuerta="",idCalle="",idZona="";
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form  class=\"form-group\" method=\"get\" action=\"InsEstudiante\" >\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Nª Cedula Identidad: <input type=\"text\" value=\"");
if(request.getParameter("adicionarEstudiante")!=null){ci = request.getParameter("ci");}
      out.print(ci);
      out.write("\" class=\"form-control text-dark border\" id=\"ci\" name=\"ci\" placeholder=\"escriba su CI\"/></td>\n");
      out.write("                        <td>Expedido:<select name=\"expedido\" id=\"expedido\" class=\"form-control text-dark border\">\n");
      out.write("                                <option value=\"");
      out.print(a);
      out.write("\">Seleccione su expedido</option>\n");
      out.write("                                <option value=\"LP\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("LP")){
      out.write("selected");
}}
      out.write(">LP</option>\n");
      out.write("                                <option value=\"SC\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("SC")){
      out.write("selected");
}}
      out.write(">SC</option>\n");
      out.write("                                <option value=\"CB\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("CB")){
      out.write("selected");
}}
      out.write(">CB</option>\n");
      out.write("                                <option value=\"CH\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("CH")){
      out.write("selected");
}}
      out.write(">CH</option>\n");
      out.write("                                <option value=\"PT\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("PT")){
      out.write("selected");
}}
      out.write(">PT</option>\n");
      out.write("                                <option value=\"OR\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("OR")){
      out.write("selected");
}}
      out.write(">OR</option>\n");
      out.write("                                <option value=\"TJ\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("TJ")){
      out.write("selected");
}}
      out.write(">TJ</option>\n");
      out.write("                                <option value=\"BE\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("BE")){
      out.write("selected");
}}
      out.write(">BE</option>\n");
      out.write("                                <option value=\"PD\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("PD")){
      out.write("selected");
}}
      out.write(">PD</option>\n");
      out.write("                                <option value=\"ot\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("Otro")){
      out.write("selected");
}}
      out.write(">Otro</option>\n");
      out.write("                            </select></td>\n");
      out.write("                         \n");
      out.write("                        <td>Nombres:<input type=\"text\" value=\"");
if(request.getParameter("adicionarEstudiante")!=null){nombres = request.getParameter("nombres");}
      out.print(nombres);
      out.write("\" class=\"form-control text-dark border\" id=\"nombres\" name=\"nombres\" placeholder=\"escriba sus nombres\"/></td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Apellidos Paterno:<input type=\"text\" value=\"");
if(request.getParameter("adicionarEstudiante")!=null){apellidoPaterno = request.getParameter("apellidoPaterno");}
      out.print(apellidoPaterno);
      out.write("\" class=\"form-control text-dark border\" id=\"apellidoPaterno\" name=\"apellidoPaterno\" placeholder=\"escriba su Apellido paterno\"/></td>\n");
      out.write("                        <td>Apellidos Materno:<input type=\"text\" value=\"");
if(request.getParameter("adicionarEstudiante")!=null){apellidoMaterno = request.getParameter("apellidoMaterno");}
      out.print(apellidoMaterno);
      out.write("\" class=\"form-control text-dark border\" id=\"apellidoMaterno\" name=\"apellidoMaterno\" placeholder=\"escriba su Apellido materno\"/></td>\n");
      out.write("                        <td>Fecha de nacimiento:<input type=\"text\" value=\"");
if(request.getParameter("adicionarEstudiante")!=null){fechaNacimiento = request.getParameter("fechaNacimiento");}
      out.print(fechaNacimiento);
      out.write("\" class=\"form-control text-dark border\" id=\"fechaNacimiento\" name=\"fechaNacimiento\" placeholder=\"escriba su Fecha Nacimiento\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Telefono:<input type=\"text\" value=\"");
if(request.getParameter("adicionarEstudiante")!=null){telefono = request.getParameter("telefono");}
      out.print(telefono);
      out.write("\" class=\"form-control text-dark border\" id=\"telefono\" name=\"telefono\" placeholder=\"escriba su telefono\"/></td>\n");
      out.write("                        <td>Celular:<input type=\"text\" value=\"");
if(request.getParameter("adicionarEstudiante")!=null){celular = request.getParameter("celular");}
      out.print(celular);
      out.write("\" class=\"form-control text-dark border\" id=\"celular\" name=\"celular\" placeholder=\"escriba su celular\"/></td>\n");
      out.write("                        <td>Correo electronico:<input type=\"text\" value=\"");
if(request.getParameter("adicionarEstudiante")!=null){correo = request.getParameter("correo");}
      out.print(correo);
      out.write("\" class=\"form-control text-dark border\" id=\"correo\" name=\"correo\" placeholder=\"escriba su email\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Sexo:<select name=\"genero\" id=\"genero\" class=\"form-control text-dark border \">\n");
      out.write("                                <option value=\"");
      out.print(a);
      out.write("\">Seleccione su genero</option>\n");
      out.write("                                <option value=\"Hombre\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("genero").equals("Hombre")){
      out.write("selected");
}}
      out.write(">Hombre</option>\n");
      out.write("                                <option value=\"Mujer\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("genero").equals("Mujer")){
      out.write("selected");
}}
      out.write(">Mujer</option>\n");
      out.write("                            </select></td>\n");
      out.write("                        <td>Estado Civil:<select name=\"estadoCivil\" id=\"estadoCivil\" class=\"form-control text-dark border\">\n");
      out.write("                                <option value=\"");
      out.print(a);
      out.write("\">Seleccione su estado Civil</option>\n");
      out.write("                                <option value=\"Soltero\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("estadoCivil").equals("Soltero")){
      out.write("selected");
}}
      out.write(">Soltero</option>\n");
      out.write("                                <option value=\"Casado\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("estadoCivil").equals("Casado")){
      out.write("selected");
}}
      out.write(">Casado</option>\n");
      out.write("                            </select></td> \n");
      out.write("                        <td>Numero Puerta:<input type=\"text\" value=\"");
if(request.getParameter("adicionarEstudiante")!=null){numPuerta = request.getParameter("numPuerta");}
      out.print(numPuerta);
      out.write("\" class=\"form-control text-dark border\" id=\"numPuerta\" name=\"numPuerta\" placeholder=\"escriba su Numero Puerta\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Calle:<input type=\"text\" value=\"");
if(request.getParameter("adicionarEstudiante")!=null){idCalle = request.getParameter("idCalle");}
      out.print(idCalle);
      out.write("\" class=\"form-control text-dark border\" id=\"idCalle\" name=\"idCalle\" placeholder=\"escriba su calle\"/></td>\n");
      out.write("                        <td>Zona:<input type=\"text\" value=\"");
if(request.getParameter("adicionarEstudiante")!=null){idZona = request.getParameter("idZona");}
      out.print(idZona);
      out.write("\" class=\"form-control text-dark border\" id=\"idZona\" name=\"idZona\" placeholder=\"escriba su zona\"/></td>\n");
      out.write("                        <td>Provincia:<select name=\"idProvincia\" id=\"idProvincia\" class=\"form-control text-dark border\">\n");
      out.write("                            <option value=\"");
      out.print(a);
      out.write("\">Seleccione su Provincia</option>\n");
      out.write("                            <optgroup label=\"La Paz\">\n");
      out.write("                                <option value=\"1\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("1")){
      out.write("selected");
}}
      out.write(">Abel Iturralde</option>\n");
      out.write("                                <option value=\"2\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("2")){
      out.write("selected");
}}
      out.write(">Pedro Domingo Murillo</option>\n");
      out.write("                                <option value=\"3\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("3")){
      out.write("selected");
}}
      out.write(">Pacajes</option>\n");
      out.write("                                <option value=\"4\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("4")){
      out.write("selected");
}}
      out.write(">Larecaja</option>\n");
      out.write("                                <option value=\"5\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("5")){
      out.write("selected");
}}
      out.write(">Inquisivi</option>\n");
      out.write("                                <option value=\"6\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("6")){
      out.write("selected");
}}
      out.write(">Sud Yungas</option>\n");
      out.write("                                <option value=\"7\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("7")){
      out.write("selected");
}}
      out.write(">Ingavi</option>\n");
      out.write("                                <option value=\"8\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("8")){
      out.write("selected");
}}
      out.write(">Muñecas</option>\n");
      out.write("                                <option value=\"9\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("9")){
      out.write("selected");
}}
      out.write(">Franz Tamayo</option>\n");
      out.write("                                <option value=\"10\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("10")){
      out.write("selected");
}}
      out.write(">Aroma</option>\n");
      out.write("                                <option value=\"11\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("11")){
      out.write("selected");
}}
      out.write(">Caranavi</option>\n");
      out.write("                                <option value=\"12\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("12")){
      out.write("selected");
}}
      out.write(">José Ramón Loayza</option>\n");
      out.write("                                <option value=\"13\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("13")){
      out.write("selected");
}}
      out.write(">Bautista Saavedra</option>\n");
      out.write("                                <option value=\"14\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("14")){
      out.write("selected");
}}
      out.write(">Eliodoro Camacho</option>\n");
      out.write("                                <option value=\"15\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("15")){
      out.write("selected");
}}
      out.write(">General José Manuel Pando</option>\n");
      out.write("                                <option value=\"16\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("16")){
      out.write("selected");
}}
      out.write(">Gualberto Villaroel</option>\n");
      out.write("                                <option value=\"17\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("17")){
      out.write("selected");
}}
      out.write(">Nor Yungas</option>\n");
      out.write("                                <option value=\"18\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("18")){
      out.write("selected");
}}
      out.write(">Los Andes</option>\n");
      out.write("                                <option value=\"19\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("19")){
      out.write("selected");
}}
      out.write(">Manco Kapac</option>\n");
      out.write("                                <option value=\"20\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("20")){
      out.write("selected");
}}
      out.write(">Omasuyos</option>\n");
      out.write("                             </optgroup>\n");
      out.write("                            <optgroup label=\"Cochabamba\">\n");
      out.write("                                <option value=\"21\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("21")){
      out.write("selected");
}}
      out.write(">Cercado</option>\n");
      out.write("                                <option value=\"22\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("22")){
      out.write("selected");
}}
      out.write(">Quillacollo</option>\n");
      out.write("                                <option value=\"23\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("23")){
      out.write("selected");
}}
      out.write(">Chapare</option>\n");
      out.write("                                <option value=\"24\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("24")){
      out.write("selected");
}}
      out.write(">Tapacari</option>\n");
      out.write("                                <option value=\"25\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("25")){
      out.write("selected");
}}
      out.write(">Bolívar</option>\n");
      out.write("                                <option value=\"26\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("26")){
      out.write("selected");
}}
      out.write(">Arque</option>\n");
      out.write("                                <option value=\"27\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("27")){
      out.write("selected");
}}
      out.write(">Capinota</option>\n");
      out.write("                                <option value=\"28\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("28")){
      out.write("selected");
}}
      out.write(">Mizque</option>\n");
      out.write("                                <option value=\"29\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("29")){
      out.write("selected");
}}
      out.write(">Campero</option>\n");
      out.write("                                <option value=\"30\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("30")){
      out.write("selected");
}}
      out.write(">Ayopaya</option>\n");
      out.write("                                <option value=\"31\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("31")){
      out.write("selected");
}}
      out.write(">Carrasco</option>\n");
      out.write("                                <option value=\"32\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("32")){
      out.write("selected");
}}
      out.write(">Punata</option>\n");
      out.write("                                <option value=\"33\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("33")){
      out.write("selected");
}}
      out.write(">Araní</option>\n");
      out.write("                                <option value=\"34\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("34")){
      out.write("selected");
}}
      out.write(">Esteban Arze</option>\n");
      out.write("                                <option value=\"35\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("35")){
      out.write("selected");
}}
      out.write(">Germán Jordán </option>\n");
      out.write("                                <option value=\"36\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("36")){
      out.write("selected");
}}
      out.write(">Tiraque</option>\n");
      out.write("                            </optgroup>\n");
      out.write("                            <optgroup label=\"Santa Cruz\">\n");
      out.write("                                <option value=\"37\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("37")){
      out.write("selected");
}}
      out.write(">Andrés Ibáñez</option>\n");
      out.write("                                <option value=\"38\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("38")){
      out.write("selected");
}}
      out.write(">Ángel Sandoval</option>\n");
      out.write("                                <option value=\"39\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("39")){
      out.write("selected");
}}
      out.write(">Chiquitos</option>\n");
      out.write("                                <option value=\"40\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("40")){
      out.write("selected");
}}
      out.write(">Florida</option>\n");
      out.write("                                <option value=\"41\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("41")){
      out.write("selected");
}}
      out.write(">Germán Busch</option>\n");
      out.write("                                <option value=\"42\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("42")){
      out.write("selected");
}}
      out.write(">Guarayos</option>\n");
      out.write("                                <option value=\"43\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("43")){
      out.write("selected");
}}
      out.write(">Ichilo</option>\n");
      out.write("                                <option value=\"44\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("44")){
      out.write("selected");
}}
      out.write(">José Miguel de Velasco</option>\n");
      out.write("                                <option value=\"45\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("45")){
      out.write("selected");
}}
      out.write(">Manuel María Caballero</option>\n");
      out.write("                                <option value=\"46\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("46")){
      out.write("selected");
}}
      out.write(">Ñuflo de Chávez</option>\n");
      out.write("                                <option value=\"47\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("47")){
      out.write("selected");
}}
      out.write(">Obispo Santisteban</option>\n");
      out.write("                                <option value=\"48\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("48")){
      out.write("selected");
}}
      out.write(">Sara</option>\n");
      out.write("                                <option value=\"49\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("49")){
      out.write("selected");
}}
      out.write(">Vallegrande</option>\n");
      out.write("                                <option value=\"50\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("50")){
      out.write("selected");
}}
      out.write(">Warnes</option>\n");
      out.write("                                <option value=\"51\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("51")){
      out.write("selected");
}}
      out.write(">Cordillera</option>\n");
      out.write("                            </optgroup>\n");
      out.write("                        </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <td>Ciudad:<select name=\"idCiudad\" id=\"idCiudad\" class=\"form-control text-dark border\">\n");
      out.write("                            <option value=\"");
      out.print(a);
      out.write("\">Seleccione su Ciudad</option>\n");
      out.write("                            <option value=\"1\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("1")){
      out.write("selected");
}}
      out.write(">La Paz</option>\n");
      out.write("                            <option value=\"2\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("2")){
      out.write("selected");
}}
      out.write(">El Alto</option>\n");
      out.write("                            <option value=\"3\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("3")){
      out.write("selected");
}}
      out.write(">Santa Cruz</option>\n");
      out.write("                            <option value=\"4\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("4")){
      out.write("selected");
}}
      out.write(">Cochabamba</option>\n");
      out.write("                            <option value=\"5\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("5")){
      out.write("selected");
}}
      out.write(">Chuquisaca</option>\n");
      out.write("                            <option value=\"6\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("6")){
      out.write("selected");
}}
      out.write(">Potosi</option>\n");
      out.write("                            <option value=\"7\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("7")){
      out.write("selected");
}}
      out.write(">Oruro</option>\n");
      out.write("                            <option value=\"8\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("8")){
      out.write("selected");
}}
      out.write(">Tarija</option>\n");
      out.write("                            <option value=\"9\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("9")){
      out.write("selected");
}}
      out.write(">Beni</option>\n");
      out.write("                            <option value=\"10\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("10")){
      out.write("selected");
}}
      out.write(">Pando</option>\n");
      out.write("                            <option value=\"11\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("11")){
      out.write("selected");
}}
      out.write(">Otro</option>\n");
      out.write("                        </select></td> \n");
      out.write("                        <td>Departamento:<select name=\"idDepartamento\" id=\"idDepartamento\" class=\"form-control text-dark border\">\n");
      out.write("                                <option value=\"");
      out.print(a);
      out.write("\">Seleccione su departamento</option>\n");
      out.write("                                <option value=\"1\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("1")){
      out.write("selected");
}}
      out.write(">La Paz</option>\n");
      out.write("                                <option value=\"2\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("2")){
      out.write("selected");
}}
      out.write(">Santa Cruz</option>\n");
      out.write("                                <option value=\"3\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("3")){
      out.write("selected");
}}
      out.write(">Cochabamba</option>\n");
      out.write("                                <option value=\"4\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("4")){
      out.write("selected");
}}
      out.write(">Chuquisaca</option>\n");
      out.write("                                <option value=\"5\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("5")){
      out.write("selected");
}}
      out.write(">Potosi</option>\n");
      out.write("                                <option value=\"6\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("6")){
      out.write("selected");
}}
      out.write(">Oruro</option>\n");
      out.write("                                <option value=\"7\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("7")){
      out.write("selected");
}}
      out.write(">Tarija</option>\n");
      out.write("                                <option value=\"8\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("8")){
      out.write("selected");
}}
      out.write(">Beni</option>\n");
      out.write("                                <option value=\"9\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("9")){
      out.write("selected");
}}
      out.write(">Pando</option>\n");
      out.write("                                <option value=\"10\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("10")){
      out.write("selected");
}}
      out.write(">Otro</option>\n");
      out.write("                            </select></td> \n");
      out.write("                        <td>Nacionalidad:<select name=\"idNacionalidad\" id=\"idNacionalidad\" class=\"form-control text-dark border\">\n");
      out.write("                            <option value=\"");
      out.print(a);
      out.write("\">Seleccione su Nacionalidad</option>\n");
      out.write("                            <option value=\"1\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("1")){
      out.write("selected");
}}
      out.write(">Argentina</option>\n");
      out.write("                            <option value=\"2\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("2")){
      out.write("selected");
}}
      out.write(">Bolivia</option>\n");
      out.write("                            <option value=\"3\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("3")){
      out.write("selected");
}}
      out.write(">Brasil</option>\n");
      out.write("                            <option value=\"4\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("4")){
      out.write("selected");
}}
      out.write(">Chile</option>\n");
      out.write("                            <option value=\"5\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("5")){
      out.write("selected");
}}
      out.write(">Colombia</option>\n");
      out.write("                            <option value=\"6\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("6")){
      out.write("selected");
}}
      out.write(">Venezuela</option>\n");
      out.write("                            <option value=\"7\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("7")){
      out.write("selected");
}}
      out.write(">Peru</option>\n");
      out.write("                            <option value=\"8\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("8")){
      out.write("selected");
}}
      out.write(">Paraguay</option>\n");
      out.write("                            <option value=\"9\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("9")){
      out.write("selected");
}}
      out.write(">Uruguay</option>\n");
      out.write("                            <option value=\"10\" ");
if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("10")){
      out.write("selected");
}}
      out.write(">Otro</option>\n");
      out.write("                        </select></td>\n");
      out.write("                    \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" name=\"adicionarEstudiante\" value=\"GUARDAR\" id=\"envio\" class=\"btn bg-dark text-light btn-block badge-pill mt-4\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("                ");
    
               try { 
               if(request.getParameter("adicionarEstudiante")!=null){      
                    if(request.getParameter("ci").equals("null")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA EN CI</div>\n");
      out.write("                           ");


                    }else if(request.getParameter("ci").matches("[a-zA-Z.-]*")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA EN CI</div>\n");
      out.write("                            ");
 
                    }else if(request.getParameter("expedido").equals("null")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">SELECCIONE UN EXPEDIDO PORFAVOR!!</div>\n");
      out.write("                            ");
 
                    }else if(request.getParameter("nombres").equals("")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN NOMBRES</div>\n");
      out.write("                            ");

                    }else if(request.getParameter("nombres").matches("\\d*")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE DIGITOS EN CAMPO NOMBRES</div>\n");
      out.write("                            ");
  
                    }else if(request.getParameter("apellidoPaterno").equals("")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN APELLIDO PATERNO</div>\n");
      out.write("                            ");
 
                    }else if(request.getParameter("apellidoPaterno").matches("\\d*")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE DIGITOS EN CAMPO APELLIDO PATERNO</div>\n");
      out.write("                            ");
 
                    }else if(request.getParameter("apellidoMaterno").equals("")){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN APELLIDO MATERNO</div>\n");
      out.write("                        ");
  
                    }else if(request.getParameter("apellidoMaterno").matches("\\d*")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE DIGITOS EN CAMPO APELLIDO MATERNO</div>\n");
      out.write("                            ");
 
                    }else if(request.getParameter("fechaNacimiento").equals("")){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN FECHA</div>\n");
      out.write("                        ");
 
                    }else if(request.getParameter("fechaNacimiento").matches("[0]*")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE VALOR 0 EN FECHA</div>\n");
      out.write("                            ");

                    }else if(request.getParameter("telefono") == null){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA EN TELEFONO</div>\n");
      out.write("                        ");
 
                    }else if(request.getParameter("telefono").matches("[0]*")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE VALOR 0 EN TELEFONO</div>\n");
      out.write("                            ");
 
                    }else if(request.getParameter("celular") == null){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA EN CELULAR</div>\n");
      out.write("                        ");
  
                    }else if(request.getParameter("celular").matches("[0]*")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE VALOR 0 EN CELULAR</div>\n");
      out.write("                            ");

                    }else if(request.getParameter("correo").equals("")){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN CAMPO CORREO</div>\n");
      out.write("                        ");
  
                    }else if(request.getParameter("correo").matches("[0]*")){   
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE VALOR 0 EN CORREO</div>\n");
      out.write("                            ");
 
                    }else if(request.getParameter("estadoCivil").equals("null")){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UNA OPCION EN ESTADO CIVIL PORFAVOR!! </div>\n");
      out.write("                        ");
 
                    }else if(request.getParameter("genero").equals("null")){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UN OPCION EN CAMPO GENERO PORFAVOR!!</div>\n");
      out.write("                        ");
  
                    }else if(request.getParameter("numPuerta") == null){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA EN CAMPO NUMERO PUERTA</div>\n");
      out.write("                        ");

                    }else if(request.getParameter("numPuerta").matches("[0]*")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE VALOR 0 EN NUMERO PUERTA</div>\n");
      out.write("                            ");

                    }else if(request.getParameter("idCalle").equals("")){
                         
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN CAMPO CALLE</div>\n");
      out.write("                        ");
 
                    }else if(request.getParameter("idCalle").matches("\\d*")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE DIGITOS EN CALLE</div>\n");
      out.write("                            ");
 
                    }else if(request.getParameter("idZona").equals("")){
                          
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN CAMPO ZONA</div>\n");
      out.write("                        ");
 
                    }else if(request.getParameter("idZona").matches("\\d*")){
                        
      out.write("\n");
      out.write("                            <div class=\"alert alert-danger\">ERROR NO PERMITE DIGITOS EN CAMPO ZONA</div>\n");
      out.write("                            ");
  
                    }else if(request.getParameter("idDepartamento").equals("null")){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UNA OPCION EN DEPARTAMENTO PORFAVOR!!</div>\n");
      out.write("                        ");

                    }else if(request.getParameter("idProvincia").equals("null")){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UNA OPCION EN PROVINCIA PORFAVOR!!</div>\n");
      out.write("                        ");
  
                    }else if(request.getParameter("idCiudad").equals("null")){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UNA OPCION EN CIUDAD PORFAVOR!!</div>\n");
      out.write("                        ");
 
                    }else if(request.getParameter("idNacionalidad").equals("null")){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UNA OPCION EN NACIONALIDAD PORFAVOR!!</div>\n");
      out.write("                        ");
  
                    }else{
                        
      out.write("                 \n");
      out.write("                        <div id=\"exito\" class=\"alert alert-success\">REGISTRO EXITOSO</div> \n");
      out.write("                        ");

                    }        
               }     
                    }catch (Exception e){
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">DEBE VALIDAR CORRECTAMENTE LOS DATOS</div>\n");
      out.write("                        ");

                    }
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
