package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inscripcionDoc_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"style_1.css\" rel=\"stylesheet\"></link>\n");
      out.write("        <title>Pagina Inscripcion Docente</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(cielo.jpg)\">\n");
      out.write("        ");

            Exception a = null;
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form  class=\"form-group\" method=\"get\" action=\"InsDocente\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Nª Cedula Identidad: <input type=\"text\" class=\"form-control text-white border btn-outline-dark\" id=\"ci\" name=\"ci\" placeholder=\"escriba su CI\"/></td>\n");
      out.write("                        <td>Expedido:<select name=\"expedido\" id=\"expedido\" class=\"form-control text-dark border btn-outline-white\">\n");
      out.write("                                <option value=\"");
      out.print(a);
      out.write("\">Seleccione su expedido</option>\n");
      out.write("                                <option value=\"LP\">LP</option>\n");
      out.write("                                <option value=\"SC\">SC</option>\n");
      out.write("                                <option value=\"CB\">CB</option>\n");
      out.write("                                <option value=\"CH\">CH</option>\n");
      out.write("                                <option value=\"PT\">PT</option>\n");
      out.write("                                <option value=\"OR\">OR</option>\n");
      out.write("                                <option value=\"TJ\">TJ</option>\n");
      out.write("                                <option value=\"BE\">BE</option>\n");
      out.write("                                <option value=\"PD\">PD</option>\n");
      out.write("                                <option value=\"ot\">Otro</option>\n");
      out.write("                            </select></td>\n");
      out.write("                         \n");
      out.write("                        <td>Nombres:<input type=\"text\" class=\"form-control text-white border btn-outline-dark\" id=\"nombres\" name=\"nombres\" placeholder=\"escriba sus nombres\"/></td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Apellidos Paterno:<input type=\"text\" class=\"form-control text-white border btn-outline-dark\" id=\"apellidoPaterno\" name=\"apellidoPaterno\" placeholder=\"escriba su Apellido paterno\"/></td>\n");
      out.write("                        <td>Apellidos Materno:<input type=\"text\" class=\"form-control text-white border btn-outline-dark\" id=\"apellidoMaterno\" name=\"apellidoMaterno\" placeholder=\"escriba su Apellido materno\"/></td>\n");
      out.write("                        <td>Fecha de nacimiento:<input type=\"text\" class=\"form-control text-white border btn-outline-dark\" id=\"fechaNacimiento\" name=\"fechaNacimiento\" placeholder=\"escriba su Fecha Nacimiento\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Telefono:<input type=\"text\" class=\"form-control text-white border btn-outline-dark\" id=\"telefono\" name=\"telefono\" placeholder=\"escriba su telefono\"/></td>\n");
      out.write("                        <td>Celular:<input type=\"text\" class=\"form-control text-white border btn-outline-dark\" id=\"celular\" name=\"celular\" placeholder=\"escriba su celular\"/></td>\n");
      out.write("                        <td>Correo electronico:<input type=\"text\" class=\"form-control text-white border btn-outline-dark\" id=\"correo\" name=\"correo\" placeholder=\"escriba su email\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Sexo:<select name=\"genero\" id=\"genero\" class=\"form-control text-dark border btn-outline-white\">\n");
      out.write("                                <option value=\"");
      out.print(a);
      out.write("\">Seleccione su genero</option>\n");
      out.write("                                <option value=\"Hombre\">Hombre</option>\n");
      out.write("                                <option value=\"Mujer\">Mujer</option>\n");
      out.write("                            </select></td>\n");
      out.write("                        <td>Estado Civil:<select name=\"estadoCivil\" id=\"estadoCivil\" class=\"form-control text-dark border btn-outline-white\">\n");
      out.write("                                <option value=\"");
      out.print(a);
      out.write("\">Seleccione su estado Civil</option>\n");
      out.write("                                <option value=\"Soltero\">Soltero</option>\n");
      out.write("                                <option value=\"Casado\">Casado</option>\n");
      out.write("                            </select></td> \n");
      out.write("                        <td>Numero Puerta:<input type=\"text\" class=\"form-control text-white border btn-outline-dark\" id=\"numPuerta\" name=\"numPuerta\" placeholder=\"escriba su Numero Puerta\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Calle:<input type=\"text\" class=\"form-control text-white border btn-outline-dark\" id=\"idCalle\" name=\"idCalle\" placeholder=\"escriba su calle\"/></td>\n");
      out.write("                        <td>Zona:<input type=\"text\" class=\"form-control text-white border btn-outline-dark\" id=\"idZona\" name=\"idZona\" placeholder=\"escriba su zona\"/></td>\n");
      out.write("                        <td>Departamento:<select name=\"idDepartamento\" id=\"idDepartamento\" class=\"form-control text-dark border btn-outline-white\">\n");
      out.write("                                <option value=\"");
      out.print(a);
      out.write("\">Seleccione su departamento</option>\n");
      out.write("                                <option value=\"1\">La Paz</option>\n");
      out.write("                                <option value=\"2\">Santa Cruz</option>\n");
      out.write("                                <option value=\"3\">Cochabamba</option>\n");
      out.write("                                <option value=\"4\">Chuquisaca</option>\n");
      out.write("                                <option value=\"5\">Potosi</option>\n");
      out.write("                                <option value=\"6\">Oruro</option>\n");
      out.write("                                <option value=\"7\">Tarija</option>\n");
      out.write("                                <option value=\"8\">Beni</option>\n");
      out.write("                                <option value=\"9\">Pando</option>\n");
      out.write("                                <option value=\"10\">Otro</option>\n");
      out.write("                            </select></td> \n");
      out.write("                    </tr>\n");
      out.write("                    <td>Ciudad:<select name=\"idCiudad\" id=\"idCiudad\" class=\"form-control text-dark border btn-outline-white\">\n");
      out.write("                            <option value=\"");
      out.print(a);
      out.write("\">Seleccione su Ciudad</option>\n");
      out.write("                            <option value=\"1\">La Paz</option>\n");
      out.write("                            <option value=\"2\">El Alto</option>\n");
      out.write("                            <option value=\"3\">Santa Cruz</option>\n");
      out.write("                            <option value=\"4\">Cochabamba</option>\n");
      out.write("                            <option value=\"5\">Chuquisaca</option>\n");
      out.write("                            <option value=\"6\">Potosi</option>\n");
      out.write("                            <option value=\"7\">Oruro</option>\n");
      out.write("                            <option value=\"8\">Tarija</option>\n");
      out.write("                            <option value=\"9\">Beni</option>\n");
      out.write("                            <option value=\"10\">Pando</option>\n");
      out.write("                            <option value=\"11\">Otro</option>\n");
      out.write("                        </select></td> \n");
      out.write("                    <td>Provincia:<select name=\"idProvincia\" id=\"idProvincia\" class=\"form-control text-dark border btn-outline-white\">\n");
      out.write("                            <option value=\"");
      out.print(a);
      out.write("\">Seleccione su Provincia</option>\n");
      out.write("                            <optgroup label=\"La Paz\">\n");
      out.write("                                <option value=\"1\">Abel Iturralde</option>\n");
      out.write("                                <option value=\"2\">Pedro Domingo Murillo</option>\n");
      out.write("                                <option value=\"3\">Pacajes</option>\n");
      out.write("                                <option value=\"4\">Larecaja</option>\n");
      out.write("                                <option value=\"5\">Inquisivi</option>\n");
      out.write("                                <option value=\"6\">Sud Yungas</option>\n");
      out.write("                                <option value=\"7\">Ingavi</option>\n");
      out.write("                                <option value=\"8\">Muñecas</option>\n");
      out.write("                                <option value=\"9\">Franz Tamayo</option>\n");
      out.write("                                <option value=\"10\">Aroma</option>\n");
      out.write("                                <option value=\"11\">Caranavi</option>\n");
      out.write("                                <option value=\"12\">José Ramón Loayza</option>\n");
      out.write("                                <option value=\"13\">Bautista Saavedra</option>\n");
      out.write("                                <option value=\"14\">Eliodoro Camacho</option>\n");
      out.write("                                <option value=\"15\">General José Manuel Pando</option>\n");
      out.write("                                <option value=\"16\">Gualberto Villaroel</option>\n");
      out.write("                                <option value=\"17\">Nor Yungas</option>\n");
      out.write("                                <option value=\"18\">Los Andes</option>\n");
      out.write("                                <option value=\"19\">Manco Kapac</option>\n");
      out.write("                                <option value=\"20\">Omasuyos</option>\n");
      out.write("                            </optgroup>\n");
      out.write("                            <optgroup label=\"Cochabamba\">\n");
      out.write("                                <option value=\"21\">Cercado</option>\n");
      out.write("                                <option value=\"22\">Quillacollo</option>\n");
      out.write("                                <option value=\"23\">Chapare</option>\n");
      out.write("                                <option value=\"24\">Tapacari</option>\n");
      out.write("                                <option value=\"25\">Bolívar</option>\n");
      out.write("                                <option value=\"26\">Arque</option>\n");
      out.write("                                <option value=\"27\">Capinota</option>\n");
      out.write("                                <option value=\"28\">Mizque</option>\n");
      out.write("                                <option value=\"29\">Campero</option>\n");
      out.write("                                <option value=\"30\">Ayopaya</option>\n");
      out.write("                                <option value=\"31\">Carrasco</option>\n");
      out.write("                                <option value=\"32\">Punata</option>\n");
      out.write("                                <option value=\"33\">Araní</option>\n");
      out.write("                                <option value=\"34\">Esteban Arze</option>\n");
      out.write("                                <option value=\"35\">Germán Jordán </option>\n");
      out.write("                                <option value=\"36\">Tiraque</option>\n");
      out.write("                            </optgroup>\n");
      out.write("                            <optgroup label=\"Santa Cruz\">\n");
      out.write("                                <option value=\"37\">Andrés Ibáñez</option>\n");
      out.write("                                <option value=\"38\">Ángel Sandoval</option>\n");
      out.write("                                <option value=\"39\">Chiquitos</option>\n");
      out.write("                                <option value=\"40\">Florida</option>\n");
      out.write("                                <option value=\"41\">Germán Busch</option>\n");
      out.write("                                <option value=\"42\">Guarayos</option>\n");
      out.write("                                <option value=\"43\">Ichilo</option>\n");
      out.write("                                <option value=\"44\">José Miguel de Velasco</option>\n");
      out.write("                                <option value=\"45\">Manuel María Caballero</option>\n");
      out.write("                                <option value=\"46\">Ñuflo de Chávez</option>\n");
      out.write("                                <option value=\"47\">Obispo Santisteban</option>\n");
      out.write("                                <option value=\"48\">Sara</option>\n");
      out.write("                                <option value=\"49\">Vallegrande</option>\n");
      out.write("                                <option value=\"50\">Warnes</option>\n");
      out.write("                                <option value=\"51\">Cordillera</option>\n");
      out.write("                            </optgroup>\n");
      out.write("                        </select></td>\n");
      out.write("                    <td>Nacionalidad:<select name=\"idNacionalidad\" id=\"idNacionalidad\" class=\"form-control text-dark border btn-outline-white\">\n");
      out.write("                            <option value=\"");
      out.print(a);
      out.write("\">Seleccione su Nacionalidad</option>\n");
      out.write("                            <option value=\"1\">Argentina</option>\n");
      out.write("                            <option value=\"2\">Bolivia</option>\n");
      out.write("                            <option value=\"3\">Brasil</option>\n");
      out.write("                            <option value=\"4\">Chile</option>\n");
      out.write("                            <option value=\"5\">Colombia</option>\n");
      out.write("                            <option value=\"6\">Venezuela</option>\n");
      out.write("                            <option value=\"7\">Peru</option>\n");
      out.write("                            <option value=\"8\">Paraguay</option>\n");
      out.write("                            <option value=\"9\">Uruguay</option>\n");
      out.write("                            <option value=\"10\">Otro</option>\n");
      out.write("                        </select></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" name=\"adicionarDocente\" value=\"ENVIAR\" class=\"btn bg-dark text-light btn-block badge-pill mt-4\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </form>\n");
      out.write("            ");

                try { 
                int ci=0, telefono=0, celular=0, numPuerta=0, idProvincia=0, idCiudad=0, idDepartamento=0, idNacionalidad=0;
                String expedido = "", nombres="", apellidoPaterno="", apellidoMaterno="", correo="", genero="", fechaNacimiento="", estadoCivil="", idCalle="", idZona="";
                      if(request.getParameter("adicionarDocente")!=null){    
                        if (request.getParameter("ci") != null) {
                            if(request.getParameter("ci").matches("[0]*")){
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">ERROR NO PERMITE VALOR 0</div>\n");
      out.write("                                ");
  
                            }else{
                                ci = Integer.parseInt(request.getParameter("ci"));
                            }   
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA EN CI</div>\n");
      out.write("                        ");
         
                        }

                        if (!request.getParameter("expedido").equals("null")) {
                            expedido = request.getParameter("expedido");
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UN EXPEDIDO PORFAVOR!!</div>\n");
      out.write("                        ");
         
                        }

                        if (!request.getParameter("nombres").equals("")) {
                            if(request.getParameter("nombres").matches("\\d*")){
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">ERROR NO PERMITE DIGITOS EN CAMPO NOMBRES</div>\n");
      out.write("                                ");
  
                            }else{
                                nombres = request.getParameter("nombres");
                            }   
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN NOMBRES</div>\n");
      out.write("                        ");
         
                        }

                        if (!request.getParameter("apellidoPaterno").equals("")) {
                            if(request.getParameter("apellidoPaterno").matches("\\d*")){
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">ERROR NO PERMITE DIGITOS EN CAMPO APELLIDO PATERNO</div>\n");
      out.write("                                ");
  
                            }else{
                                apellidoPaterno = request.getParameter("apellidoPaterno");
                            }                    
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN APELLIDO PATERNO</div>\n");
      out.write("                        ");
         
                        }
                        if (!request.getParameter("apellidoMaterno").equals("")) {
                            if(request.getParameter("apellidoMaterno").matches("\\d*")){
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">ERROR NO PERMITE DIGITOS EN CAMPO APELLIDO MATERNO</div>\n");
      out.write("                                ");
  
                            }else{
                                apellidoMaterno = request.getParameter("apellidoMaterno");
                            }  
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN APELLIDO MATERNO</div>\n");
      out.write("                        ");
         
                        }
                        if (!request.getParameter("fechaNacimiento").equals("")) {
                            if(request.getParameter("fechaNacimiento").matches("[0]*")){
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">ERROR NO PERMITE VALOR 0 EN FECHA</div>\n");
      out.write("                                ");
  
                            }else{
                                fechaNacimiento = request.getParameter("fechaNacimiento");
                            } 
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN FECHA</div>\n");
      out.write("                        ");
         
                        }

                        if (request.getParameter("telefono") != null) {
                            if(request.getParameter("telefono").matches("[0]*")){
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">ERROR NO PERMITE VALOR 0 EN TELEFONO</div>\n");
      out.write("                                ");
 
                             }else{
                                telefono = Integer.parseInt(request.getParameter("telefono"));
                             }                                    
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA EN TELEFONO</div>\n");
      out.write("                        ");
         
                        }

                        if (request.getParameter("celular") != null) {
                            if(request.getParameter("celular").matches("[0]*")){
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">ERROR NO PERMITE VALOR 0 EN CELULAR</div>\n");
      out.write("                                ");
 
                             }else{
                                celular = Integer.parseInt(request.getParameter("celular"));
                             }  
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA EN CELULAR</div>\n");
      out.write("                        ");
         
                        }

                        if (!request.getParameter("correo").equals("")) {
                            if(request.getParameter("correo").matches("[0]*")){
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">ERROR NO PERMITE VALOR 0 EN CORREO</div>\n");
      out.write("                                ");
  
                            }else{
                                correo = request.getParameter("correo");
                            } 
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN CAMPO CORREO</div>\n");
      out.write("                        ");
         
                        }
                        
                        if (!request.getParameter("estadoCivil").equals("null")) {
                        estadoCivil = request.getParameter("estadoCivil");
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UNA OPCION EN ESTADO CIVIL PORFAVOR!! </div>\n");
      out.write("                        ");
         
                        }

                        if (!request.getParameter("genero").equals("null")) {
                        genero = request.getParameter("genero");
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UN OPCION EN CAMPO GENERO PORFAVOR!!</div>\n");
      out.write("                        ");
         
                        }

                        if (request.getParameter("numPuerta") != null) {
                            if(request.getParameter("numPuerta").matches("[0]*")){
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">ERROR NO PERMITE VALOR 0 EN NUMERO PUERTA</div>\n");
      out.write("                                ");
  
                            }else{
                                numPuerta = Integer.parseInt(request.getParameter("numPuerta"));
                            }   
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA EN CAMPO NUMERO PUERTA</div>\n");
      out.write("                        ");
         
                        }

                        if (!request.getParameter("idCalle").equals("")) {
                            if(request.getParameter("idCalle").matches("\\d*")){
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">ERROR NO PERMITE DIGITOS EN CALLE</div>\n");
      out.write("                                ");
  
                            }else{
                                idCalle = request.getParameter("idCalle");
                            }        
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN CAMPO CALLE</div>\n");
      out.write("                        ");
         
                        }

                        if (!request.getParameter("idZona").equals("")) {
                            if(request.getParameter("idZona").matches("\\d*")){
                                
      out.write("\n");
      out.write("                                <div class=\"alert alert-danger\">ERROR NO PERMITE DIGITOS EN CAMPO ZONA</div>\n");
      out.write("                                ");
  
                            }else{
                                idZona = request.getParameter("idZona");
                            } 
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">ERROR NO PERMITE CADENA VACIA EN CAMPO ZONA</div>\n");
      out.write("                        ");
         
                        }

                        if (!request.getParameter("idDepartamento").equals("null")) {
                        idDepartamento = Integer.parseInt(request.getParameter("idDepartamento"));
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UNA OPCION EN DEPARTAMENTO PORFAVOR!!</div>\n");
      out.write("                        ");
         
                        }
                        
                        if (!request.getParameter("idProvincia").equals("null")) {
                        idProvincia = Integer.parseInt(request.getParameter("idProvincia"));
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UNA OPCION EN PROVINCIA PORFAVOR!!</div>\n");
      out.write("                        ");
         
                        }

                        if (!request.getParameter("idCiudad").equals("null")) {
                        idCiudad = Integer.parseInt(request.getParameter("idCiudad"));
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UNA OPCION EN CIUDAD PORFAVOR!!</div>\n");
      out.write("                        ");
         
                        }

                        if (!request.getParameter("idNacionalidad").equals("null")) {
                        idNacionalidad = Integer.parseInt(request.getParameter("idNacionalidad"));
                        }else{
                        
      out.write("\n");
      out.write("                        <div class=\"alert alert-danger\">SELECCIONE UNA OPCION EN NACIONALIDAD PORFAVOR!!</div>\n");
      out.write("                        ");
         
                        }
                        
                        if(request.getParameter("adicionarDocente")!=null){
                            if(expedido != "" && nombres != "" && apellidoPaterno!="" && apellidoMaterno!="" && correo!="" && genero!="" && fechaNacimiento!="" && estadoCivil!="" && idCalle!="" && idZona!=""){
                                 if(ci!=0 && telefono!=0 && celular!=0 && numPuerta!=0 && idProvincia!=0 && idCiudad!=0 && idDepartamento!=0 && idNacionalidad!=0){
                                        if(expedido != "null" && genero!="null" && estadoCivil!="null"){
                                            
      out.write("\n");
      out.write("                                            <div id=\"exito\" class=\"alert alert-success\">REGISTRO EXITOSO</div>\n");
      out.write("                                            ");

                                        }
                                  }   
                            }
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
