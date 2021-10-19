package JustRunJSP;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "서블릿 이름",
urlPatterns = {"/urlMapping1", "/urlMapping2"},
initParams = {@WebInitParam(name = "test1", value = "test1 value"), @WebInitParam(name = "test2", value = "test2 value")}
		)
public class Code009 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String test1 = getInitParameter("test1");
		String test2 = getInitParameter("test2");
		
		out.print("<html><body>");
		out.print("test1 파라미터의 value : "+test1);
		out.print("test2 파라미터의 value : "+test2);
		out.print("</body></html>");
		

	}

}
