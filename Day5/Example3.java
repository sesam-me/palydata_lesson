import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class Example3 {
	static Scanner sc;
	static Map<String, List<Person1>> map = new HashMap<>();


// main
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		controller(); // controller()를 실행해야, 콘솔에 입력을 할 수 있음.
	}
// controller
	static void controller() {
		// refactor -> Edd? (alt+shif+L)
		System.out.println("1.insert 2.find 3.findAll 4.Exit");
		String nextLine = sc.nextLine(); // 여기에서 콘솔에서 입력할 수있게 해줌.
		int mode = Integer.parseInt(nextLine);
		extracted(mode);  //Extract Method 결과
		
	}
	private static void extracted(int mode) {
		if(mode==1) insert();  ///////////////////////////////
		else if(mode==2) find();
		else if(mode==3) findAll();
		else if(mode==4) return; //반환값이 없을 때, return써도됨 {}것도 가능
		else controller();  ///////////////////////////////////////////// Extract Method 
	}
// insert
	static void insert() {
		String region = sc.nextLine();
		String name = sc.nextLine();
		String ageString = sc.nextLine();
		int age = Integer.parseInt(ageString);
		String region2 = region;
		List<Person1> orDefault = map.getOrDefault(region2, new ArrayList<>()); // shift+Alt+L
		orDefault.add(new Person1(name,age));
		map.put(region, orDefault);
		controller();
		
	}
// find
	static void find() {
		String region = sc.nextLine();
		if(map.containsKey(region)) {
			System.out.println(map.get(region));
		}
		
		
	}
// findAll 전체보기
	static void findAll() {
		System.out.println(map);
		controller();
	}
	
}




class Person1{
	private String name;
	int age;
	
	public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}	