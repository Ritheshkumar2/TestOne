package baseonelearnings;

public class RemainWhitesspacesandreversethewords {

	public static void main(String[] args) {
		test();

	}

	private static void test() {
		String words="he is good";//reverse string while preserving whitespaces//"h e   i s" --> s i   e h(we need to check this)
		
		String[] word=words.split("\\s+");	
		StringBuffer buff=new StringBuffer();
		
		for(int i=word.length-1;i>=0;i--) {
			buff.append(word[i]).append(" ");
		}
		System.out.print(buff.toString().trim());
	}

}
