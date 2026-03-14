package baseonelearnings;

public class FindHighestIntergerInAnArray {

	public static void main(String[] args) {
		int arr[]= {1,2,23,1213,13,1,2,3,6,7898013,8,0};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print(max);

	}

}
