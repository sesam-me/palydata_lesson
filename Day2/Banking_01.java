
public class Banking_01 {

	public static void main(String[] args) {
		int money = 50300;
		int coffee = 2200;
		
			// 커피 몇 잔 살 수 있고, 잔돈은 얼마?
			System.out.println(money/coffee); // 몫 : 22잔
			System.out.println(money%coffee); // 나머지 : 잔돈
			
			// 잔돈 천원, 오백원, 백원 몇 개?
			// #1 내 답변
			int a = money%coffee;
			int[] b3 = {1000,500,100};
			int b = a/b3[0]; // 1000원 몇장
			int b1 = (a-b*b3[0])/b3[1]; // 500원 몇장
			int b2 = (a-b*b3[0]-b1*b3[1])/b3[2];
			
			System.out.println("잔돈 " + a + "원");
			System.out.println("1000원 " + b + "개");
			System.out.println("500원 "+ b1 + "개");
			System.out.println("100원" + b2 + "개");
			
			
			// #2-1 for문
			for(int i=0; i<b3.length; i++) {
				if(i==0) {
					System.out.println(a / b3[i]);
				} else {
					System.out.println((a-((a/b3[i-1]) * b3[i-1])) / b3[i]);
				}
			}
			
			// #2-2 for문 완성~
			// # 천원은 모자라서 줄 수 없을 때(continue)
			for(int i=0; i<b3.length; i++) {
				if(b3[i] == 1000) continue; // continue : 넘어간다. continue 뒤에도 실행하지 않고 넘어가서 새로 실행
				System.out.println(b3[i] + "원 " + a / b3[i]);
				a = a % b3[i];
			}
			
			//	# 천원만 남겨주고 다른 잔돈은 안남겨 줄래!(break)
			for(int i=0; i<b3.length; i++) {
				System.out.println(b3[i] + "원 " + a / b3[i]);
				if(b3[i]==1000) break; // 1000원만 하고 끝! for문을 빠져나옴.
				a = a % b3[i];
			}
			
			
			
		
			
			
	
	
	
	}

}
