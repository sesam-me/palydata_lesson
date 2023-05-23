package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 01.문자열(String)
		// 기본 데이터 타입, 참조 데이터 타입(맨앞 대문자로) 
		String str1 = ""; // 참조 타입
		String str2 = null;
		// null과 ""의 차이는?
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1+1+1); // str이 string이기 때문에 1도 문자열이 됨
		System.out.println(1+1+str1); // 순서의 영향을 받음
		
		// 연습 1
		String hello = "hello";
		String world = "world";
		System.out.println(hello+ " " + world);
		
		
		// 02.문자(Character) : 한!글자
		char a = 'a';
		Character b = 'b';
		System.out.println(a+b); // 아스키코드로 표시
		
		// 03.불리언(boolean) : 참거짓
		boolean p = true;
		boolean z = false;
		Boolean x = true; // ***앞에 대문자롤 붙히고 풀네임을 쓰면, 참조가 가능함***
		
		
		// 04.배열
		String[] names = {"a", "b", "c", ""}; // index는 0부터 시작
		System.out.println(names[0]);
		String[] names2 = {}; // 0개 생성
		String[] names3 = new String[2]; // 초기에 생성한 것 바꿀 수 없음, 길이2
		int[] ints = {};
		
		// 연습
		int[] arr = {1,2,3,4,5};
		System.out.println(arr[1]);
		
		int[] arr2 = new int[2]; // 배열 2개를 생성, 기본형 디폴트 값 : 0
		System.out.println(arr2[1]); // 0
		
		Integer[] arr3 = new Integer[2]; // 참조형 디폴트 값 : null ***null??***
		
		System.out.println(arr3[1]); // null은 더할 수 없음, 문자열(" ")을 더해줘서 답을 나오게 만듦, 그냥 null을 더하려고 하면 오류뜸.
		System.out.println(arr3[1] + " " + arr2[1]); // null 0
//		System.out.println(arr3[1] + arr2[1] + " " ); // error. 순서대로 계산하기 때문에 null을 문자로 바꿔야함
		System.out.println(arr3.length);
	
	}

}
