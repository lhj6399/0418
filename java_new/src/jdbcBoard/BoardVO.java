package jdbcBoard;

public class BoardVO {
	/*
	 * Board class 생성
	 * 번호, 제목, 내용, 작성자, 작성일
	 * 
	 * - menu
	 * 1. 게시글 추가 | 2. 게시글 검색 | 3. 게시글 수정
	 * 4. 게시글 삭제 | 5. 게시글 출력 | 6. 종료
	 */

	private int bno; // 게시글 번호 (자동 생성)
	private String title; // 제목
	private String writer; // 작성자
	private String content; // 내용
	private String regdate; // 등록일
	private String moddate; // 수정일
	
	// 생성자
	public BoardVO() { }
	
	// 게시글 등록 -> 
	public BoardVO(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	// 게시글 리스트 -> bno, title, writer
	public BoardVO(int bno, String title, String writer) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
	}
	
	// 게시글 수정 -> bno, title, writer, content
	public BoardVO(int bno, String title, String writer, String content) {
		this(title, writer, content);
		this.bno = bno;
	}
	
	// 게시글 상세 -> 전부
	public BoardVO(int bno, String title, String writer, String content, String regdate, String moddate) {
		this(bno, title, writer, content);
		this.regdate = regdate;
		this.moddate = moddate;
	}

	// getter / setter
	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getModdate() {
		return moddate;
	}

	public void setModdate(String moddate) {
		this.moddate = moddate;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regdate + ", moddate=" + moddate + "]";
	}
	
	
	
	
}
