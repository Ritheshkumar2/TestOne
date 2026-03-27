package base;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		String value="learnings";
		System.out.println(value.length());
		
		int vowels=0;
		int consonants=0;
		
		for(int i=0;i<value.length();i++) {
			char ch=value.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
						if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u'){
							vowels++;
						}else {
							consonants++;
						}
					}	
		}
		System.out.println("vowels count:"+vowels);
		System.out.println("consonants count:"+consonants);
		
		
	}

}
