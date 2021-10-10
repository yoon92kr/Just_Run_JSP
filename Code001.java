package git;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Code001")
public class Code001 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Code001() {
        super();
        
    }

	
	public void init(ServletConfig config) throws ServletException {
		
		// 서블릿 최초 요청시 (was) 한 번만 호출. 서블릿 생성 시 초기화 작업을 주로 수행한다. 
		
	}

	
	public void destroy() {
		
		// 서블릿이 기능을 수행하고 메모리에서 소멸될 때 호출된다.
		
	}

	
	// 웹 클라이언트의 method 요청 형식에 따른 작업을 수행한다.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// URI를 통해 request를 전달한다. 보안에 취약
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 헤더를 통해 request를 전달한다. 비교적 보안에 우수하다.
	}

}
