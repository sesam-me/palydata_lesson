package test;

public class study6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문
		// 01. for

		int[] arr1 = {1,2,3,4,5};
		int[][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}}; // 2차원 배열 ***이거 그림으로는 어떻게 되지?
		
//		for(int i=0; i<5; i++) { //(선언;조건;증감). debug로 확인해보자(코테에서 많이 쓰임)
//			System.out.println(i);
//		}
		
		// i++ or ++i
		int a = 0;
		System.out.println(a++); // a = a + 1   // 0
		System.out.println(++a); // a = 1 + a   // 2
		 
		//a += 1; // a = a + 1와 같음
		
		// 연습
		// #1 짝수
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]%2 == 0) {
				System.out.println(arr1[i]);
			} else {
//				System.out.println(arr1[i]);
			}
		}
		
	
		// #2-1 별찍기
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		// #2-2
		String star = "";
		for(int i=0; i<5; i++) {
			star += "*";
			System.out.println(star);
		}
		
		// # 2-3 별찍기 반대로
		for(int i=0; i<5; i++) {
			for(int j=0; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
//		String star = "*****";
//		for(int i=0; i<5; i++) {
//			star += "*";
//			System.out.println(star);
//		}
		
		
		
		
		// #2-4 {} 없애기
		int[][] arr = {
				{1,2,3}, 
				{4,5,6},
				{7,8,9}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j]);
			}
		}
		System.out.println();
		
		//
		for(int i=0; i<arr.length; i++) {
			for(int j : arr[i]) {
				System.out.print(j);
			}
		}
		System.out.println();
		
		// 내일 수업
		// #2-5 대각선으로 읽고 싶다.159->26->3 이렇게 읽고 싶다. 
//		1,1 1,2 1,3
//		2,2 2,3
//		3,3
		
		int[][] arr4 = {
				{1,2,3}, 
				{4,5,6},
				{7,8,9}};
		
		
		for(int i=0; i>=3; i++) {
			for(int j=0; j>i; j++) {
				
				System.out.println("d" + arr4[i][j]);
			}
		}
		
		
	}

}
