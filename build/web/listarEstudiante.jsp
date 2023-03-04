<%-- 
    Document   : listarEstudiante
    Created on : 27-jun-2021, 13:02:05
    Author     : luis
--%>
<%@page import="Controlador.CEstudiante"%>
<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Estudiante"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="style/iniciarSesion.css">
        <title>JSP Page</title>
    </head>
    <body style="background-color: black">
        <%
            int ci = Integer.parseInt(request.getAttribute("ci").toString());
        %>
        <div class="row" style="margin-top: 25px;">
        <div class="col-lg-2 col-md-4 col-sm-12 col-12 bg-light">
            <a class ="ps-5 btn btn-block btn-danger" href="InsEstudiante?adicionarEstudiante=IMPRIMA&ci=<%=ci%>">Descargar boleta de inscripcion </a>
            <img class="rounded img-fluid" id="estilo" src="imagenes/boletaimage.jpg" alt="inscripcion-2021-upea-ingenieria" title="descargan boleta inscripcion"/>
        </div>
        <div id="content" class="container-fluid col-lg-10 col-md-8 col-sm-12 col-12">
            <video class="" autoplay muted loop>
                 <source src="imagenes/video.mp4" type="video/mp4"/>
            </video>
            <div class="container-fluid" id="fijo">
                <h1 id="titulo" class="pt-5 text-center text-danger">BIENVENIDO A LA PAGINA DE LA INSTITUCION ....</h1>
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-12 col-12 ">
                        <img id="imagen" src="imagenes/user.png" alt="user-2021" title="usuario"/>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-12 col-12 ">
                        <%
                            CEstudiante cest = new CEstudiante();
                            List <Estudiante> lest = cest.listarEst();
                            Iterator <Estudiante> iter = lest.iterator();
                            Estudiante est = null;
                            while(iter.hasNext())
                            {
                                est = iter.next();
                                if(ci == est.getCi()){
                                    %>
                                    <b class="text-center text-dark">CI:&nbsp;&nbsp;</b><i><%=est.getCi()%></i><br>
                                    <b class="text-center text-dark">NOMBRES:&nbsp;&nbsp;</b><i><%=est.getNombres()%></i><br>
                                    <b class="text-center text-dark">APELLIDO PATERNO:&nbsp;&nbsp;</b><i><%=est.getApellidoPaterno()%></i><br>
                                    <b class="text-center text-dark">APELLIDO MATERNO:&nbsp;&nbsp;</b><i><%=est.getApellidoMaterno()%></i><br>
                                    <b class="text-center text-dark">CELULAR:&nbsp;&nbsp;</b><i><%=est.getCelular()%></i><br>
                                    <b class="text-center text-dark">CORREO:&nbsp;&nbsp;</b><i><%=est.getCorreo()%></i><br>
                                    <b class="text-center text-dark">GENERO:&nbsp;&nbsp;</b><i><%=est.getGenero()%></i><br>
                                    <b class="text-center text-dark">FECHA NACIMIENTO:&nbsp;&nbsp;</b><i><%=est.getFechaNacimiento()%></i><br>
                                    <b class="text-center text-dark">ESTADO CIVIL:&nbsp;&nbsp;</b><i><%=est.getEstadoCivil()%></i><br>
                                    <b class="text-center text-dark">CALLE:&nbsp;&nbsp;</b><i><%=est.getIdCalle()%></i><br>
                                    <b class="text-center text-dark">ZONA:&nbsp;&nbsp;</b><i><%=est.getIdZona()%></i><br>
                                    <% 
                               }
                            }
                           %>
                    </div>
                     <a class ="ml-5 mr-5 btn btn-block btn-dark" href="InsEstudiante?adicionarEstudiante=MODIFICA&ci=<%=ci%>">EDITAR</a>
                     
                </div>
            </div>
    </div> 
    </body>
</html>
