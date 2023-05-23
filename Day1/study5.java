package test;

public class study5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 01.조건문
		// 1) if
		// 조건 결과가 한 줄 일 때는, {}생략 가능
		// boolean일 때
		// 벌레 죽었난요? 예(true) 아니오(false)
		boolean isDead = true;
		if (isDead) {
			System.out.println("버려.");
		} else {
			System.out.println("죽여.");
		}
		
		
		// 숫자 조건일 때
		// #1
		int i = 10;
		if(i > 7) {
			System.out.println("if");
		} else if(i == 7) {
			System.out.println("else if");
		} else {
			System.out.println("else");
		}
		
		// #2
		int a =0;
		if(a+1 == 0+1) {
			System.out.println("true");
		}
		
		int b = 0;
		if(a+1 == b+1) {
			System.out.println("true"); // true
		}
		
		
		// 문자일 때
		// #1
		// hi + 1 == "hi"  //hi + "1" == "hi" 일 경우에 왜 false?
		String hi = "hi";
		if(hi == "hi") { // true
			System.out.println("hi == \"hi\"true");
		} else {
			System.out.println("false");
		}
		
		// #2
		if(hi + 1 == "hi1") { // 왜 false? hi의 주소값  == "hi" 이기 때문에
			System.out.println("2.true");
		} else {
			System.out.println("hi + 1 == \"hi\"false");
		}
		
		// #3
		if(hi + "1" == "hi1") {
			System.out.println("true");
		} else {
			System.out.println("\"hi\" + \"1\" == \"hi1\"false");
		}
		
		// #4
		if("hi" + "1" == "hi1") {
			System.out.println("true");
		} else {
			System.out.println("hi + \"1\" == \"hi\"false");
		}
		
		// #5 이거 다시
		String hi1 = "hi";
		String hi2 = hi + "1";
		if(hi2.equals("hi1")) { // equals : 주솟값 비교 , !: 값을 반대로 
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		

		// 2) 3항연산자(조건? 참: 거짓)
		// # if문일 때
		int p = 6;
		if(p % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// # 3항연산자
		// # 경우의 수가 늘어날 수록 if를 쓰는게 좋음
		System.out.println(p % 2 == 0 ? "짝수" : "홀수");
		
		
		// 3) switch
		switch (p % 2) {
		case 1: // 값이  1일 때
			System.out.println("홀수");
			break; // 결과가 나오고 조건문 빠져나옴.
		case 0: // 값이  0일 때
			System.out.println("짝수");
			break;
		default:
			System.out.println("default");
			break;
		}
	}

}
