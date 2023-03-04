<%-- 
    Document   : Actualizar2
    Created on : 04-jul-2021, 17:15:35
    Author     : luis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int idLogin = Integer.parseInt(request.getAttribute("idLogin").toString());
        %>
        <meta http-equiv="refresh" content="1; url=MateriasEst.jsp?id=<%=idLogin%>">
    </body>
</html>
