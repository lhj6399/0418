package new01;

import java.util.HashMap;
import java.util.Scanner;

public class New04 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어 : 의미
		 * map으로 생성
		 * 입력받을 단어의 개수를 입력받아 개수만큼 map에 추가
		 * 콘솔에 찍기
		 */
		
		HashMap<String, String> map = new HashMap();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어 개수 : ");
		
		int size = scan.nextInt();
		
		while(map.size()<size) {
		System.out.print("단어 : ");
		
		String word = scan.next();
		
		System.out.print("의미 : ");
		
		String mean = scan.next();
		
		map.put(word, mean);
		}
		
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp + " : " + map.get(tmp));
		}
		
		scan.close();
	}
}
