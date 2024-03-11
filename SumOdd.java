
public class SumOdd {
	
	// 1+3+5+....100 
	//op 2500
	public static void main(String[] args) {
		
	
	int count=0 ;
	
	for(int i=1;i<=100;i++) {
		if(i%2!=0) {
			System.out.println(i);
			count= count+i;
		}
		
	
	}
	
	System.out.println(count);
}
	
	
	
	}



