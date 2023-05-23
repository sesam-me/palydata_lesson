package test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수
		// 종류 : 기본 데이터 타입(null 불가능), 참조 데이터 타입(null 가능)
		// null : 비어있다, 확실하지 않은 값?
		// 
		
		int a = 127; // 기본 데이터 타입, byte는 127까지라서 128이 되면 int로 바꿔줘야함
		Integer b = null; // 참조 데이터 타입
		a = a+1;
		System.out.println(a);
		System.out.println(b);
		
		
		// 변수 선언
		// 01.숫자
		// byte->short->int(Integer)->long
		// 2^8-1->2^16-1->2^32-1->2^64-1
		// + - / *
//		System.out.println(a/b);
		
		
		// 02.실수
		// float->double
		// 2^32(소수점7자리까지)->2^64(소수점 15자리까지)
		int a2 = 127;
		double b2 = 22.0;
		a2 = a2 +1;
		System.out.println(a2 / b2); // (자동형변환)int보다 double이 더 크기 때문에 자동으로 double로 형변환 됨

		// % : 나머지
	}

}
