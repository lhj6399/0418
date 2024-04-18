package board;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		/*
		 * Board Class 생성
		 * 번호, 제목, 내용, 작성자, 작성일
		 *  - 번호 : 객체 생성시 자동으로 증가
		 *  - 작성일 : 오늘 날짜로 자동 생성 (date 함수)
		 *  - 번호가 일치하면 같은 게시물로 인지 equals 추가
		 		 *  - menu
				 *  1. 게시글 추가
				 *  2. 게시글 검색
				 *  3. 게시글 수정
				 *  4. 게시글 삭제
				 *  5. 게시글 출력
				 *  6. 종료
		 */
		BoardManager bm = new BoardManager();
		
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
		
		do {
			bm.printMenu();
			menu = scan.nextInt();
			switch(menu) {
			case 1: bm.addBoard(scan);
			break;
			case 2: bm.searchBoard(scan);
			break;
			case 3: bm.modifyBoard(scan);
			break;
			case 4: bm.removeBoard(scan);
			break;
			case 5: bm.printBoard();
			break;
			default: System.out.println("잘못된 메뉴입니다.");
			break;
			}
		} while (menu != 6); {
			System.out.println("종료");
		}
		
		scan.close();

	}

}
