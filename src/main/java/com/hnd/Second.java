package com.hnd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends  HttpServlet {
	private ServletConfig config;
	public void init(ServletConfig config){
        this.config=config;
    }
	
public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
{
response.setContentType("text/html");
PrintWriter out = response.getWriter();
//Object name = request.getAttribute("name");
ServletContext context= getServletContext();
Object name = context.getAttribute("name");
String username = config.getInitParameter("username");
String password = config.getInitParameter("password");

out.println("<html><head><title>request.setAttribute</title></head><body>");
out.println("<h2>request.setAttribute() Example</h2>");
out.println("Attribute Value : " +name);
out.println(username +"  "+password);
out.println("</body></html>");
}


public ServletConfig getServletConfig(){
    return config;
}

public String getServletInfo(){
    return this.getClass().getName();
}
}
