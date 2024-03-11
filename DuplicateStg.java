
public class DuplicateStg {
	
	public static void main(String[] args) {
		String s= "poornaa";
		char[] cs = s.toCharArray();
		
		for(int i=1;i<s.length();i++) {
			
			for( int j=i+1;j<s.length();j++) {
				
				if(cs[i]==cs[j]) {
					
					System.out.println(cs[j]);
			
			
		
	
						
				}
			
			
			}
		}
		
		
	}

}
