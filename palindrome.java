
public class palindrome {
	public static void main(String[] args) {
		
	
		
	int a= 141;
	
	int i=0;
	int j=0;
	
	int temp=a;
	
	while(a>0) {
		
		i=a%10;
		j=(j*10)+i;
		a=a/10;
	}
	System.out.println(j);
	
if(temp==j) {
	
	System.out.println("it is palindrome");
}else {
	
	System.out.println("not palindrome");
}

}

	}

