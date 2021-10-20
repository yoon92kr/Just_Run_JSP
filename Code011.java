package JustRunJSP;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Code011")
public class Code011 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession();
		// 파라미터 타입(디폴트 true) true : 세션객체가 존재하면 반환, 없으면 생성 / false : 세션객체가 존재하면 반환, 없으면 null
		out.println("<html><body>");
		out.println("세션 아이디 : "+session.getId()+"<br>");
		out.println("최초 세션 생성 시각 : "+session.getCreationTime()+"<br>");
		out.println("최근 세션 접근 시각 : "+session.getLastAccessedTime()+"<br>");
		out.println("세션 유효 시간 : "+session.getMaxInactiveInterval()+"<br>");

		if(session.isNew()) {
			out.print("새 세션이 만들어졌습니다");
		}
		out.println("</body></html>");
			
		

		

	}

}
