
public class Tset1 {

	public static void main(String[] args) {
		// void : return이 없다.
		
		// 객체란? 사전적으로는 존재한다라른 의미.
		// 객체지향 프로 oop
		// 01. 클래스 
		// 키워드 : 상속, 캡슐화, 다형성
		// 장점 : 코드 재사용성, 모듈성, 유지보수
		// 단점 : 이리저리 참조?걸어서 복잡해짐, 
//		Person newFace = new Person(); // Person에 nerFace라는 변수를 만듦 = 새로운 Person을 가져옴.
//		newFace.name = "A";
//		newFace.age = 29;
//		
//		Person oldFace = new Person();
//		newFace.name = "B";
//		newFace.age = 21;
		
		String[] names = {"A","B"};
		int[] ages = {29,21};
	
		Person[] persons = new Person[2]; // 배열 2개 생성. 이부분이 이해가 안가
		
		for(int i=0; i<persons.length; i++) { // i는 행?
			Person person = new Person(names[i],ages[i]); // ctrl누르고 Person누르면 해당 클래스로 화면 넘어감
			persons[i] = person; 
		}
		
		for(int i=0; i<persons.length; i++) {
			System.out.println(persons[i].age + " " + persons[i].name);
		}
		
		System.out.println(persons[0]==persons[1]);
		System.out.println(persons[0].equals(persons[1]));
		
		// for(타입 / 배열의 구성요소 중 내용을? 빼온다 :선택한 배열)
		// 중간에 끝낼 수 없다. break 불가능.
		for(Person person : persons) {
			System.out.println(person.age + " :" + person.name + " " + person.toString());
			System.out.println(person.getAge());
			System.out.println(person.sound());
		}
		
		Animal cat = new Animal("고양이");
		System.out.println(cat.sound());

		
		for(int age : ages) {
			System.out.println(age);
		}
	}

}







class Person extends Sound{
	// field : 아래처럼 값
	String name;
	int age;
	
	// 생성자 : 생성할 때 사용
	// method() : 괄호 안에 들어 있는 내용이 다르면, 같은 메소드 이름을 사용할 수 있다. 순서만 달라도 가능.
	// 타입이 같으면 빨간줄이 뜬다?
	// overload : 다형성
	
	// all argument constructor :  다 있는?
	public Person(String name, int age) {
		this.name = name; // this : 자신 클래스
		this.age = age;
	}
	
	// no argument constructor : 없는
	public Person(int age) {}

	@Override 
	// 우클릭-> resource -> generate toString
	// override : 덮어쓰기. 원래 있는걸 바꿔서 씀
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	public int getAge(){
		return age;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String sound() {
		return "안녕하세요";
	}	
}


class Animal extends Sound{
	String name;
	public Animal(String name) {
		this.name = name;
	}
	
	@Override
	public String Sound() {
		return name + " " + name;
	}
}

class Sound {
	public String sound() {
		return "sound";
	}
}


abstract class Sound { // abstract : 상속만 받아서 쓸 수 있음. 독립적으로 쓸 수 없다. 받아서만 쓸 수 있음.
	abstract public String sound(); // 클래스가 추상적이기 때문에, 클래스에 속한 메소드도 추상적임.
		public String sounds() {
		return "sound2";
	}
}




