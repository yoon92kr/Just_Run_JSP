package JustRunJSP;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Code006")
public class Code006 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		response.sendRedirect("Redirect");
		// ù��° �������� �� Ŭ���̾�Ʈ�� �ǵ��ư�, Redirect�� ���ε� ���Ϸ� �ٽ� Request
		// ù��° ������ ����(requset, responset ��)�� ���û�Ǵ� Redirect�� ���۵��� ���Ѵ�.
	}

}
