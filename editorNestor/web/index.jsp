<%-- 
    Document   : index
    Created on : Jun 8, 2014, 8:27:25 PM
    Author     : Chema
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <link rel="icon" type="image/jpg" href="favicon.jpg" />
        <title>EDITOR DE TEXTO ONLINE</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body bgcolor="#eee">
        <br><br><br>
    <center> 
        <div id="contenedor">
            <div id="cabecera">
                 <img src="descarga.jpg" width="30" height="30"/>&nbsp;<strong>Editor de Texto chema.txt</strong>
            </div>
            <div id="menu">
                <a href="index.jsp">Actualizar</a>
            </div>
            <div id="editor">
            USUARIOS REGISTRADOS
            <BR>**********************************************<br><br>
            <%@page import="java.sql.*" %>
<%

Class.forName("com.mysql.jdbc.Driver");
Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/facebook", "root", "");

Statement Estamento = conexion.createStatement();
ResultSet rs = Estamento.executeQuery("select id, usuario, pwd from usuarios");

out.println("<table border=0>");
out.println("<tr><th>id</th><th>usuario</th></tr>");
while (rs.next()) {
out.println("<tr>");       
out.println("<td>");           
out.println(rs.getInt("id"));
out.println("</td><td>");
out.println(rs.getString("usuario"));
out.println("</td><td>");
//out.println(rs.getString("pwd"));
out.println("</td>");
out.println("</tr>");
}
out.println("</table>");

rs.close();
Estamento.close();
conexion.close();

%>
***********************************************<br>
FOLIOS REGISTRADOS

<%

Class.forName("com.mysql.jdbc.Driver");
Connection  conexion2 = DriverManager.getConnection("jdbc:mysql://localhost/facebook", "root", "");

Statement Estamento2 = conexion2.createStatement();
ResultSet rs2 = Estamento2.executeQuery("select folio from folios");
out.println("<table border=0>");
out.println("<tr><th>folios</th></tr><tr>");
while (rs2.next()) {
out.println("<tr>");       
out.println("<td>");
out.println(rs2.getString("folio"));
out.println("</td><td>");
//out.println(rs.getString("pwd"));
out.println("</td>");
out.println("</tr>");
}
out.println("</table>");

out.println("</tr></table>");

rs2.close();
Estamento2.close();
conexion2.close();

%>
<BR>************************************************<BR>
            </div>
        </div>
    </center>
    </body>
</html>
