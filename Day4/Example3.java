import java.util.Arrays;
import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Loop : while(true) { // Loop : 라벨링
		Scanner sc = new Scanner(System.in);
		String[] st = new String[4];
		for(int i=0; i<st.length; i++) {
			System.out.println("이름 입력");
			String line = sc.nextLine();
			System.out.println("나이 입력");
			String line2 = sc.nextLine();
			
			int age = Integer.parseInt(line2); // int로 바꿈
			st[i] = line;
			if(line.equals("q"))
			break Loop;
		}
		
		System.out.println(Arrays.toString(st));
		}
		System.out.println("end");
	}

}
