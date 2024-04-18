package jdbcBoard;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc.DatabaseConnection;
import jdbc.ProductVO;

public class BoardDAOImpl implements DAO {

	// DB연결
	private Connection conn;
	// sql 구문을 실행시키는 기능을 하는 객체
	private PreparedStatement pst;
	// 쿼리구문 저장 스트링
	private String query="";
	
	public BoardDAOImpl() {
		// DBConnection class 생성 (싱클턴)
		DatabaseConnection dbc = DatabaseConnection.getInstance();
		conn = dbc.getConnection();
	}
	
	@Override
	public int insert(BoardVO b) {
		System.out.println("insert DAOImpl success!!");
		query = "insert into Board(title,writer,content) values(?,?,?)";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getWriter());
			pst.setString(3, b.getContent());
			// insert, update, delete => excuteUpdate() return int
			return pst.executeUpdate();
		} catch (SQLException e) {
			System.out.println("insert Error!!");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public BoardVO selectOne(int bno) {
		System.out.println("selectOne DAOImpl success!!");
		query = "select * from Board where bno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new BoardVO(
						rs.getInt("bno"),
						rs.getString("title"),
						rs.getString("writer"),
						rs.getString("content"),
						rs.getString("regdate"),
						rs.getString("moddate")
						);
			}
						
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("datail error!!");
				e.printStackTrace();
			}
			return null;
	}

	@Override
	public int update(BoardVO b) {
		// TODO Auto-generated method stub
		System.out.println("update DAOImpl success!!");
		query = "update board set title=?, "
				+ "writer=?, content=?, regdate=now() where bno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getWriter());
			pst.setString(3, b.getContent());
			pst.setInt(4, b.getBno());
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("update error!!");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int bno) {
		System.out.println("delete DAOImpl success!!");
		query = "delete from board where bno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("delete error");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public List<BoardVO> selectList() {
		System.out.println("list DAOImpl success!!");
		query = "select * from board order by bno desc";
		List<BoardVO> list = new ArrayList<>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				list.add(new BoardVO(rs.getInt("bno"),
						rs.getString("title"),
						rs.getString("writer"),
						rs.getString("content"),
						rs.getString("regdate"),
						rs.getString("moddate")));
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("list error");
			e.printStackTrace();
		}
		return null;

	}
}
