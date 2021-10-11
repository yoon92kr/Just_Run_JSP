package JustRunJSP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Code003")
public class Code003 extends HttpServlet {
	
    public Code003() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		response.setContentType("text/html;charset=utf-8");
		// 웹 클라이언트로 반환할 데이터의 종류를 선언, 인코딩 타입을 charset을 통해 선언
		PrintWriter out = response.getWriter();
		// HttpServletResponse 클래스의 getWriter 메소드를 사용해, 출력스트림의 객체를 생성
		String data = request.getParameter("param");
		
		
		out.print(data);
		// PrintWriter의 print 메소드를 사용하여, 설정해둔 데이터의 타입으로 웹 클라이언트에게 자료 반환
	}

}
