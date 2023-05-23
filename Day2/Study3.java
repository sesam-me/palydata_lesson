
public class Study3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		int[] arr2 = arr.clone();
		int[] arr3 = {1,2,3};
		if(arr==arr2){
			System.out.println("true"); // true가 나오면 안됨.-> clone()으로 연동되는 것을 막고, 똑같은 것을 따로 넣어줌
		}
		if(arr==arr3) {
			System.out.println("true2");
		}
		arr2[0] = 10;
		System.out.println(arr2[0]);
		System.out.println(arr[0]);
		
	}

}
