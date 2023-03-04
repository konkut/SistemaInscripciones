<%-- 
    Document   : index
    Created on : 03-jun-2021, 7:06:45
    Author     : luis
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Grado"%>
<%@page import="Controlador.CGrado"%>
<%@page import=" Controlador.CEstudiante"%>
<%@page import=" Modelo.Estudiante"%>
<%@page import=" java.util.regex.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="style/style_1.css" rel="stylesheet"></link>
        <title>Pagina Inscripcion Estudiante</title>
    </head>
    <body style="background-image: url(imagenes/fondo.jpg)">
        <%
        int idLogin = Integer.parseInt(request.getParameter("idLogin"));
        Exception a = null;
        String ci="",nombres="",apellidoPaterno="",apellidoMaterno="",fechaNacimiento="",telefono="",celular="",correo="",numPuerta="",idCalle="",idZona="";
        %>
        <div class="container">
            <form  class="form-group" method="get" action="InsEstudiante" >
                <table class="table table-striped">
                    <tr>
                        <td>Nª Cedula Identidad: <input type="text" value="<%if(request.getParameter("adicionarEstudiante")!=null){ci = request.getParameter("ci");}%><%=ci%>" class="form-control text-dark border" id="ci" name="ci" placeholder="escriba su CI"/></td>
                        <td>Expedido:<select name="expedido" id="expedido" class="form-control text-dark border">
                                <option value="<%=a%>">Seleccione su expedido</option>
                                <option value="LP" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("LP")){%>selected<%}}%>>LP</option>
                                <option value="SC" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("SC")){%>selected<%}}%>>SC</option>
                                <option value="CB" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("CB")){%>selected<%}}%>>CB</option>
                                <option value="CH" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("CH")){%>selected<%}}%>>CH</option>
                                <option value="PT" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("PT")){%>selected<%}}%>>PT</option>
                                <option value="OR" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("OR")){%>selected<%}}%>>OR</option>
                                <option value="TJ" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("TJ")){%>selected<%}}%>>TJ</option>
                                <option value="BE" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("BE")){%>selected<%}}%>>BE</option>
                                <option value="PD" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("PD")){%>selected<%}}%>>PD</option>
                                <option value="ot" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("expedido").equals("Otro")){%>selected<%}}%>>Otro</option>
                            </select></td>
                         
                        <td>Nombres:<input type="text" value="<%if(request.getParameter("adicionarEstudiante")!=null){nombres = request.getParameter("nombres");}%><%=nombres%>" class="form-control text-dark border" id="nombres" name="nombres" placeholder="escriba sus nombres"/></td>
                        
                    </tr>
                    <tr>
                        <td>Apellidos Paterno:<input type="text" value="<%if(request.getParameter("adicionarEstudiante")!=null){apellidoPaterno = request.getParameter("apellidoPaterno");}%><%=apellidoPaterno%>" class="form-control text-dark border" id="apellidoPaterno" name="apellidoPaterno" placeholder="escriba su Apellido paterno"/></td>
                        <td>Apellidos Materno:<input type="text" value="<%if(request.getParameter("adicionarEstudiante")!=null){apellidoMaterno = request.getParameter("apellidoMaterno");}%><%=apellidoMaterno%>" class="form-control text-dark border" id="apellidoMaterno" name="apellidoMaterno" placeholder="escriba su Apellido materno"/></td>
                        <td>Fecha de nacimiento:<input type="text" value="<%if(request.getParameter("adicionarEstudiante")!=null){fechaNacimiento = request.getParameter("fechaNacimiento");}%><%=fechaNacimiento%>" class="form-control text-dark border" id="fechaNacimiento" name="fechaNacimiento" placeholder="escriba su Fecha Nacimiento"></td>
                    </tr>
                    <tr>
                        <td>Telefono:<input type="text" value="<%if(request.getParameter("adicionarEstudiante")!=null){telefono = request.getParameter("telefono");}%><%=telefono%>" class="form-control text-dark border" id="telefono" name="telefono" placeholder="escriba su telefono"/></td>
                        <td>Celular:<input type="text" value="<%if(request.getParameter("adicionarEstudiante")!=null){celular = request.getParameter("celular");}%><%=celular%>" class="form-control text-dark border" id="celular" name="celular" placeholder="escriba su celular"/></td>
                        <td>Correo electronico:<input type="text" value="<%if(request.getParameter("adicionarEstudiante")!=null){correo = request.getParameter("correo");}%><%=correo%>" class="form-control text-dark border" id="correo" name="correo" placeholder="escriba su email"/></td>
                    </tr>
                    <tr>
                        <td>Sexo:<select name="genero" id="genero" class="form-control text-dark border ">
                                <option value="<%=a%>">Seleccione su genero</option>
                                <option value="Hombre" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("genero").equals("Hombre")){%>selected<%}}%>>Hombre</option>
                                <option value="Mujer" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("genero").equals("Mujer")){%>selected<%}}%>>Mujer</option>
                            </select></td>
                        <td>Estado Civil:<select name="estadoCivil" id="estadoCivil" class="form-control text-dark border">
                                <option value="<%=a%>">Seleccione su estado Civil</option>
                                <option value="Soltero" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("estadoCivil").equals("Soltero")){%>selected<%}}%>>Soltero</option>
                                <option value="Casado" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("estadoCivil").equals("Casado")){%>selected<%}}%>>Casado</option>
                            </select></td> 
                        <td>Numero Puerta:<input type="text" value="<%if(request.getParameter("adicionarEstudiante")!=null){numPuerta = request.getParameter("numPuerta");}%><%=numPuerta%>" class="form-control text-dark border" id="numPuerta" name="numPuerta" placeholder="escriba su Numero Puerta"/></td>
                    </tr>
                    <tr>
                        <td>Calle:<input type="text" value="<%if(request.getParameter("adicionarEstudiante")!=null){idCalle = request.getParameter("idCalle");}%><%=idCalle%>" class="form-control text-dark border" id="idCalle" name="idCalle" placeholder="escriba su calle"/></td>
                        <td>Zona:<input type="text" value="<%if(request.getParameter("adicionarEstudiante")!=null){idZona = request.getParameter("idZona");}%><%=idZona%>" class="form-control text-dark border" id="idZona" name="idZona" placeholder="escriba su zona"/></td>
                        <td>Provincia:<select name="idProvincia" id="idProvincia" class="form-control text-dark border">
                            <option value="<%=a%>">Seleccione su Provincia</option>
                            <optgroup label="La Paz">
                                <option value="1" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("1")){%>selected<%}}%>>Abel Iturralde</option>
                                <option value="2" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("2")){%>selected<%}}%>>Pedro Domingo Murillo</option>
                                <option value="3" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("3")){%>selected<%}}%>>Pacajes</option>
                                <option value="4" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("4")){%>selected<%}}%>>Larecaja</option>
                                <option value="5" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("5")){%>selected<%}}%>>Inquisivi</option>
                                <option value="6" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("6")){%>selected<%}}%>>Sud Yungas</option>
                                <option value="7" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("7")){%>selected<%}}%>>Ingavi</option>
                                <option value="8" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("8")){%>selected<%}}%>>Muñecas</option>
                                <option value="9" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("9")){%>selected<%}}%>>Franz Tamayo</option>
                                <option value="10" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("10")){%>selected<%}}%>>Aroma</option>
                                <option value="11" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("11")){%>selected<%}}%>>Caranavi</option>
                                <option value="12" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("12")){%>selected<%}}%>>José Ramón Loayza</option>
                                <option value="13" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("13")){%>selected<%}}%>>Bautista Saavedra</option>
                                <option value="14" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("14")){%>selected<%}}%>>Eliodoro Camacho</option>
                                <option value="15" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("15")){%>selected<%}}%>>General José Manuel Pando</option>
                                <option value="16" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("16")){%>selected<%}}%>>Gualberto Villaroel</option>
                                <option value="17" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("17")){%>selected<%}}%>>Nor Yungas</option>
                                <option value="18" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("18")){%>selected<%}}%>>Los Andes</option>
                                <option value="19" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("19")){%>selected<%}}%>>Manco Kapac</option>
                                <option value="20" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("20")){%>selected<%}}%>>Omasuyos</option>
                             </optgroup>
                            <optgroup label="Cochabamba">
                                <option value="21" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("21")){%>selected<%}}%>>Cercado</option>
                                <option value="22" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("22")){%>selected<%}}%>>Quillacollo</option>
                                <option value="23" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("23")){%>selected<%}}%>>Chapare</option>
                                <option value="24" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("24")){%>selected<%}}%>>Tapacari</option>
                                <option value="25" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("25")){%>selected<%}}%>>Bolívar</option>
                                <option value="26" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("26")){%>selected<%}}%>>Arque</option>
                                <option value="27" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("27")){%>selected<%}}%>>Capinota</option>
                                <option value="28" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("28")){%>selected<%}}%>>Mizque</option>
                                <option value="29" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("29")){%>selected<%}}%>>Campero</option>
                                <option value="30" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("30")){%>selected<%}}%>>Ayopaya</option>
                                <option value="31" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("31")){%>selected<%}}%>>Carrasco</option>
                                <option value="32" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("32")){%>selected<%}}%>>Punata</option>
                                <option value="33" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("33")){%>selected<%}}%>>Araní</option>
                                <option value="34" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("34")){%>selected<%}}%>>Esteban Arze</option>
                                <option value="35" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("35")){%>selected<%}}%>>Germán Jordán </option>
                                <option value="36" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("36")){%>selected<%}}%>>Tiraque</option>
                            </optgroup>
                            <optgroup label="Santa Cruz">
                                <option value="37" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("37")){%>selected<%}}%>>Andrés Ibáñez</option>
                                <option value="38" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("38")){%>selected<%}}%>>Ángel Sandoval</option>
                                <option value="39" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("39")){%>selected<%}}%>>Chiquitos</option>
                                <option value="40" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("40")){%>selected<%}}%>>Florida</option>
                                <option value="41" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("41")){%>selected<%}}%>>Germán Busch</option>
                                <option value="42" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("42")){%>selected<%}}%>>Guarayos</option>
                                <option value="43" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("43")){%>selected<%}}%>>Ichilo</option>
                                <option value="44" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("44")){%>selected<%}}%>>José Miguel de Velasco</option>
                                <option value="45" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("45")){%>selected<%}}%>>Manuel María Caballero</option>
                                <option value="46" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("46")){%>selected<%}}%>>Ñuflo de Chávez</option>
                                <option value="47" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("47")){%>selected<%}}%>>Obispo Santisteban</option>
                                <option value="48" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("48")){%>selected<%}}%>>Sara</option>
                                <option value="49" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("49")){%>selected<%}}%>>Vallegrande</option>
                                <option value="50" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("50")){%>selected<%}}%>>Warnes</option>
                                <option value="51" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idProvincia").equals("51")){%>selected<%}}%>>Cordillera</option>
                            </optgroup>
                        </select></td>
                    </tr>
                    <td>Ciudad:<select name="idCiudad" id="idCiudad" class="form-control text-dark border">
                            <option value="<%=a%>">Seleccione su Ciudad</option>
                            <option value="1" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("1")){%>selected<%}}%>>La Paz</option>
                            <option value="2" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("2")){%>selected<%}}%>>El Alto</option>
                            <option value="3" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("3")){%>selected<%}}%>>Santa Cruz</option>
                            <option value="4" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("4")){%>selected<%}}%>>Cochabamba</option>
                            <option value="5" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("5")){%>selected<%}}%>>Chuquisaca</option>
                            <option value="6" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("6")){%>selected<%}}%>>Potosi</option>
                            <option value="7" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("7")){%>selected<%}}%>>Oruro</option>
                            <option value="8" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("8")){%>selected<%}}%>>Tarija</option>
                            <option value="9" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("9")){%>selected<%}}%>>Beni</option>
                            <option value="10" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("10")){%>selected<%}}%>>Pando</option>
                            <option value="11" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idCiudad").equals("11")){%>selected<%}}%>>Otro</option>
                        </select></td> 
                        <td>Departamento:<select name="idDepartamento" id="idDepartamento" class="form-control text-dark border">
                                <option value="<%=a%>">Seleccione su departamento</option>
                                <option value="1" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("1")){%>selected<%}}%>>La Paz</option>
                                <option value="2" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("2")){%>selected<%}}%>>Santa Cruz</option>
                                <option value="3" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("3")){%>selected<%}}%>>Cochabamba</option>
                                <option value="4" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("4")){%>selected<%}}%>>Chuquisaca</option>
                                <option value="5" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("5")){%>selected<%}}%>>Potosi</option>
                                <option value="6" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("6")){%>selected<%}}%>>Oruro</option>
                                <option value="7" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("7")){%>selected<%}}%>>Tarija</option>
                                <option value="8" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("8")){%>selected<%}}%>>Beni</option>
                                <option value="9" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("9")){%>selected<%}}%>>Pando</option>
                                <option value="10" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idDepartamento").equals("10")){%>selected<%}}%>>Otro</option>
                            </select></td> 
                        <td>Nacionalidad:<select name="idNacionalidad" id="idNacionalidad" class="form-control text-dark border">
                            <option value="<%=a%>">Seleccione su Nacionalidad</option>
                            <option value="1" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("1")){%>selected<%}}%>>Argentina</option>
                            <option value="2" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("2")){%>selected<%}}%>>Bolivia</option>
                            <option value="3" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("3")){%>selected<%}}%>>Brasil</option>
                            <option value="4" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("4")){%>selected<%}}%>>Chile</option>
                            <option value="5" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("5")){%>selected<%}}%>>Colombia</option>
                            <option value="6" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("6")){%>selected<%}}%>>Venezuela</option>
                            <option value="7" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("7")){%>selected<%}}%>>Peru</option>
                            <option value="8" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("8")){%>selected<%}}%>>Paraguay</option>
                            <option value="9" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("9")){%>selected<%}}%>>Uruguay</option>
                            <option value="10" <%if(request.getParameter("adicionarEstudiante")!=null){if(request.getParameter("idNacionalidad").equals("10")){%>selected<%}}%>>Otro</option>
                        </select></td>
                    
                    </tr>
                    <tr>
                        <td><input type="hidden" name="idLogin" value="<%=idLogin%>" id="envio" class="btn bg-dark text-light btn-block badge-pill mt-4"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="adicionarEstudiante" value="GUARDAR" id="envio" class="btn bg-dark text-light btn-block badge-pill mt-4"/></td>
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

                    }else if(request.getParameter("ci").matches("[a-zA-Z.-]*")){
                        %>
                            <div class="alert alert-danger">ERROR NO PERMITE CADENA EN CI</div>
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

