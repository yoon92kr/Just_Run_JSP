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
		
		// ���� ���� ��û�� (was) �� ���� ȣ��. ���� ���� �� �ʱ�ȭ �۾��� �ַ� �����Ѵ�. 
		
	}

	
	public void destroy() {
		
		// ������ ����� �����ϰ� �޸𸮿��� �Ҹ�� �� ȣ��ȴ�.
		
	}

	
	// �� Ŭ���̾�Ʈ�� method ��û ���Ŀ� ���� �۾��� �����Ѵ�.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// URI�� ���� request�� �����Ѵ�. ���ȿ� ���
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ����� ���� request�� �����Ѵ�. ���� ���ȿ� ����ϴ�.
	}

}
