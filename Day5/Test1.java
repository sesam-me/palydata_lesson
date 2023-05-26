import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//사전 만들기
// 입력을 받아서 
// apple 사과 
// banana 바나나 
// 저장
public class Test1 {
	static Map<String, String> map = new HashMap();
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		input();
	}
	
	public static void input() {
		System.out.println("1. insert 2. delete 3. update");
		System.out.println("4. find 5. exit");
		int i = Integer.parseInt(sc.nextLine());

	}
	public static void insert() {
		System.out.println("영단어 입력");
		String key = sc.nextLine();
		System.out.println("한국어 입력");
		String value = sc.nextLine();
		map.put(key, value);
		input(); //입력받은 값을 초기화 시켜줌
	}
	public static void delete() {
		// 키를 보여주고
		// 키를 입력하고 value 삭제 
		String key = sc.nextLine();
		if(isvalid(key));
			map.remove(key);
		else
			System.out.println("키가 없네요");
		input();
	}
	public static void update() {
		// 키를 보여주고
		// 키를 입력하고 value 업데이트
		
		input();
	}
	
	
	public static void find() {
		// 키를 보여주고
		// 키를 입력하고 value 찾기
		System.out.println("키 입력");
	    String key = sc.nextLine();
	    if(isValid(key)) 
	    	System.out.println("key : "+key+ ", value : " +map.get(key));
	    else 
	    	System.out.println("없는 단어");
		input();
		
		

	public static void isValid(String key) {
		if(map.containsKey(key))
			return true; // returen값 나오면 아래 print는 안함????????
		System.out.println("없는 단어");
		return false;
	}
	
//	public static void isValid(String key, isValid??? 이렇게 하는 방법은 뭔지 알아보기) {
//		if(map.containsKey(key))
//			return true; // returen값 나오면 아래 print는 안함????????
//		System.out.println("없는 단어");t
//		return false;
//	}	
//	

	}
	
	
	public static void modeSelect(int mode) {
		switch (i) {
		case 1:
			insert(); break;
		case 2:
			delete(); break;
		case 3:
			update(); break;
		case 4:
			find(); break;
		case 5:
			break;
		default:
			input(); break;
		}
	
	
	}

}