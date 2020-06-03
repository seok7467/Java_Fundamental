package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class jdbcUpdateDemo {

	public static void main(String[] args) {
		// 1.드라이버 로드
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null;
		PreparedStatement pstmt = null;

		// 2. 데이터베이스 연결 => Connection 객체를 생성한다.
		// localhost: 데이터베이스 설치 IP
		// 3306: 데이터베이스 포트
		// kpc:데이터베이스 명
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			// 3.SQL문을 전송할 수 있는 preparedStatement 객체 생성
			StringBuffer sql = new StringBuffer();

			// 문장 끝에 항상 공백 해 놓아야지 정상적으로 동작
			sql.append("update member ");
			sql.append("set NAME=?, addr=? ");
			sql.append("WHERE num=?");

			pstmt = con.prepareStatement(sql.toString());

			// 4. 바인딩 변수 처리
			int index = 0;
			pstmt.setString(++index, "샤넬");
			pstmt.setString(++index, "프랑스2");
			pstmt.setInt(++index, 9);

			// 5. SQL문 전송
			// resultCount : 업데이트 된 행의 수를 반환함.
			int resultCount = pstmt.executeUpdate();
			System.out.println("전송결과: " + resultCount);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 모든 자원 반납
		finally {

			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
