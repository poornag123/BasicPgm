
public class reversenum {
	
	public static void main(String[] args) {
		
		int a = 1234;
			int i=0;
			int j=0;
			
			while(a>0) {
				i=a%10;
				j=(j*10)+i;
				a=a/10;
				
		
			
		}
	System.out.println(j);
		
		}
	}


