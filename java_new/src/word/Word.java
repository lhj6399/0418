package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Word {
//	private String word;
//	private String mean;
//	
//	public Word() {}
//	
//	public Word(String word, String mean) {
//		
//	}
//	
	
		HashMap<String, String> map = new HashMap();
		
		// 단어 추가
		public void insertWord(Scanner scan) {
			
			System.out.print("단어 : ");
			String word = scan.next();
			
			System.out.print("의미 : ");
			String mean = scan.next();
			
			map.put(word, mean);
			
			System.out.println("단어 저장 완료");
		}
		
		// 단어 검색 
		public void searchWord(Scanner scan) {
			System.out.println("검색할 단어: ");
			String word = scan.next();
			if (map.containsKey(word)) {
				System.out.println("-- 검색 결과 --");
				System.out.println(word+":"+map.get(word));
				return;
			}
			System.out.println("검색 결과가 없습니다.");
		}
		
		// 단어 수정
		public void modifyWord(Scanner scan) {
			System.out.println("수정할 단어: ");
			String word = scan.next();
			if (map.containsKey(word)) {
				System.out.println("의미: ");
				String mean = scan.next();
				System.out.println("수정 완료");
				map.remove(word);
				map.put(word, mean);
				return;
			}
			System.out.println("수정할 단어가 없습니다.");
		}
		
		// 단어 출력
		public void printWord() {
			System.out.println("-- 단어장 --");
			Iterator<String> it = map.keySet().iterator();
			while(it.hasNext()) {
				for (int i=1; i<=map.size(); i++) {
				String word = it.next();
				String mean = map.get(word);
				System.out.println(i+"."+word+" : "+mean);
				}
			}
		}

//		public void filePrint() throws IOException {
//			FileWriter fw = new FileWriter("word.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			StringBuffer sb = new StringBuffer();
//			
//			String data ="";
//			int cnt = 0;
//			
//			while(cnt < list.size()) {
//				sb.append(list.get(cnt))
//			}
//			
//		}
		
		
	}

