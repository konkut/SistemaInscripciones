<%-- 
    Document   : modificarEst
    Created on : 28-jun-2021, 14:14:10
    Author     : luis
--%>
<%@page import="java.util.ArrayList"%>
<%@page import=" Controlador.CEstudiante"%>
<%@page import=" Modelo.Estudiante"%>
<%@page import=" java.util.regex.*"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link href="style/style_1.css" rel="stylesheet"></link>
        <title>Pagina modificacion Estudiante</title>
    </head>
    <body style="background-image: url(imagenes/paisa.jpg)">
        <%
        Exception a = null;
        int id = Integer.parseInt(request.getAttribute("ci").toString());
        CEstudiante cest = new CEstudiante();
        ArrayList<Estudiante> lest = cest.listarId(id);
        Estudiante est = null;
        est = lest.get(0); 
        %>
        <div class="container">
            <form  class="form-group" method="get" action="InsEstudiante" >
                <table class="table table-striped">
                    <tr>
                        <td>Nª Cedula Identidad: <input type="text" value="<%=est.getCi()%>" class="form-control text-dark border" id="ci" name="ci" placeholder="escriba su CI"/></td>
                        <td>Expedido:<select name="expedido" id="expedido" class="form-control text-dark border">
                                <option value="<%=est.getExpedido()%>"><%=est.getExpedido()%></option>
                                <option value="LP">LP</option>
                                <option value="SC">SC</option>
                                <option value="CB">CB</option>
                                <option value="CH">CH</option>
                                <option value="PT">PT</option>
                                <option value="OR">OR</option>
                                <option value="TJ">TJ</option>
                                <option value="BE">BE</option>
                                <option value="PD">PD</option>
                                <option value="ot">Otro</option>
                            </select></td>
                         
                        <td>Nombres:<input type="text" value="<%=est.getNombres()%>" class="form-control text-dark border" id="nombres" name="nombres" placeholder="escriba sus nombres"/></td>
                        
                    </tr>
                    <tr>
                        <td>Apellidos Paterno:<input type="text" value="<%=est.getApellidoPaterno()%>" class="form-control text-dark border" id="apellidoPaterno" name="apellidoPaterno" placeholder="escriba su Apellido paterno"/></td>
                        <td>Apellidos Materno:<input type="text" value="<%=est.getApellidoMaterno()%>" class="form-control text-dark border" id="apellidoMaterno" name="apellidoMaterno" placeholder="escriba su Apellido materno"/></td>
                        <td>Fecha de nacimiento:<input type="text" value="<%=est.getFechaNacimiento()%>" class="form-control text-dark border" id="fechaNacimiento" name="fechaNacimiento" placeholder="escriba su Fecha Nacimiento"></td>
                    </tr>
                    <tr>
                        <td>Telefono:<input type="text" value="<%=est.getTelefono()%>" class="form-control text-dark border" id="telefono" name="telefono" placeholder="escriba su telefono"/></td>
                        <td>Celular:<input type="text" value="<%=est.getCelular()%>" class="form-control text-dark border" id="celular" name="celular" placeholder="escriba su celular"/></td>
                        <td>Correo electronico:<input type="text" value="<%=est.getCorreo()%>" class="form-control text-dark border" id="correo" name="correo" placeholder="escriba su email"/></td>
                    </tr>
                    <tr>
                        <td>Sexo:<select name="genero" id="genero" class="form-control text-dark border ">
                                <option value="<%=est.getGenero()%>"><%=est.getGenero()%></option>
                                <%if(est.getGenero().equalsIgnoreCase("Hombre")){%>
                                <option value="Mujer">Mujer</option>
                                <%}if(est.getGenero().equalsIgnoreCase("Mujer")){%>
                                <option value="Hombre">Hombre</option>
                                <%}%>
                            </select></td>
                        <td>Estado Civil:<select name="estadoCivil" id="estadoCivil" class="form-control text-dark border">
                                <option value="<%=est.getEstadoCivil()%>"><%=est.getEstadoCivil()%></option>
                                <%if(est.getEstadoCivil().equalsIgnoreCase("Soltero")){%>
                                <option value="Casado">Casado</option>
                                <%}if(est.getEstadoCivil().equalsIgnoreCase("Casado")){%>
                                <option value="Soltero">Soltero</option>
                                <%}%>
                            </select></td> 
                            <td>Numero Puerta:<input type="text" value="<%=est.getNumPuerta()%>" class="form-control text-dark border" id="numPuerta" name="numPuerta" placeholder="escriba su Numero Puerta"/></td>
                    </tr>
                    <tr>
                        <td>Calle:<input type="text" value="<%=est.getIdCalle()%>" class="form-control text-dark border" id="idCalle" name="idCalle" placeholder="escriba su calle"/></td>
                        <td>Zona:<input type="text" value="<%=est.getIdZona()%>" class="form-control text-dark border" id="idZona" name="idZona" placeholder="escriba su zona"/></td>
                        <td>Departamento:<select name="idDepartamento" id="idDepartamento" class="form-control text-dark border">
                                <option value="<%=a%>">Seleccione su departamento</option>
                                <option value="1">La Paz</option>
                                <option value="2">Santa Cruz</option>
                                <option value="3">Cochabamba</option>
                                <option value="4">Chuquisaca</option>
                                <option value="5">Potosi</option>
                                <option value="6">Oruro</option>
                                <option value="7">Tarija</option>
                                <option value="8">Beni</option>
                                <option value="9">Pando</option>
                                <option value="10">Otro</option>
                            </select></td> 
                    </tr>
                    <td>Ciudad:<select name="idCiudad" id="idCiudad" class="form-control text-dark border">
                            <option value="<%=a%>">Seleccione su Ciudad</option>
                            <option value="1">La Paz</option>
                            <option value="2">El Alto</option>
                            <option value="3">Santa Cruz</option>
                            <option value="4">Cochabamba</option>
                            <option value="5">Chuquisaca</option>
                            <option value="6">Potosi</option>
                            <option value="7">Oruro</option>
                            <option value="8">Tarija</option>
                            <option value="9">Beni</option>
                            <option value="10">Pando</option>
                            <option value="11">Otro</option>
                        </select></td> 
                    <td>Provincia:<select name="idProvincia" id="idProvincia" class="form-control text-dark border">
                            <option value="<%=a%>">Seleccione su Provincia</option>
                            <optgroup label="La Paz">
                                <option value="1">Abel Iturralde</option>
                                <option value="2">Pedro Domingo Murillo</option>
                                <option value="3">Pacajes</option>
                                <option value="4">Larecaja</option>
                                <option value="5">Inquisivi</option>
                                <option value="6">Sud Yungas</option>
                                <option value="7">Ingavi</option>
                                <option value="8">Muñecas</option>
                                <option value="9">Franz Tamayo</option>
                                <option value="10">Aroma</option>
                                <option value="11">Caranavi</option>
                                <option value="12">José Ramón Loayza</option>
                                <option value="13">Bautista Saavedra</option>
                                <option value="14">Eliodoro Camacho</option>
                                <option value="15">General José Manuel Pando</option>
                                <option value="16">Gualberto Villaroel</option>
                                <option value="17">Nor Yungas</option>
                                <option value="18">Los Andes</option>
                                <option value="19">Manco Kapac</option>
                                <option value="20">Omasuyos</option>
                            </optgroup>
                            <optgroup label="Cochabamba">
                                <option value="21">Cercado</option>
                                <option value="22">Quillacollo</option>
                                <option value="23">Chapare</option>
                                <option value="24">Tapacari</option>
                                <option value="25">Bolívar</option>
                                <option value="26">Arque</option>
                                <option value="27">Capinota</option>
                                <option value="28">Mizque</option>
                                <option value="29">Campero</option>
                                <option value="30">Ayopaya</option>
                                <option value="31">Carrasco</option>
                                <option value="32">Punata</option>
                                <option value="33">Araní</option>
                                <option value="34">Esteban Arze</option>
                                <option value="35">Germán Jordán </option>
                                <option value="36">Tiraque</option>
                            </optgroup>
                            <optgroup label="Santa Cruz">
                                <option value="37">Andrés Ibáñez</option>
                                <option value="38">Ángel Sandoval</option>
                                <option value="39">Chiquitos</option>
                                <option value="40">Florida</option>
                                <option value="41">Germán Busch</option>
                                <option value="42">Guarayos</option>
                                <option value="43">Ichilo</option>
                                <option value="44">José Miguel de Velasco</option>
                                <option value="45">Manuel María Caballero</option>
                                <option value="46">Ñuflo de Chávez</option>
                                <option value="47">Obispo Santisteban</option>
                                <option value="48">Sara</option>
                                <option value="49">Vallegrande</option>
                                <option value="50">Warnes</option>
                                <option value="51">Cordillera</option>
                            </optgroup>
                        </select></td>
                    <td>Nacionalidad:<select name="idNacionalidad" id="idNacionalidad" class="form-control text-dark border">
                            <option value="<%=a%>">Seleccione su Nacionalidad</option>
                            <option value="1">Argentina</option>
                            <option value="2">Bolivia</option>
                            <option value="3">Brasil</option>
                            <option value="4">Chile</option>
                            <option value="5">Colombia</option>
                            <option value="6">Venezuela</option>
                            <option value="7">Peru</option>
                            <option value="8">Paraguay</option>
                            <option value="9">Uruguay</option>
                            <option value="10">Otro</option>
                        </select></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="adicionarEstudiante" value="MODIFICAR" id="envio" class="btn bg-dark text-light btn-block badge-pill mt-4"/></td>
                    </tr>
                </table>
            </form>
            <% 
            
               try { 
               if(request.getParameter("adicionarEstudiante")!=null){      
                    if(request.getParameter("ci").equals("null")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE CADENA EN CI</div>
                           <%
                    }else if(request.getParameter("ci").matches("[0]*")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE VALOR 0 EN CI</div>
                            <% 
                    }else if(request.getParameter("expedido").equals("null")){
                        %>
                            <div class="alert alert-danger">SELECCIONE UN EXPEDIDO PORFAVOR!!</div>
                            <% 
                    }else if(request.getParameter("nombres").equals("")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE CADENA VACIA EN NOMBRES</div>
                            <%
                    }else if(request.getParameter("nombres").matches("\\d*")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE DIGITOS EN CAMPO NOMBRES</div>
                            <%  
                    }else if(request.getParameter("apellidoPaterno").equals("")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE CADENA VACIA EN APELLIDO PATERNO</div>
                            <% 
                    }else if(request.getParameter("apellidoPaterno").matches("\\d*")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE DIGITOS EN CAMPO APELLIDO PATERNO</div>
                            <% 
                    }else if(request.getParameter("apellidoMaterno").equals("")){
                        %>
                        <div class="alert alert-danger">ERROR NO PERMITE CADENA VACIA EN APELLIDO MATERNO</div>
                        <%  
                    }else if(request.getParameter("apellidoMaterno").matches("\\d*")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE DIGITOS EN CAMPO APELLIDO MATERNO</div>
                            <% 
                    }else if(request.getParameter("fechaNacimiento").equals("")){
                        %>
                        <div class="alert alert-danger">ERROR NO PERMITE CADENA VACIA EN FECHA</div>
                        <% 
                    }else if(request.getParameter("fechaNacimiento").matches("[0]*")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE VALOR 0 EN FECHA</div>
                            <%
                    }else if(request.getParameter("telefono") == null){
                        %>
                        <div class="alert alert-danger">ERROR NO PERMITE CADENA EN TELEFONO</div>
                        <% 
                    }else if(request.getParameter("telefono").matches("[0]*")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE VALOR 0 EN TELEFONO</div>
                            <% 
                    }else if(request.getParameter("celular") == null){
                        %>
                        <div class="alert alert-danger">ERROR NO PERMITE CADENA EN CELULAR</div>
                        <%  
                    }else if(request.getParameter("celular").matches("[0]*")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE VALOR 0 EN CELULAR</div>
                            <%
                    }else if(request.getParameter("correo").equals("")){
                        %>
                        <div class="alert alert-danger">ERROR NO PERMITE CADENA VACIA EN CAMPO CORREO</div>
                        <%  
                    }else if(request.getParameter("correo").matches("[0]*")){   
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE VALOR 0 EN CORREO</div>
                            <% 
                    }else if(request.getParameter("estadoCivil").equals("null")){
                        %>
                        <div class="alert alert-danger">SELECCIONE UNA OPCION EN ESTADO CIVIL PORFAVOR!! </div>
                        <% 
                    }else if(request.getParameter("genero").equals("null")){
                        %>
                        <div class="alert alert-danger">SELECCIONE UN OPCION EN CAMPO GENERO PORFAVOR!!</div>
                        <%  
                    }else if(request.getParameter("numPuerta") == null){
                        %>
                        <div class="alert alert-danger">ERROR NO PERMITE CADENA EN CAMPO NUMERO PUERTA</div>
                        <%
                    }else if(request.getParameter("numPuerta").matches("[0]*")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE VALOR 0 EN NUMERO PUERTA</div>
                            <%
                    }else if(request.getParameter("idCalle").equals("")){
                         %>
                        <div class="alert alert-danger">ERROR NO PERMITE CADENA VACIA EN CAMPO CALLE</div>
                        <% 
                    }else if(request.getParameter("idCalle").matches("\\d*")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE DIGITOS EN CALLE</div>
                            <% 
                    }else if(request.getParameter("idZona").equals("")){
                          %>
                        <div class="alert alert-danger">ERROR NO PERMITE CADENA VACIA EN CAMPO ZONA</div>
                        <% 
                    }else if(request.getParameter("idZona").matches("\\d*")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE DIGITOS EN CAMPO ZONA</div>
                            <%  
                    }else if(request.getParameter("idDepartamento").equals("null")){
                        %>
                        <div class="alert alert-danger">SELECCIONE UNA OPCION EN DEPARTAMENTO PORFAVOR!!</div>
                        <%
                    }else if(request.getParameter("idProvincia").equals("null")){
                        %>
                        <div class="alert alert-danger">SELECCIONE UNA OPCION EN PROVINCIA PORFAVOR!!</div>
                        <%  
                    }else if(request.getParameter("idCiudad").equals("null")){
                        %>
                        <div class="alert alert-danger">SELECCIONE UNA OPCION EN CIUDAD PORFAVOR!!</div>
                        <% 
                    }else if(request.getParameter("idNacionalidad").equals("null")){
                        %>
                        <div class="alert alert-danger">SELECCIONE UNA OPCION EN NACIONALIDAD PORFAVOR!!</div>
                        <%  
                    }else{
                        %>                 
                        <div id="exito" class="alert alert-success">REGISTRO EXITOSO</div> 
                        <%
                    }        
               }     
                    }catch (Exception e){
                        %>
                        <div class="alert alert-danger">DEBE VALIDAR CORRECTAMENTE LOS DATOS</div>
                        <%
                    }%>
        </div>
    </body>
</html>

