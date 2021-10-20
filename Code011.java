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
		// �Ķ���� Ÿ��(����Ʈ true) true : ���ǰ�ü�� �����ϸ� ��ȯ, ������ ���� / false : ���ǰ�ü�� �����ϸ� ��ȯ, ������ null
		out.println("<html><body>");
		out.println("���� ���̵� : "+session.getId()+"<br>");
		out.println("���� ���� ���� �ð� : "+session.getCreationTime()+"<br>");
		out.println("�ֱ� ���� ���� �ð� : "+session.getLastAccessedTime()+"<br>");
		out.println("���� ��ȿ �ð� : "+session.getMaxInactiveInterval()+"<br>");

		if(session.isNew()) {
			out.print("�� ������ ����������ϴ�");
		}
		out.println("</body></html>");
			
		

		

	}

}
