// Program to remove duplicate from sorted Array

package Array;

public class RemoveDuplicate {
	    
	    static int removeDups(int arr[], int n)
	    {
	        if(n==0 || n==1)
	            return n;
	        int temp[] = new int[n];
	        
	        int j = 0;
	        for(int i=0; i<n-1; i++)
	            if(arr[i] != arr[i+1])
	                temp[j++] = arr[i];
	        temp[j++] = arr[n-1];
	        
	        for(int i=0; i<j; i++)
	            arr[i] = temp[i];
	        return j;
	    }
	    public static void main(String[] nums) {
	        int arr[] = {1,2,2,3,4,4,4,5,5};
	        //int arr[] = {1};
	        int n = arr.length;
	        n = removeDups(arr, n);
	        for(int i=0; i<n; i++)
	            System.out.print(arr[i]+ " ");        
	    }
	
}
