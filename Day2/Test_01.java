
public class Test_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr1 = {
				{1,2,3}, 
				{4,5,6},
				{7,8,9}};
		
//		1,1 1,2 1,3
//		2,1 2,2 2,3
//		3,1 3,2 3,3
		
		// #문제1 987 654 321
		for(int i=arr1.length; i>0; i--) { // 3 
			for(int j=arr1.length; j>0; j--) { // 
				System.out.print(arr1[i-1][j-1]);
			}
		}
		System.out.println();
		
		// #문제2 147 258 369
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				System.out.print(arr1[j][i]);
			}
		}
	}

}
