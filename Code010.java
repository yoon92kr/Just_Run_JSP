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


@WebServlet("/Code010")
public class Code010 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		Cookie cookie = new Cookie("CookieName", URLEncoder.encode("JSP���α׷��� ��Ű���� �����Դϴ�.", "utf-8"));
		cookie.setMaxAge(24*60*60);
		// ��Ű�� ��ȿ �Ⱓ�� ����
		response.addCookie(cookie);
		// ������ ��Ű�� �������� ����
		
		Cookie[] value = request.getCookies();
		// �������� ��Ű ������ �迭��ü ���·� ��ȯ
		for (int i=0; i<value.length; i++) {
			if(value[i].getName().equals("CookieName")) {
				out.print("<h1> Cookie�̸��� CookieName �� ��Ű�� �� �������� :"
						+URLDecoder.decode(value[i].getValue(), "utf-8")+ "<h1>");
			}
		}

		

	}

}
