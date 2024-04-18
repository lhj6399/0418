package jdbcBoard;

import java.util.List;

public interface DAO {

	int insert(BoardVO b);

	BoardVO selectOne(int bno);

	int update(BoardVO b);

	int delete(int bno);

	List<BoardVO> selectList();

}
