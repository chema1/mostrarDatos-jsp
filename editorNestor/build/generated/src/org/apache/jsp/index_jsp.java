package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"estilo.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link rel=\"icon\" type=\"image/jpg\" href=\"favicon.jpg\" />\n");
      out.write("        <title>EDITOR DE TEXTO ONLINE</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"#eee\">\n");
      out.write("        <br><br><br>\n");
      out.write("    <center> \n");
      out.write("        <div id=\"contenedor\">\n");
      out.write("            <div id=\"cabecera\">\n");
      out.write("                 <img src=\"descarga.jpg\" width=\"30\" height=\"30\"/>&nbsp;<strong>Editor de Texto chema.txt</strong>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"menu\">\n");
      out.write("                <a href=\"index.jsp\">Actualizar</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"editor\">\n");
      out.write("            USUARIOS REGISTRADOS\n");
      out.write("            <BR>**********************************************<br><br>\n");
      out.write("            \n");


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


      out.write("\n");
      out.write("***********************************************<br>\n");
      out.write("FOLIOS REGISTRADOS\n");
      out.write("\n");


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


      out.write("\n");
      out.write("<BR>************************************************<BR>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
