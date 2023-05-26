import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 {

	public static void main(String[] args) {
//		서울에 null -> 박씨 -> [박씨, 김씨]
//		부산에 [이씨]
//		대전에 [도씨]
//		제주에 [류씨]
		
//		// 방법1
		 // String:서울, List<Person>:Person
////		persons.add(new Person("박씨",20));
////		// [박씨]
////		map.put("서울", persons);
//		List<Person> persons1 = map.get("서울");
//		// [박씨]
//		persons1.add(new Person("김씨",20));
//		// [박씨, 김씨]
//		System.out.println(map);
//		
//		

		// 방법2
		Map<String, List<Person>> map = new HashMap<>();
		//getOrDefault(key, Default): 찾는 key의 매핑되어 있는 value값 반환,
		// 지정된 키로 매핑된 값이 없을 경우, 반환되는 기본값
		List<Person> getList = map.getOrDefault("서울", new ArrayList<Person>());
		// {} [] 처음에는 빈게 나옴
		getList.add(new Person("김씨",20));
		// [김씨, 20]
		map.put("서울", getList); // 서울의 값에 넣어야하니까 get("서울")..... put은 안해줘도 되는데 그냥 때려박았다?
		// 서울=
		
		System.out.println(map);
		
	}

}



class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

