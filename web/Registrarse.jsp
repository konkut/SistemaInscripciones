<%-- 
    Document   : Registrarse
    Created on : 04-jul-2021, 6:42:25
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="viewport" content="width=device-width, user-scalable=no">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link href="style/style_1.css" rel="stylesheet"></link>
        <title>Registro</title>
</head>
<body style="background-image: url(imagenes/cielo.jpg)">
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <img id="escudo" class="navbar-brand" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6oRlTbvLPtYVAd62ocjengkvclk8f1eHdicuikgr3sUpM70SWsWhhlkXS8A&s"></img>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item active">
            <a class="nav-link disabled dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                REGISTRO
            </a>
            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="#">INSCRIPCION ESTUDIANTE</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">INSCRIPCION DOCENTE</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">LISTADO ESTUDIANTES</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">AGREGAR MATERIA</a>
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#">MAS</a>
            </div>

        </li>
        <li class="nav-item">
            <a class="nav-link" href="Registrarse.jsp">REGISTRARSE</a>
        </li>
        <li class="nav-item">
            <a class="nav-link" href="IniciarSesion.jsp">INICIAR SESION</a>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
        <%
            String user="",pass="";
        %>
	<div class="row" style="margin-top: 130px;">
            <div class="col-lg-4 col-md-4 col-sm-3 col-2"></div>
            <div class="col-lg-4 col-md-4 col-sm-6 col-8">
                <h1 class="badge bg-danger" >Registrarse</h1>
                <form class="form-group" method="get" action="InsSigIn">
                    <input type="text" name="usuario" value="<%if(request.getParameter("SignIn")!=null){user = request.getParameter("usuario");}%><%=user%>" class="form-control mb-3" placeholder="Ingresa un nombre de usuario"/>
                    <input type="text" name="contrasena" value="<%if(request.getParameter("SignIn")!=null){pass = request.getParameter("contrasena");}%><%=pass%>" class="form-control mb-3" placeholder="Introduce una contrase??a"/>
                    <input class="btn btn-success btn-block" type="submit" name="SignIn" value="REGISTRARSE"/>
                    <input class="btn btn-danger btn-block" type="submit" name="SignIn" value="INICIARSESION"/>
                    <%
                    try { 
                       if(request.getParameter("SignIn")!=null){      
                            if(request.getParameter("usuario").trim().equals("")){
                                %>
                                    <div class="alert alert-danger mt-2">INGRESE UN NOMBRE DE USUARIO PORFAVOR!!</div>
                                   <%
                            }else if(request.getParameter("contrasena").trim().equals("")){
                                %>
                                    <div class="alert alert-danger mt-2">INGRESA UN CONTRASE??A PORFAVOR!!</div>
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
                </form>  
            </div>
            <div class="col-lg-4 col-md-4 col-sm-3 col-2"></div>
     </div>
</body>
</html>
