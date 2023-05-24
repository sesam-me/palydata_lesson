package main; // 패키지는 폴더를 만드는 것임

import unit.Marine;
import unit.Zealout;

public class Main {
// 접근 제어자 
// public -> protected -> default -> private
// public : 어디서든 가져다 쓸 수 있다. ex) main.class가보면 public있는 것만 뜬다는 것을 알 수 있음.
// protected : 동일 패키지 내에서 가능 또는 상속을 받으면 가능.
// default : 동일 패키지 내에서 가능, 아무것도 쓰지 않는 것.
// private : 자기 자신 안에서만 사용 가능.
	
	public static void main(String[] args) {
// Unit은 지금 abstract처리를 해서 단독 사용 불가. abstract를 지우면 가능.
//		Unit marine = new Unit("marine", 50, 10); //(캡슐화): 값만 넣으면 다른 코드에 영향을 미치지 않고 값을 알려줌
//		System.out.println(marine.getHp()); //getHp() : ()안에 뭐 들어가는지 모름(캡슐화)
//		System.out.println(marine.attack());
//		
//		Unit juggling = new Unit("juggling", 30, 5);
//		System.out.println(marine.getDamage(juggling));
//		System.out.println(marine.getHp());
		
		
		Marine marine = new Marine();
		Zealout zealout = new Zealout();
		for(int i=0; i<5; i++) {
		zealout.getDamage(marine);
		System.out.println(zealout.getHp());
		}
	}

}
