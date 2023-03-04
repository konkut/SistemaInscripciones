<%-- 
    Document   : AdminEst
    Created on : 27-jun-2021, 14:25:17
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
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
        <link href="style/style_1.css" rel="stylesheet"></link>
        <title>Administrador</title>
    </head>
    <body style="background-image: url(imagenes/cielo.jpg)">
        <%/*
            HttpSession session1;
            session1 = request.getSession();
            try{
                String se = session1.getAttribute("vsec").toString();
                if(se.equalsIgnoreCase("1")){*/
        %>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
              <img id="escudo" class="navbar-brand" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ6oRlTbvLPtYVAd62ocjengkvclk8f1eHdicuikgr3sUpM70SWsWhhlkXS8A&s"></img>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>
              <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  <li class="nav-item">
                      <a class="nav-link" href="AdminEst.jsp">LISTADO ESTUDIANTES</a>
                  </li>
                  <li class="nav-item">
                      <a class="nav-link" href="inscripcionDoc.jsp">INSCRIPCION DOCENTE</a>
                  </li>
                </ul>
                <form class="d-flex">
                  <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                  <button class="btn btn-outline-success" type="submit">Search</button>
                </form>
              </div>
            </div>
          </nav>
        <div class="container">
            <h1 class="text-center text-dark">LISTADO DE ESTUDIANTES</h1>
            <%
                  CEstudiante cest = new CEstudiante();
                  List <Estudiante> lest = cest.listarEst();
                  Iterator <Estudiante> iter = lest.iterator();
                  Estudiante est = null;
                  while(iter.hasNext())
                  {
                      est = iter.next();
                   %>
                   <div class="btn-group mt-2">
                    <div class="btn btn-dark w-75 text-white"><%=est.getNombres()%>&nbsp;<%=est.getApellidoPaterno()%><a href="InsEstudiante?adicionarEstudiante=LISTA&ci=<%=est.getCi()%>"><br>ver mas</a></div>
                    <!--<a class ="btn btn-success w-75" href="MateriasEst.jsp?ci=<%=est.getCi()%>">ASIGNAR MATERIAS</a>-->
                    <a class ="btn btn-success w-75" href="InsEstudiante?adicionarEstudiante=MODIFICA&ci=<%=est.getCi()%>">modifica Estudiante </a>
                    <a class ="btn btn-warning w-75" href="InsEstudiante?adicionarEstudiante=IMPRIMA&ci=<%=est.getCi()%>">Imprime Estudiante</a>
                    <a class ="btn btn-danger w-75" href="InsEstudiante?adicionarEstudiante=ELIMINA&ci=<%=est.getCi()%>">Elimina Estudiante</a>
                   </div><br>
                    
                    <%     
                  }
                 %>
        </div>
         <!--       
        <%
         //    }
         //   }catch(NullPointerException ex){
        %>
        <meta http-equiv="refresh" content="2; url = Registrarse.jsp">
        <%
          //  }
        %>
        -->
    </body>
</html>
