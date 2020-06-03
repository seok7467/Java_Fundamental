package java_20200603;

public class JdbcDeleteDemo {

	public static void main(String[] args) {
		
		//1.드라이브 로드
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
