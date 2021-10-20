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
		
		String ctxMesg = "context�� ���ε�";
		String sesMesg = "session�� ���ε�";
		String reqMesg = "request�� ���ε�";
		
		ServletContext ctx = getServletContext();
		// ���ø����̼� ��ü�� ���� ������ �� �ִ� Context ��ü ����
		
		HttpSession session = request.getSession();
		// �� Ŭ���̾�Ʈ�� ������������ ������ �� �մ� Session ��ü ����
		
		ctx.setAttribute("context", ctxMesg);
		session.setAttribute("session", sesMesg);
		request.setAttribute("request", reqMesg);
		
		out.print("<html><body>���ε��� �����մϴ�</body></html>");
			
		

		

	}

}
