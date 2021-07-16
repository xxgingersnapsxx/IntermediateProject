package damanna.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

// JDBC드라이버를 로딩하고 Connection 객체를 생성하여 반환하는 메서드로 구성된 class 

public class DBUtil {
	static ResourceBundle bundle; 
	static { 

		bundle = ResourceBundle.getBundle("damanna.config.dbinfo");
		try {
			Class.forName(bundle.getString("driver"));
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(bundle.getString("url"), bundle.getString("user"),
					bundle.getString("pass"));
		} catch (SQLException e) {
			System.out.println("오라클 DB 연결 실패");
			return null;
		}
	}
}
