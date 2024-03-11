import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class REVE {
	public static void main(String[] args) {
	
		String s = "poornaa";
		
	
		
	
//	
			 Set unique = new LinkedHashSet();
			 Set duplicate = new LinkedHashSet();
			
			 
			 
		 for( char c: s.toCharArray()) {
			 if (!unique.add(c)) {
				 duplicate.add(c);
			 }			 }
//		 
		 System.out.println(duplicate);
			 
		
		StringBuilder result = new StringBuilder();
		
		for(char c: s.toCharArray()) {
			
			if(!duplicate.contains(c)) {
				 result.append(c);
			}
			
		}
//		
		System.out.println(result);
//			 
//		}
//		
	}
		
		
	}

