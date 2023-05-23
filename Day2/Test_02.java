
public class Test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {
				{4,7,9,10}, // 
				{2,7,3,4}, // 
				{9,2,8,5}, // 
				{8,4,2,1} // 
		};
		
		// # 문제1. arr탐색을 하는데, 만약 짝수면 그 수를 출력하고, 홀수이면서 더한 값이 20이 넘으면 끝내고, 아니면  더한 값을 출력하라.
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			boolean isBreak = sum > 20; // boolean는  Y/N 답변하기 때문에 변수명은 주로 "is~"로 시작하는게 일반적.
			for(int j=0; j<arr.length; j++) { // 짝수
				int now = arr[i][j];
				if(now % 2 == 0) {
					System.out.println(now);
				} else { // 홀수
					sum += now;
					isBreak = sum > 20; // ???????????????????? 17행에서 썼는데 왜 또 씀???????????????
					if(isBreak) break; // 첫 번째 for문 beak.
				}
			}
		if(isBreak) break; // 두 번째 for문 break.
		}
		System.out.println(sum);
		
		// **변수명 특징
		// camel case : 변수명 작성 시, 띄어쓰기 대신 대문자로 씀. 대문자로 쓰는게 낙타등같다고 해서 ex)nowTargetNumber
		// snake case : 파이썬에서는 주로 띄어쓰기 대신, _(언더바)르 주로 씀.
		
		
	}

}
