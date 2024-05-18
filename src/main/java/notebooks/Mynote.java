package notebooks;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Mynote extends HttpServlet  {

	@Override 
	protected void service(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out = response.getWriter();
	out.println("<b>HELLO notebook</b>");
	 
	 }
	@Override
    public void init(ServletConfig config) throws ServletException {
	
	 }
 
}
