<%-- 
    Document   : RespuestaEjemplo
    Created on : 12-oct-2018, 0:20:12
    Author     : Andres
--%>
<%
    String dato = (String) request.getSession().getAttribute("RespuestaEjemplo");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>El mensaje de respuesta es: <%=dato%> </h1>
    </body>
</html>
