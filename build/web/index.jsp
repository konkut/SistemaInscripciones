<%-- 
    Document   : index
    Created on : 06-may-2021, 16:35:34
    Author     : luis
--%>

<%@page import="Controlador.CEstudiante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link href="style/style_1.css" rel="stylesheet"></link>
        <title>Inicio</title>
    </head>
    <body style="background-image: url(imagenes/cielo.jpg)">
        <%
            int id = Integer.parseInt(request.getAttribute("id").toString());
        %>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <img id="escudo" class="navbar-brand" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6oRlTbvLPtYVAd62ocjengkvclk8f1eHdicuikgr3sUpM70SWsWhhlkXS8A&s"></img>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            REGISTRO
                        </a>
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <%
                                if(Boolean.parseBoolean(request.getAttribute("idLogin").toString())==true){
                                %>
                                <a class="dropdown-item" href="inscripcion.jsp?idLogin=<%=id%>">INSCRIPCION</a>
                                <div class="dropdown-divider"></div>
                                <%
                                }
                            %>
                            <%
                                if(Boolean.parseBoolean(request.getAttribute("idLogin").toString())==false){
                                %>
                                <a class ="dropdown-item" href="MateriasEst.jsp?id1=<%=id%>">ASIGNAR MATERIAS</a>
                                <div class="dropdown-divider"></div>
                                <%
                                }
                            %>
                            <a class="dropdown-item" href="#">MAS</a>
                        </div>
                        
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Link</a>
                    </li>
                    <li class="nav-item dropdown">
                        
                    </li>
                    <li class="nav-item">
                        <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>
        <%
            if(Boolean.parseBoolean(request.getAttribute("idLogin").toString())==true){
                int idEstudiante = Integer.parseInt(request.getAttribute("idEstudiante").toString());
                CEstudiante cest = new CEstudiante();
                String name = cest.ObtenerNombre(idEstudiante);
                String data = cest.Obtenerdata(id);
                String materias = cest.ObtenerMaterias(idEstudiante);
                int ci = cest.ObtenerCi(idEstudiante);
            %>
            <h3 class="btn text-dark disabled d-block bg-light">BIENVENIDO <%=name%>!!!!<h3>
            <h3 class="btn text-dark disabled d-block bg-light"><%=data%>!!!!<h3>
            <h3 class="btn text-dark disabled d-block bg-light">MATERIAS INSCRITAS: <%=materias%>!!!!<h3>
            <a class ="ps-5 btn btn-block btn-danger" href="InsEstudiante?adicionarEstudiante=IMPRIMA&ci=<%=ci%>">Descargar boleta de inscripcion </a>   
            <div class="dropdown-divider"></div>
            <%
            }
        %>
        <script src="script_1.js"></script>
    </body>
</html>
