package baseonelearnings;

import java.util.ArrayList;
import java.util.List;

public class MoveAllZerostotheEnd {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		int arr[]= {1,2,0,3,4,0,5,6,7,0,1,2,3,4,6};
		
		List<Integer> newarr=new ArrayList<>();
		
		int zerocount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 0) {
				zerocount++;
			}else {
				newarr.add(arr[i]);
			}
		}
		
		for(int i=0;i<zerocount;i++) {
			newarr.add(0);
		}
		System.out.print(newarr);
	}
}
