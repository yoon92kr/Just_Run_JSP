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
		request.setCharacterEncoding("utf-8");	// ���۵� ������ (�� Ŭ���̾�Ʈ�� ����)�� UTF-8�� ���ڵ�
		String param = request.getParameter("param"); 
		// �� Ŭ���̾�Ʈ�κ��� ���۵� request �� ���޵� "name"�� "param"�� ��ġ�ϴ� ���� String ������ ��ȯ
		String params[] = request.getParameterValues("params"); 
		// �� Ŭ���̾�Ʈ�κ��� ���۵� request �� ���޵� "name"�� "param"�� ��ġ�ϴ� ��� ���� (String) �迭 ��ü������ ��ȯ
	}

}
