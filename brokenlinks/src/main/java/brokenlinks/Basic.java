package brokenlinks;

public class Basic {

	public String test(String input) {
		
		StringBuilder reversed = new StringBuilder(input);
	    return reversed.reverse().toString();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic obj=new Basic();
		obj.test("basic");
		System.out.println(obj.test("basic"));
		

	}

}
