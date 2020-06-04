package java_20200604;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDao {
	//1.singleton pattern 코딩
	// 1)생성자의 접근한정자를 private로 설정한다.
	// 2)해당 클래스의 객체를 생성할 수 있는 변수를 static으로 선언한다.
	// 3)해당 클래스의 객체를 생성할 수 있는 메서드를 static으로 만든다.
	
	private static EmpDao dao;
	
	public static EmpDao getInstance() {
		if(dao==null) {
			dao = new EmpDao();
		}
		return dao;
	}
	
	private EmpDao() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public int insert(EmpDto e) {
		int resultCount = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("");
			sql.append("");
			sql.append("");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;

			pstmt.setInt(++index, 0);
			pstmt.setString(++index, "");

			resultCount = pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {

			close(con,pstmt,null);
		}
		return resultCount;
	}

	public int update(EmpDto e) {
		int resultCount = 0;
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE emp ");
			sql.append("SET ename=?, job=?,mgr=?,hiredate=CURDATE(),sal=?,comm=?,deptno =? ");
			sql.append("WHERE empno=? ");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;

			pstmt.setString(++index, e.getName());
			pstmt.setString(++index, e.getJob());
			pstmt.setInt(++index, e.getMgr());
			pstmt.setInt(++index, e.getSal());
			pstmt.setInt(++index, e.getComm());
			pstmt.setInt(++index, e.getDeptNO());
			pstmt.setInt(++index, e.getNo());

			resultCount = pstmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {

			close(con,pstmt,null);
		}
		return resultCount;
	}

	public int delete(int no) {
		int resultCount = 0;

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM emp WHERE empno = ?");

			pstmt = con.prepareStatement(sql.toString());
			int index = 0;
			pstmt.setInt(++index, no);

			resultCount = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			close(con,pstmt,null);

		}

		return resultCount;
	}

	private void close(Connection con, PreparedStatement pstmt) {

	}

	public ArrayList<EmpDto> select(int start, int len) {
		ArrayList<xxx> list = new ArrayList<xxx>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("");
			sql.append("");
			sql.append("");
			sql.append("");

			pstmt = con.prepareStatement(sql.toString());
			int index = 0;
			pstmt.setInt(++index, 0);
			pstmt.setString(++index, "");

			rs = pstmt.executeQuery();

			while (rs.next()) {
				int index = 0;
				int xxx = rs.getInt(++index);
				String xxx = rs.getString(++index);

				list.add(new xxx());

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			close(con, pstmt, rs);

		}
		return list;
	}

	private void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();

			if (pstmt != null)
				pstmt.close();

			if (con != null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public EmpDto select(int no) {
		EmpDto dto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();

			sql.append("");
			sql.append("");
			sql.append("");

			pstmt = con.prepareStatement(sql.toString());

			int index = 0;

			pstmt.setInt(++index, 0);
			pstmt.setString(++index, "");

			rs = pstmt.executeQuery();

			if (rs.next()) {
				index = 0;
				int x1 = rs.getInt(++index);
				String x2 = rs.getString(++index);

				dto = new EmpDto();

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			close(con, pstmt, rs);

		}
		return dto;
	}

	
}
