// Program to request server
// information viz Request Method, URL, Protocol
// and remote address.
/*
systemctl start tomcat9
javac -classpath "/usr/share/tomcat9/lib/servlet-api.jar" ServerInfo.java
sudo cp ServerInfo.class /usr/share/tomcat9-examples/examples/WEB-INF/classes
cd /usr/share/tomcat9-examples/examples/WEB-INF/
sudo gedit web.xml
servelet
servlet-mapping
http://localhost:8080/examples/servlets/servlet/ServerInfo
*/

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class ServerInfo extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<html><head>");
        out.println("<title>Server Information</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1 align=center> SERVER INFORMATTION");
        out.println("<hr><br><center><table border=5><tr>");
        out.println("<td><b>Request Method</b></td>");
        out.println("<td>");
        out.println(request.getMethod());
        out.println("</td></tr>");
        out.println("<tr>");
        out.println("<td><b> URL</b></td>");
        out.println("<td>");
        out.println(request.getRequestURL());
        out.println("</td></tr>");
        out.println("<tr>");
        out.println("<td><b>Protocol </b></td>");
        out.println("<td>");
        out.println(request.getProtocol());
        out.println("</td></tr>");
        out.println("<tr>");
        out.println("<td><b>Remote Address<b></td>");
        out.println("<td>");
        out.println(request.getRemoteAddr());
        out.println("</td></tr></table>");
        out.println("<br><hr>");
        out.println("</body></html>");
    }
}
