package algo;

public class LSearchE {
	
	public static int search(int arr[], int x) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			if(arr[i] == x)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,30,44,50,55,33,25,66};
		int x = 553;
		int index = search(arr, x);
		if(index == -1)
			System.out.println("Not found");
		else
			System.out.println("Nubmer is at index: " + index);
	}

}
