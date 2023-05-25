
public class Example {
	
	// * 바디가 있다. = 메소드  ex) public static void main(String[] args) {}
	public static void main(String[] args) {
		// 01. static : 생성을 안하고도 쓸 수 있다.

		Test test = new Test(); // 다른 클래스인 Test를 쓰려면 이렇게 생성해줘야함.
		test.a = 1;
		System.out.println(test.b + " " + Test.b); // test.b와 Test.b의 차이는?
		System.out.println(Test.class); // .class란? 
		
		
		for(int i=0; i<3; i++) {
			Test test1 = new Test();  // Test()는 한번 생성될 때마다 b++을 하니까, 4 4가 된다.  / a는 test1을 생성해야 사용 가능.
			Test.plus(i); // test1.plus(i); 와 같음. 왜? 클래스라서? // puls(i)를 같이 돌리면, 7 7이 됨
		} // Test()는 한번 생성될 때마다 b++을 하니까, 4가 된다.
		System.out.println(test.b + " " + Test.b); // test.b와 Test.b는 static으로 서로 공유하고 있기 때문에, 결과가 같다. / b는 	Test test1 = new Test();를 생성하지 않아도 사용가능하다
	}

}





class Test{
	// #1
	int a;
	static int b = 0; // static의 장점? 메모리 낭비 방지-> b를 계속 생성하는게 아니라 가져다 쓰면 되는 거라서.
	public Test() {
		b++; // 1
	}
	
	// #2
	public static void plus(int i) {
		b += i;
	}
}