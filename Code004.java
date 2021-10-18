package JustRunJSP;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
public class Code004 {

	private Connection con;	// Ŀ�ؼ� �������� ����
	private PreparedStatement pstmt;	//�������� �Ű������� �޴� �������� ����
	private DataSource dataFactory;		// Connection Pool���� Connection�� ����� �� �ֵ��� ���ִ� DataSource �������� ����
	
	public Code004() {
		try {
			Context ctx = new InitialContext();		// Connection Pool ���� Datasource(Connection)�� ����ϱ� ���� JNDI ���� ��ü ���� �� ctx�� ����
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)envContext.lookup("jdbc/servlet");	// web.xml �� ������ res-ref-name �� ��ġ�ϴ� �����ͺ��̽� ����
			}
		catch (Exception e) {
			System.out.println("���ῡ ������ �߻�");
			e.printStackTrace();
		}
	}
	
	public List listMember() {
		List list = new ArrayList();
		try {
			con = dataFactory.getConnection();	// Connection Pool ���� ����� ��밡���� Connection�� ���� ��, con ���������� ����
			String query = "select * from t_member order by joinDate desc";
			System.out.println("prepareStatment : "+query);
			pstmt = con.prepareStatement(query);	//connection ���� ����� �������� pstmt ���������� ����
			ResultSet rs = pstmt.executeQuery();	//���޵� �������� executeQuery�� ���� ������ ��, ���ް��� ResultSet ���������� ����
			
			while (rs.next()) {
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date joinDate = rs.getDate("joinDate");
				Code005 vo = new Code005();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}
	
			
		
	
	

}
