
public class d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"A","B"};
		int[] ages = {1,2};
		
		Person[] persons = new Person[2];
		
		for(int i=0; i<persons.length; i++) {
			Person person = new Person(names[i],ages[i]); // 생성
			
			persons[i] = person;
			
			System.out.println(person.age + " " + person.name + " " + person.toString());
	}
	
}
