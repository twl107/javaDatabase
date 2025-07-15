package t1_Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class T1_ConnectionDAO {
	
	public T1_ConnectionDAO() {
		
	
	// 1.JDBC 드라이버를 다운로드 받아서 작업 프로젝트에 등록시켜준다.
	
	try {
		// 2. JDBC 드라이버를 검색
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver 검색 성공!!");
		
		// 3. DB서버에 연결(연동) 후 데이터베이스 사용 준비 유무 확인?
		String url = "jdbc:mysql://localhost:3306/springGroup";
		String user = "atom";
		String password = "1234";
//		Connection conn = DriverManager.getConnection(url, user, password);
		DriverManager.getConnection(url, user, password);
		System.out.println("Database 연결 성공!!!");
		
		// 4. Database 안의 Table 사용처리....
	} catch (ClassNotFoundException e) {
		System.out.println("Driver 검색 실패~~");
	} catch (SQLException e) {
		System.out.println("Database 연결 실패~~~");
	} finally {
		System.out.println("작업끝...");
//		conn.close();
	}
	
	
	
	
	
	}
}
