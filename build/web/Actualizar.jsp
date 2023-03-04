<%-- 
    Document   : ImprimirEst
    Created on : 29-jun-2021, 9:21:21
    Author     : luis
--%>

<%@page import="Modelo.Estudiante"%>
<%@page import="Controlador.CEstudiante"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int id1 = Integer.parseInt(request.getAttribute("id1").toString());
        %>
        <meta http-equiv="refresh" content="1; url=MateriasEst.jsp?id1=<%=id1%>">
    </body>
</html>
