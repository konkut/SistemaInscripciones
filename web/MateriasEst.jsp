<%-- 
    Document   : MateriasEst
    Created on : 29-jun-2021, 11:41:07
    Author     : luis
--%>

<%@page import="Controlador.CInscrito"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="Controlador.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link href="style.style.css" rel="stylesheet"></link>
        <title>JSP Page</title>
    </head>
    <body style="background-image: url(imagenes/paisa.jpg)">
        <%
            Exception a = null;
        %>
        <div class="container">
                    <%
                     if(request.getParameter("Enviar")==null){
                         int id1 = Integer.parseInt(request.getParameter("id1"));
                    %>  
                    <div><%=id1%></div>
                    <form method="get" action="InsParalelo">
                        <td>Semestre y Paralelo:<select name="idParalelo" id="idParalelo" class="form-control text-dark border">
                                <option value="<%=a%>">Seleccione su paralelo</option>
                                <optgroup label="1 SEMESTRE">
                                        <option  value="1">PARALELO A</option>
                                        <option value="2">PARALELO B</option>
                                        <option value="3">PARALELO C</option>
                                </optgroup>
                                <optgroup label="2 SEMESTRE">
                                        <option value="4">PARALELO A</option>
                                        <option  value="5">PARALELO B</option>
                                        <option  value="6">PARALELO C</option>
                                </optgroup>
                                <optgroup label="3 SEMESTRE">
                                        <option  value="7">PARALELO A</option>
                                        <option  value="8">PARALELO B</option>
                                        <option  value="9">PARALELO C</option>
                                </optgroup>
                                <optgroup label="4 SEMESTRE">
                                        <option value="10">PARALELO A</option>
                                        <option value="11">PARALELO B</option>
                                        <option value="12">PARALELO C</option>
                                </optgroup>
                                <optgroup label="5 SEMESTRE">
                                        <option value="13">PARALELO A</option>
                                        <option value="14">PARALELO B</option>
                                        <option value="15">PARALELO C</option>
                                </optgroup>
                                <optgroup label="6 SEMESTRE">
                                        <option value="16">PARALELO A</option>
                                        <option value="17">PARALELO B</option>
                                        <option value="18">PARALELO C</option>
                                </optgroup>
                                <optgroup label="7 SEMESTRE">
                                        <option value="19">PARALELO B</option>
                                        <option value="20">PARALELO C</option>
                                </optgroup>
                                <optgroup label="8 SEMESTRE">
                                        <option value="21">PARALELO B</option>
                                        <option value="22">PARALELO C</option>
                                </optgroup>
                                <optgroup label="9 SEMESTRE">
                                        <option value="23">PARALELO B</option>
                                        <option value="24">PARALELO C</option>
                                </optgroup>
                                <optgroup label="10 SEMESTRE">
                                        <option value="25">PARALELO B</option>
                                        <option value="26">PARALELO C</option>
                                </optgroup>
                            </select>
                        </td>
                        <td><input type="submit" name="Enviar" value="Confirmar" class="btn bg-dark text-light badge-pill mt-4"/></td>
                        <tr>
                        <td><input type="hidden" name="idEst" value="<%=id1%>" id="envio" class="btn bg-dark text-light btn-block badge-pill mt-4"/></td>
                        </tr> 
                        <form>
                        </tr> 
                        <%
                        }
                      if(request.getParameter("Enviar")!=null){ 
                         %>
                         <form  class="form-group" method="get" action="InsInscrito" >
                            <table class="table table-striped">
                                <tr>
                        <%
                             int id = Integer.parseInt(request.getAttribute("id").toString());
                             int paralelo = Integer.parseInt(request.getParameter("idParalelo"));
                             CInscrito cins = new CInscrito();
                             String nombres = cins.ObtenerNombre(paralelo);   
                        %>
                        <td>Semestre y Paralelo:<select name="idParalelo" id="idParalelo" class="form-control text-dark border">
                                <option value="<%=paralelo%>"><%=nombres%></option>
                        </td>
                        </tr>
                        <tr>
                        <td>Materia:<select name="idMateria" id="idMateria" class="form-control text-dark border">
                                <option value="<%=a%>">Seleccione su materia</option>
                                <%
                                    if (request.getParameter("idParalelo").equals("1") ||request.getParameter("idParalelo").equals("2")||request.getParameter("idParalelo").equals("3")){
                                        %>
                                        <optgroup label="1 SEMESTRE">
                                            <option value="1">INTRODUCCIÓN A LA PROGRAMACIÓN</option>
                                            <option value="2">QUÍMICA GENERAL</option>
                                            <option value="3">CALCULO I</option>
                                            <option value="4">ÁLGEBRA I</option>
                                            <option value="5">FÍSICA I</option>
                                            <option value="6">HISTORIA Y CULTURA ANDINA</option>
                                        </optgroup>
                                        <%
                                      }
                                    if (request.getParameter("idParalelo").equals("4") ||request.getParameter("idParalelo").equals("5")||request.getParameter("idParalelo").equals("6")){
                                        %>
                                        <optgroup label="2 SEMESTRE">
                                            <option value="7">PROGRAMACIÓN I</option>
                                            <option value="8">SISTEMAS CONTABLES</option>
                                            <option value="9">CALCULO II</option>
                                            <option value="10">ÁLGEBRA II</option>
                                            <option value="11">FÍSICA II</option>
                                            <option value="12">INGLES TÉCNICO I</option>
                                        </optgroup>
                                        <%
                                      }
                                    if (request.getParameter("idParalelo").equals("7") ||request.getParameter("idParalelo").equals("8")||request.getParameter("idParalelo").equals("9")){
                                        %>
                                        <optgroup label="3 SEMESTRE">
                                            <option value="13">PROGRAMACIÓN II</option>
                                            <option value="14">ESTRUCTURA DE DATOS</option>
                                            <option value="15">CÁLCULO III</option>
                                            <option value="16">ESTADÍSTICA I</option>
                                            <option value="17">FÍSICA III</option>
                                            <option value="18">INGLÉS TÉCNICO II</option>
                                        </optgroup>
                                        <%
                                      }
                                    if (request.getParameter("idParalelo").equals("10") ||request.getParameter("idParalelo").equals("11")||request.getParameter("idParalelo").equals("12")){
                                        %>
                                         <optgroup label="4 SEMESTRE">
                                            <option value="19">BASE DE DATOS I</option>
                                            <option value="20">SISTEMAS OPERATIVOS</option>
                                            <option value="21">SISTEMAS ADMINISTRATIVOS</option>
                                            <option value="22">ANÁLISIS NUMÉRICO</option>
                                            <option value="23">ESTADISTICA II</option>
                                            <option value="24">ELECTRONICA BASICA</option>
                                        </optgroup>
                                        <%
                                      }
                                     if (request.getParameter("idParalelo").equals("13") ||request.getParameter("idParalelo").equals("14")||request.getParameter("idParalelo").equals("15")){
                                        %>
                                         <optgroup label="5 SEMESTRE">
                                            <option value="25">ANALISIS Y DISEÑO</option>
                                            <option value="26">SISTEMAS DIGITALES</option>
                                            <option value="27">ARQUITECTURA DE COMPUTADORAS</option>
                                            <option value="28">BASE DE DATOS II</option>
                                            <option value="29">METODOLOGIA DE INVESTIGACION</option>
                                            <option value="30">ORGANIZACION Y METODOS</option>
                                            <option value="31">INVESTIGACION OPERATIVA</option>
                                        </optgroup>
                                        <%
                                      }
                                %>   
                            </select></td>
                        </tr>
                    <tr>
                        <td><input type="hidden" name="idEst" value="<%=id%>" id="envio" class="btn bg-dark text-light btn-block badge-pill mt-4"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="registro" value="ADICIONAR Y SALIR" id="envio" class="btn bg-dark text-light btn-block badge-pill mt-4"/></td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="registro" value="ADICIONAR Y ELEGIR OTRA MATERIA" id="envio" class="btn bg-dark text-light btn-block badge-pill mt-4"/></td>
                    </tr>
                    <%
                       } 
                    %>
                </table>
            </form>
                <%    
               try { 
               if(request.getParameter("registro")!=null){      
                    if(request.getParameter("idParalelo").equals("null")){
                        %>
                            <div class="alert alert-danger">SELECCIONE UN PARALELO PORFAVOR!!</div>
                           <%
                    }else if(request.getParameter("idMateria").equals("null")){
                        %>
                            <div class="alert alert-danger">ERROR NO SELECCIONO UNA MATERIA!!</div>
                            <div class="alert alert-danger">VOLVER A INGRESAR SUS DATOS</div>
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
                     <meta http-equiv="refresh" content="2; url=MateriasEst.jsp">
                    <%
                }  %>
         </div>
    </body>
</html>
