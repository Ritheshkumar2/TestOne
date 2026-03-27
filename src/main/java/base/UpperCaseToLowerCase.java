package base;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {
		//test();		
		convertUpperTolower();
	}

	private static void convertUpperTolower() {
		String name="RiTHesh";
		
		char[] ch=name.toCharArray();
		StringBuffer bf=new StringBuffer();
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) {
				bf.append(Character.toLowerCase(ch[i]));
			}else if(Character.isLowerCase(ch[i])) {
				bf.append(Character.toUpperCase(ch[i]));
			}else {
				bf.append(ch[i]);
			}
		}
		System.out.println(bf);
		
	}

	private static void test() {
        String name="RithesH";
		
		char[] ch=name.toCharArray();
		
		StringBuffer bf=new StringBuffer();
		
		for(int i=0;i<ch.length;i++) {
			 if (Character.isUpperCase(ch[i])) {
	                bf.append(Character.toLowerCase(ch[i]));
	            } else {
	                bf.append(ch[i]);
	            }
	        }
	        System.out.println(bf); 
	        System.out.println(""); 
	}
}
