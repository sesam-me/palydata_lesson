import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//엑셀표를 리스트로 표현한다면?
//엑셀:
//key   : 수 이름 지역
//value : 1 이씨 경기도
//        2 박씨 충청도 
//	    3 김씨 서울
//[수:1, 이름:이씨, 지역:경기도]


public class Example4 {

	public static void main(String[] args) {
		// 정렬
		int[] arr = {2,3,4,1,2,3,5,7};
		System.out.println(Arrays.toString(arr)); // Arrays.toString(배열) : 배열 바로 리턴
		Arrays.sort(arr); // Arrays.sort(배열) : 정렬
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
//		#문제. 객체화
//		수, 이름, 나이 : 필드로 만들고 list화
//		{number:1,name:박,age:20}
//		{number:2,name:김,age:30}
//		{number:3,name:이,age:40}
//		{number:4,name:권,age:null}
		
		String excel = "수\t이름\t나이\n" +  
						"1\t박\t20\n" +
						"2\t김\t30\n" +
						"3\t이\t40\n" +
						"4\t권\t비공개";
		

	
		
	Map<String, List<Person>> map = new HashMap<>();
	List<Person> getList = new ArrayList <Person>;
	
	for(int i=0; i<4; i++) {
		getlist.add(excel);
	}
	}
}


public class Person {
	int num; 
	String name;
	int age;
	
	public Person(int num, String name, int age) {
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	
public class divi() {
	String key = 
}
} 


// #문제 2





