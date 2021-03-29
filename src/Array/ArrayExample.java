package Array;

public class ArrayExample {
	public static void main(String[] args) {
		int arr[] = {1,3,4,5,3};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		int std[];
		std = new int[5];
		
		std[0] = 1;
		std[1] = 1;
		std[2] = 1;
		std[3] = 1;
		std[4] = 1;
		//std[5] = 1;
		
		for(int i=0; i<std.length; i++) {
			System.out.println(std[i]);
			System.out.println(std[4]);
		}
		
	}

}
