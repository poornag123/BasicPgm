
public class Buff {
	
	public static void main(String[] args) {
		
		String s1 = "poorna";
		String s2 = "chandar";
		
		String concat = s1.concat(s2);
		System.out.println(concat);
		
		StringBuffer buf = new StringBuffer("poorna");
		StringBuffer buf2 = new StringBuffer("chandru");
	StringBuffer append = buf.append(buf2);
	System.out.println(append);
	}

}
