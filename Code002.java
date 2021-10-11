package JustRunJSP;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Code002")
public class Code002 extends HttpServlet {

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");	// 전송된 데이터 (웹 클라이언트로 부터)를 UTF-8로 인코딩
		String param = request.getParameter("param"); 
		// 웹 클라이언트로부터 전송된 request 중 전달된 "name"과 "param"이 일치하는 값을 String 형으로 반환
		String params[] = request.getParameterValues("params"); 
		// 웹 클라이언트로부터 전송된 request 중 전달된 "name"과 "param"이 일치하는 모든 값을 (String) 배열 객체형으로 반환
	}

}
