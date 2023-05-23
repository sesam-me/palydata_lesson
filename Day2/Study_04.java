
public class Study_04 {

	public static void main(String[] args) {
		String names = {"아메리카노","라떼"};
		int[] prices = {1400, 3000};
		for(int i=0; i<names.length();i++) {
			
		}
		
		
		Coffee coffee = new Coffee();
		coffee.name = "아메리카노";
		coffee.price = 1400;
		
		Coffee coffee1 = new Coffee();
		coffee1.name = "라떼";
		coffee1.price = 3000;
		
		Coffee[] coffees = {"아메리카노", "라떼"};
		for(int i =0; i< coffees.length; i++)
			System.out.println(
					coffees[i].name+ " "+coffees[i].price);
	}
	}

}

// 객체
class Coffee{ // 클래스 이름의 시작은 대문자
	// field
	String name;
	int price;
	
}