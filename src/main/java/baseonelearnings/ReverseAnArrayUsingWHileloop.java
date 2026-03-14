package baseonelearnings;

import java.util.Arrays;

public class ReverseAnArrayUsingWHileloop {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int start=0;
		int end=arr.length-1;
		System.out.println(Arrays.toString(arr));
        rev(arr,start,end);
        System.out.println(Arrays.toString(arr));

        

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
