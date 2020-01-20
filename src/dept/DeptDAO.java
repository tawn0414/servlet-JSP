package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fw.DBUtil;
public class DeptDAO {
	//레코드 하나 삭제
	public int delete(String deptno) {
		Connection con = null;
		PreparedStatement ptmt = null;
		String sql = "delete from mydept where deptno=?";
		int result = 0;
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptno);
			result = ptmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	//전체 목록 출력
		public ArrayList<DeptDTO> getDeptList(){
			ArrayList<DeptDTO> boardlist = new ArrayList<DeptDTO>();
			DeptDTO board = null;
			Connection con = null;
			PreparedStatement ptmt = null;
			ResultSet rs = null;
			String sql = "select * from mydept";
			try {
				con = DBUtil.getConnection();
				ptmt = con.prepareStatement(sql);
				rs = ptmt.executeQuery();
				while(rs.next()) {
					board = new DeptDTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
					boardlist.add(board);
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}finally {
				DBUtil.close(rs, ptmt, con);
			}
			return boardlist;
		}
		
	//아래는 부서목록 삽입
	public int insert(DeptDTO dept) {
		Connection con = null;
		PreparedStatement ptmt = null;
		
		String sql = "insert into mydept values(?,?,?,?,?)";
		int result = 0; 
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, dept.getDeptno());
			ptmt.setString(2, dept.getDeptName());
			ptmt.setString(3, dept.getLoc());
			ptmt.setString(4, dept.getTel());
			ptmt.setString(5, dept.getMgr());
			result = ptmt.executeUpdate();
			System.out.println("resut=>"+ result);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	//read
	public DeptDTO read(String deptno) {
		DeptDTO dept = null;
		Connection con = null;
		PreparedStatement ptmt = null;
		ResultSet rs = null;
		String sql = "select * from mydept where deptno = ?";
		try {
			con = DBUtil.getConnection();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, deptno);
			rs = ptmt.executeQuery();//select실행
			//실행결과를 자바객체로 변환
			// - 레코드가 여러개일때: DTO로 레코드를 변환화고 ArrayList에 add
			// - 레코드가 한 개: DTO로 레코드 변환
			if(rs.next()) {
				dept = new DeptDTO(rs.getString(1),
								rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));											
				}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs, ptmt, con);
		}		
		return dept;	
	}
}
	
