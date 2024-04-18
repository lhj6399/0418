package jdbcBoard;

import java.util.List;

public interface Service {

	int register(BoardVO b);

	List<BoardVO> getList();

	BoardVO getDetail(int pno);

	int modify(BoardVO b);

	int remove(int bno);

}
