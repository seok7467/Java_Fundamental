package java_20200602;

import java.sql.Connection;

public class JdbcDemo2 {

	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		
		
		

	}

}
