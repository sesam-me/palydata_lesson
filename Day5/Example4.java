import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


// #문제1. 엑셀표를 리스트로 표현한다면?
//엑셀:
//key   : 수 이름 지역
//value : 1 이씨 경기도
//        2 박씨 충청도 
//	    3 김씨 서울
//[수:1, 이름:이씨, 지역:경기도]


public class Example4 {

	public static void main(String[] args) {
//		// 정렬
//		int[] arr = {2,3,4,1,2,3,5,7};
//		System.out.println(Arrays.toString(arr)); // Arrays.toString(배열) : 배열 바로 리턴
//		Arrays.sort(arr); // Arrays.sort(배열) : 정렬
//		System.out.println(Arrays.toString(arr));
//		
		
		
//		#문제1. 객체화
//		수, 이름, 나이 : 필드로 만들고 list화
//		{number:1,name:박,age:20}
//		{number:2,name:김,age:30}
//		{number:3,name:이,age:40}
//		{number:4,name:권,age:null}
		
		String excel = "수\t이름\t나이\n" +  
						"1\t박\t20\n" +
						"2\t김\t30\n" +
						"3\t이\t40\n" +
						"4\t권\t비공개"; // 여기 비공개 부분을 어떻게 처리? 0과 null중에 골라야함. => Integer로 null을 넣음. 0으로 처리하면 나이 평균을 낼 때, 값이 이상해짐
		
//		1. \n 쪼개기
		String[] arr = excel.split("\n");
//		2/ \t 쪼개기
		List<String[]> list = new ArrayList();
		for (int i = 1; i < arr.length; i++) { // 첫번째는 구분자로 필요없기 떄문에, i=1부터 시작
			list.add(arr[i].split("\t"));
		}
//		3. 데이터를 담을 클래스를 만든다. -> class Person0
//		System.out.println(Arrays.toString(list.get(0)));
		
//		4. 넣고 출력
		List<Person0> answer = new ArrayList<Person0>();
		for(int i=0; i<list.size(); i++) {
			String[] get = list.get(i);
			Person0 person0 = new Person0(Integer.parseInt(get[0]), get[1], get[2]);
			answer.add(person0);
		}
		System.out.println(answer);
	}
}


class Person0 {
	private int num;
	private String name;
	private Integer age; // 왜 Integer? Integer의 디폴트값이 null.
	
	public Person0(int num, String name, String age) {
		this.num = num;
		this.name = name;
		if(!age.equals("비공개")) this.age = Integer.parseInt(age);
	
	}

	@Override
	public String toString() {
		return "Person0 [num=" + num + ", name=" + name + ", age=" + age + "]";
	}
}



