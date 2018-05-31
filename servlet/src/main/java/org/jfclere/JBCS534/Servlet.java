package org.jfclere.JBCS534;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Test servlet for mod_cache", urlPatterns = { "/" })
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = "mod_cache test servlet";
		response.setHeader("ETag","W/\"5581-1509871979000\"");
		response.setHeader("Expires", "Wed, 21 Oct 2018 07:28:00 GMT");
		Date date = new Date();
		response.setHeader("TraceDate", date.toString());

		PrintWriter out = response.getWriter();
		out.println("<title>" + title + "</title>");
		out.println("</head>");
		out.println("<body>");

		out.println("<h3>" + title + "</h3>");

       		out.println("</body>");
        	out.println("</html>");
	}

	/**
  	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
         */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

