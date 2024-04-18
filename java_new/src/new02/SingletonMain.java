package new02;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 싱글턴 객체 생성
//		Singleton s = new Singleton(); // 생성X
		Singleton s = Singleton.getInstance(); // static 이기 때문에 클래스에서 직접 접근
		Singleton s1 = Singleton.getInstance();
		
		if (s == s1) { // 주소가 같은지 확인
			System.out.println("s==s1 같은 객체");
		} else {
			System.out.println("s!=s1 다른 객체");
		}

	}

}
/*
 * mvn repository 
 * MySQL Connector/J
 * 8.0.32
 * jar
 * java_new
 * properties
 * classPath
 * add External jars
 * 다운로드 받은 파일 불러오기
 * */
