package jdbcBoard;

import java.util.List;

public class BoardServiceImpl implements Service {

	private DAO dao; // 인터페이스
	public BoardServiceImpl() {
		dao = new BoardDAOImpl(); // 구현체
	}
	
	@Override
	public int register(BoardVO b) {
		// 실제 구현 영역
				System.out.println("register serviceImpl success!!");
				// 각 DAO에게 저장 요청 
				// dao 요청시 sql 구문과 비슷하게 메서드명을 작성하는 것이 일반적
				return dao.insert(b);
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		System.out.println("list serviceImpl success");
		return dao.selectList();
	}

	@Override
	public BoardVO getDetail(int bno) {
		// TODO Auto-generated method stub
		System.out.println("detail serviceImpl success!!");
		return dao.selectOne(bno);
	}

	@Override
	public int modify(BoardVO b) {
		// TODO Auto-generated method stub
		System.out.println("modify serviceImpl success!!");
		return dao.update(b);
	}

	@Override
	public int remove(int bno) {
		// TODO Auto-generated method stub
		System.out.println("remove serviceImpl success!!");
		return dao.delete(bno);
	}

}
