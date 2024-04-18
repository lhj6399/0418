package word;

import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		/*
		 * 단어장 프로그램 작성
		 * Word 클래스 생성
		 * 단어, 의미
		 * 
		 * 메뉴
		 * 1. 단어 등록 | 2. 단어 검색 | 3. 단어 수정 | 4. 단어 출력 | 5. 파일로 내보내기 | 6. 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		Word w = new Word();
		int menu = 0;
		
		do {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1. 단어 등록 | 2. 단어 검색 | 3. 단어 수정 | 4. 단어 출력 | 5. 파일로 내보내기 | 6. 종료");
			menu = scan.nextInt();
			switch(menu) {
			case 1: w.insertWord(scan);
			break;
			case 2: w.searchWord(scan);
			break;
			case 3: w.modifyWord(scan);
			break;
			case 4: w.printWord();
			break;
//			case 5: w.filePrint();
//			break;
			default: System.out.println("잘못된 메뉴입니다.");
			break;
			}
		} while (menu != 6); {
			System.out.println("종료");
		}
		
		scan.close();

	}

}
