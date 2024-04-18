package board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardManager {

	List<Board> list = new ArrayList <Board>(); 

	public void addBoard(Scanner scan) {
		// TODO Auto-generated method stub
		System.out.println("-- 게시글 등록--");
		System.out.println("title : ");
		scan.nextLine(); // 메뉴에서 입력된 Enter처리
		String title  = scan.nextLine(); // 공백 포함
		System.out.println("writer : ");
		String writer = scan.next();
		System.out.println("content");
		scan.nextLine();
		String content = scan.nextLine();
		
		Board b = new Board(title,content,writer);
		list.add(b);
	}

	public void searchBoard(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	public void modifyBoard(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	public void removeBoard(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	public void printBoard() {
		// TODO Auto-generated method stub
		// toString 이용
		for (Board b : list) {
			System.out.println(b);
		}
		
	}

	public void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("-- 게시판 --");
		System.out.println("메뉴를 입력하세요.");
		System.out.println("1. 게시글 추가 | 2. 게시글 검색 | 3. 게시글 수정 | 4. 게시글 삭제 | 5. 게시글 출력 | 6. 종료");
	}

}
