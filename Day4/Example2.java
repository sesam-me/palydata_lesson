import java.util.ArrayList;
import java.util.List;

// java.lang.*은 자동으로 설치되어 있다.

public class Example2 {

	public static void main(String[] args) {
		// arr와 list의 차이점?
		int[] arr = new int[3]; // arr: 길이(index)가 정해져 있다.
		
		List<Integer> list = new ArrayList(); // ctrl + space -> List - java.util
		// List : 길이가 무한하다
		list.add(1);
		list.add(2);
		list.add(1);
//		Integer[] tmp = (Integer[]) list.toArray();
		
		System.out.println(arr.length);
		System.out.println(list.size()); // list에  toStirng이 구현되어 있다. list = list.String()
		// arr은 arr.length사용, list는 .size()사용
		System.out.println(list.remove(1)); // 입력한 값 삭제, 삭제할게 없으면 false
//		System.out.println(list.get(0)); // 1   0번째(index)에 있는 값
//		System.out.println(list.get(1)); // 2   1번째에 있는 값
//		System.out.println(list.get(2)); // 1   2번째에 있는 값
		System.out.println(list.set(0, 3)); // 0번째를 3으로 바꾸겠다
		
//		문제1. 123456798 넣고 짝수의 합을 구하자.
		List<Integer> list2 = new ArrayList();
		int sum = 0;
		for(int i=0; i<10; i++) {
			list2.add(i);
		}
		System.out.println("list2 " + list2);
		
		// 방법1
		for(int i=0; i<list2.size(); i++) {
			if(list2.get(i) % 2 == 0) {
			sum += list2.get(i);
			}
		}
		
		
		// 방법2
		for(Integer i : list2)
			if(i%2 ==0) {
				sum += i;
			}
		System.out.println("짝수의 합 : " + sum);
		
		
		
		
		
//		문제2. name과 age를 가지고 있는 person을 만들고 
//		input:
//		{name:park, age:20},{name:kim,age:14},{name:lee,age:24}
//		한 해가 지나서 한살 먹어야함. 한 살씩 먹이고 출력하라.
//		output : 
//		[{name:park,age:21},{name:kim,age:15},{name:lee,age:25}]
		
		Person person1 = new Person("Park", 20);
		Person person2 = new Person("Kim", 20);
		Person person3 = new Person("lee", 20);
		List<Person> persons = new ArrayList<Person>(); // 타입List로 받을 수 있는 이유는 List가 부모?이기 때문 ex.calss ArrayList extends List
		// ArrList와 LinkList와 차이
		
		
//		persons.add(person1);
//		persons.add(person2);
//		persons.add(person3);
//		for(Person person: persons) {
//			person.age + 1;
//		}
//		
		
	}
}

class Person{
	private String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}	