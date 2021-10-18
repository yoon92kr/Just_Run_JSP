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

	private Connection con;	// 커넥션 참조변수 생성
	private PreparedStatement pstmt;	//쿼리문을 매개변수로 받는 참조변수 생성
	private DataSource dataFactory;		// Connection Pool에서 Connection을 사용할 수 있도록 해주는 DataSource 참조변수 생성
	
	public Code004() {
		try {
			Context ctx = new InitialContext();		// Connection Pool 에서 Datasource(Connection)을 사용하기 위한 JNDI 서버 객체 생성 후 ctx에 전달
			Context envContext = (Context)ctx.lookup("java:/comp/env");
			dataFactory = (DataSource)envContext.lookup("jdbc/servlet");	// web.xml 에 설정한 res-ref-name 중 일치하는 데이터베이스 연결
			}
		catch (Exception e) {
			System.out.println("연결에 문제가 발생");
			e.printStackTrace();
		}
	}
	
	public List listMember() {
		List list = new ArrayList();
		try {
			con = dataFactory.getConnection();	// Connection Pool 에서 사용할 사용가능한 Connection을 받은 뒤, con 참조변수에 전달
			String query = "select * from t_member order by joinDate desc";
			System.out.println("prepareStatment : "+query);
			pstmt = con.prepareStatement(query);	//connection 에서 사용할 쿼리문을 pstmt 참조변수에 전달
			ResultSet rs = pstmt.executeQuery();	//전달된 쿼리문을 executeQuery를 통해 실행한 뒤, 전달값을 ResultSet 참조변수에 전달
			
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
