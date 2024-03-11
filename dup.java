import java.util.LinkedHashSet;
import java.util.Set;

public class dup {
	
	public static void main(String[] args) {
		
	
	
	String s = "poornaa";
	
		
	StringBuilder result = new StringBuilder();
	
	Set duplicate = new LinkedHashSet();
	
	for(char c : s.toCharArray()) {
		
		if (!duplicate.contains(c)) {
			
			result.append(c);
		}
	}
	
	System.out.println(result);

}
}

