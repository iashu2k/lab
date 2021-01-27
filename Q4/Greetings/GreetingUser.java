// Program to accept username, address
// and display them in a web page by
// passing parameters.
//use classpath "/opt/tomcat/lib/servlet-api.jar/" release 8, use sudo if not superuser

/*
systemctl start tomcat9
javac -classpath "/usr/share/tomcat9/lib/servlet-api.jar" GreetingUser.java
sudo cp GreetingUser.class /usr/share/tomcat9-examples/examples/WEB-INF/classes
sudo cp GreetingUser.html /var/www/html
cd /usr/share/tomcat9-examples/examples/WEB-INF/
sudo gedit web.xml
servelet
servlet-mapping
http://localhost:8080/examples/servlets/servlet/GreetingUser
*/

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class GreetingUser extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name, addr;
        response.setContentType("text/html");
        name = request.getParameter("uname");
        addr = request.getParameter("addr");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Welcome: " + name + " </h1><hr>Address: " + addr + "</body></html>");
        out.close();
    }
}
