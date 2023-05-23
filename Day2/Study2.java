
public class Study2 {

	public static void main(String[] args) {
//		// 01. for(선언; 조건; 증감){실행}
//		for (int i=0; i<10; i++) {
//			System.out.print(i);
//		}
//		}
//		System.out.println();
//		
//		
//		// 02. while(조건){실행}
//		int i = 0;
//		while(i<10) {
//			System.out.print(i);
//			i++;
//		}
//		System.out.println();
//		
//		// 연습1
//		boolean isBreak = true;
//		i = 0; // 위에 i가 선언(14행)되어 있어서 int를 쓰면 실행이 안되나봄? 
//		while(isBreak) {
//			System.out.println("whlie");
//			i++;
//			if(i<5) isBreak = false;
//		}
		
		// 연습2 
		// 987654321
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
//		1,1 1,2 1,3
//		2,1 2,2 2,3
//		3,1 3,2 3,3
		
		// while문 : 987 654 321  for문->while문으로 바꾸기
//		int i1 = arr.length-1;
//		while(i1>=0) {
//			int j = arr.length-1;
//			while(j>=0) {
//				System.out.print(arr[i1][j]);
//				j--;
//			}
//			i1--;
//		}
//		
//		// for문 : 987654321
//		for(int i=arr.length-1; i>0; i--) { // 3 
//			for(int j1=arr.length-1; j1>0; j1--) { // 
//				System.out.print(arr[i][j1]);
//			}
//		}
//		System.out.println();
//	
		
		
//		1,1 1,2 1,3
//		2,1 2,2 2,3
//		3,1 3,2 3,3
	
		// 147 258 369
		int i3 = 0;
		while(i3<arr.length) {
			int j3 = 0;
			while(j3<arr.length) {
				System.out.print(arr[j3][i3]);
				j3++;
			}
			i3++;
		} 
		System.out.println();
		
		// **for과 while의 차이점
		
		
		// 159 26 3 
//		0,0 0,1 0,2
//		    1,1 1,2
//			    2,2
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				System.out.print(arr[j][j+i]);
			}
		}
		
		
		// 탐색할 때 만약 홀수면 1을 더하고, 마지막에 홀수인 값의 합을 출력하고, 리스트를 보여줘라.
		// 25 224 466 8810
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if((arr[i][j] % 2) != 0) {
					sum += arr[i][j]; // 홀수 값의 합
					arr[i][j]++; // 1더하고
				}
			}
		} System.out.println(sum); // 합을 출력
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
					System.out.println(arr[i][j]); // 리스트 출력
				}
			System.out.println();
			}
			
		

	
	// 159 48 7
	//	0,0 0,1 0,2
	//  1,0 1,1 1,2
	//	2,0 2,1 2,2
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				System.out.print(arr[j][j+i]);
			}
		}
				
//		// 03. do(실행; 증감;)~while(조건) : 잘 안쓰임...
//		i = 0; // i초기화
//		do {
//			System.out.print(i);
		
//			i++;
//		} while(i<10);
//		
//		
	
	}
}
