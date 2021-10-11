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
		// �� Ŭ���̾�Ʈ�� ��ȯ�� �������� ������ ����, ���ڵ� Ÿ���� charset�� ���� ����
		PrintWriter out = response.getWriter();
		// HttpServletResponse Ŭ������ getWriter �޼ҵ带 �����, ��½�Ʈ���� ��ü�� ����
		String data = request.getParameter("param");
		
		
		out.print(data);
		// PrintWriter�� print �޼ҵ带 ����Ͽ�, �����ص� �������� Ÿ������ �� Ŭ���̾�Ʈ���� �ڷ� ��ȯ
	}

}
