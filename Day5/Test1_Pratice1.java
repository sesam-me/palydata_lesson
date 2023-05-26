import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Map? 리스트나 배열처럼 순차적으로(sequential) 해당 요소 값을 구하지 않고 key를 통해 value를 얻는다.
// 특징 1. 요소의 저장 순서를 유지하지 않습니다. 2. key : 중복을 허용  X , value :  중복은 허용 O

// put : map.put(key,vaule) key와 vaule넣기
// get : map.get(key) -> key기준으로 value를 반환
// containsKey : map.containsKey(key) -> 해당 key가 있는 지 반환(True/False)
// remove : map.remove(key) -> key값에 해달하는 key, value 삭제 후 value값 리턴
// size : map.size() -> map의 갯수 리턴



// 사전 만들기
public class Test1_Pratice1 {
	
	// Map<Key,Value>
	static Map<String, String> map = new HashMap(); // new HashMap() : () 왜 빈칸
	static Scanner sc; // 밖에다 빼서 static으로 한 이유는?
	
	
// main
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		input();
	}
	
	

// input()
	public static void input() {
		System.out.println("1.insert 2.delete 3.update");
		System.out.println("4.find 5.exit");
		int i Integer.parseInt(sc.nextLine());
	}

	
// modeSelect(int mode)
	public static void modeSelect(int mode) {
		switch(i) {
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
	
//	insert()
	public static void insert() {
		System.out.println("영단어 입력");
		String key = sc.nextLine();
		System.out.println("한국어 입력");
		String value = sc.nextLine();
		
		map.put(key, value);
		input();
	}

	
//	delete
	public static void delete() {
		String key = sc.nextLine();
		if(sc == 2) {
			System.out.println("key : ");
		}
	}
	

	
}
