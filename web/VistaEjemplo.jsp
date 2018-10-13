<%@page import="java.util.*" %>
<%@page import="co.edu.udea.analisis.modelo.DTO.Persona" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prueba de conexion</title>
    </head>
    <body>
        <form name="formPersona" method="POST" action="PersonaControlador">
            Id: <input type="text" name="txtId"><br>
            Nombres: <input type="text" name="txtNombres"><br>
            Apellidos: <input type="text" name="txtApellidos"><br>
            Edad: <input type="text" name="txtEdad"><br>
            <input type="submit" name="btnIngresar" value="Ingresar">  
        <form/>
    </body>
</html>
