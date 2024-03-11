
public class countd {
	
public static void main(String[] args) {
	

	int a= 123;
	int count=0;
	
	while(a>0) {
		
		a=a%10;
		count= count+1;
	}
	
	System.out.println(count);
}

}
