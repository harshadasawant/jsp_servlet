package com.hnd;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class First extends  HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
	ServletContext context= getServletContext();
	context.setAttribute("name", "daksh");
response.setContentType("text/html");
PrintWriter out = response.getWriter();
//request.setAttribute("name","Harshada");
out.println("<html><head><title>request.setAttribute</title></head><body>");
out.println("<h2>request.setAttribute() Example</h2>");
out.println("</body></html>");
//RequestDispatcher rd= context.getRequestDispatcher("/second");
//rd.forward(request, response);
}

}
