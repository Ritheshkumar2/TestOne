package baseonelearnings;

public class SecondLargestElementInAnArray {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		int arr[]= {1,2,3,4,56,654,1,2,12,56};
		
		int max=Integer.MIN_VALUE;
		int secmax=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secmax=max;
				max=arr[i];
			}
			else if(arr[i] > secmax && arr[i] != secmax) {
				secmax=arr[i];
			}
		}
		System.out.print(secmax);
	}

}
