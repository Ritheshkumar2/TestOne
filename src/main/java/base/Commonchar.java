package base;

public class Commonchar {

	public static void main(String[] args) {
		//test();
		//reverseaString();
		//gethighestlengthstring();
		//getmaxNumber();
		//getmissingNumber();
		interchangenumbers();

	}

	private static void interchangenumbers() {
		int num=12345;
		int rev=0;
		
		while(num>0) {
			int n=num%10;
			rev=rev*10+n;
			num=num/10;
		}
		System.out.print(rev);
		
	}

	

	private static void getmissingNumber() {
		int[] arr= {1,2,4,5,6};
		
		int n=6;
		
		int m=n*(n+1)/2;
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.print("Missing Number = " + (m - sum));
		
	}

	private static void getmaxNumber() {
		int[] arr= {1,2,3,4,5,6,7,8,1213,13,142123541};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.print(max);
		
	}

	private static void gethighestlengthstring() {
		String value="I am an automation test engineer";
		
		String[] val=value.split("\\s+");
		
		String longeststr=val[0];
		
		for(int i=0;i<val.length;i++) {
			if(val[i].length() > longeststr.length()) {
				longeststr=val[i];
			}
		}
		System.out.print(longeststr);
		
	}

	private static void reverseaString() {
		String value="rithesh";
		
		char[] ch=value.toCharArray();
		
		String rev="";
		for(int i=ch.length-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		System.out.println(rev);
	}
	

	private static void test() {
		String ele="rithesh";
		
		char[] ch=ele.toCharArray();
		
		boolean[] visited=new boolean[ch.length];
		
		for(int i=0;i<ch.length;i++) {
			
			if(visited[i]) {
				continue;
			}
			int count=0;
			for(int j=i;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					count++;
					visited[j]=true;
				
				}
			}
			System.out.println(ch[i]+"-->"+count);
		}
		
		
	}

}
