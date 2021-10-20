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
		
		Cookie cookie = new Cookie("CookieName", URLEncoder.encode("JSP프로그래밍 쿠키생성 예제입니다.", "utf-8"));
		cookie.setMaxAge(24*60*60);
		// 쿠키의 유효 기간을 설정
		response.addCookie(cookie);
		// 생성된 쿠키를 브라우저로 전송
		
		Cookie[] value = request.getCookies();
		// 브라우저의 쿠키 정보를 배열객체 형태로 반환
		for (int i=0; i<value.length; i++) {
			if(value[i].getName().equals("CookieName")) {
				out.print("<h1> Cookie이름이 CookieName 인 쿠키의 값 가져오기 :"
						+URLDecoder.decode(value[i].getValue(), "utf-8")+ "<h1>");
			}
		}

		

	}

}
