
public class Study_01 {

	public static void main(String[] args) {
		
		// 복습: for문, if문
		// 약수 찾기
		int a = 6; // 1 2 3 6
		
		// #방법1-1 나머지 0인것
		for(int i=1; i<7; i++) {
				if(a%i == 0) { // 6을 나누었을 때 나머지 0
					System.out.print(i);
				}
		}
		System.out.println();
		
		// #방법1-2 (best) 내려가기 : 이게 더 좋은 듯. i범위를 따로 생각하지 않고 a만 바꿔주면 되니까. 가장 간단.
		for (int i = a; i > 0; i--) {
			if (a % i == 0)
				System.out.print(i);
		}
		System.out.println();
		
		// #방법2 곱했을 때 6
		for (int i=1; i<a+1; i++) {
			for (int j=1; j<a+1; j++) {
				if (i*j == a) {
					System.out.print(i);
				}
			}
		}
		
		
		
		// if는 순서영향을 받는다.
		// #1 2만 나옴
		if(a%2 == 0) {
			System.out.println("2");
		} else if(a%3 == 0) {
			System.out.println("3");
		} else if(a%6 == 0) {
			System.out.println("6");
		}
		
		// #2 2,3,6 모두 나옴. 독립적인 if
		if(a%2 == 0) {
			System.out.println("2");
		} if(a%3 == 0) {
			System.out.println("3");
		} if(a%6 == 0) {
			System.out.println("6");
		}
		
		
		
		
		// 진도
		// 연산자($$:AND, ||:OR)
		int a2 = 9;
		
		if(a2%2 == 0 && a2%3 == 0) {
			System.out.println("6");
		} if(a2%3 == 0) {
			System.out.println("3");
		} if(a2%6 == 0) {
			System.out.println("6");
		}
		
		
		

	}
}