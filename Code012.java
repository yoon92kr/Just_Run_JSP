package JustRunJSP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Code012")
public class Code012 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String ctxMesg = "context에 바인딩";
		String sesMesg = "session에 바인딩";
		String reqMesg = "request에 바인딩";
		
		ServletContext ctx = getServletContext();
		// 어플리케이션 전체에 대해 접근할 수 있는 Context 객체 생성
		
		HttpSession session = request.getSession();
		// 웹 클라이언트의 브라우저에서만 접근할 수 잇는 Session 객체 생성
		
		ctx.setAttribute("context", ctxMesg);
		session.setAttribute("session", sesMesg);
		request.setAttribute("request", reqMesg);
		
		out.print("<html><body>바인딩을 시작합니다</body></html>");
			
		

		

	}

}
