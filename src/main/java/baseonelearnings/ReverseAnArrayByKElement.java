package baseonelearnings;

import java.util.Arrays;

public class ReverseAnArrayByKElement {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		rotateByRight(arr,2);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void rotateByRight(int arr[],int k) {
	    int start=0;
		int n=arr.length-1;
		k = k % n;
		
		rev(arr,start,n);
		rev(arr,start,k-1);
		rev(arr,k,n);
		
	}

	private static void rev(int arr[],int start,int end) {
		
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
			
		}
		
	}

}
