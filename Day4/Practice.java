import java.util.ArrayList;
import java.util.List;

public class Practice {
	public static void main(String[] args) {
		
	int[] arr = new int[3];
	
	List<Integer> list = new ArrayList<Integer>();
	
	list.add(1);
	list.add(2);
	list.add(1);
	
	System.out.println(arr.length); // arr 길이
	System.out.println(list.size()); // list 길이
	System.out.println(list.contains(1)); // 1이 포함되어 있어?
	System.out.println(list.remove(1)); // 입력한 값 삭제, 삭제할게 없으면 false
	System.out.println(list.get(0)); // 1   0번째에 있는 값
	System.out.println(list.get(1)); // 2   1번째에 있는 값
	System.out.println(list.get(2)); // 1   2번째에 있는 값
	System.out.println(list.set(0,3)); // 0번째를 3으로 바꿈
	}





	
class Person{
	private String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name; // this(=Person)의 name 
		this.age = age;
	}
}


}


