
public class Amstrong {
	
	public static void main(String[] args) {
		
	
	
	int a= 153;
	
	int  i=0;
	int j=0;
	int temp=a;
while(a>0) {
	
	i=a%10;
	j=(i*i*i)+j;
	a=a/10;
	
}

System.out.println(j);



	
	if(temp==j) {
		
		System.out.println("it is amstrong");
	}else {
		System.out.println("not amstrong");
	}
	
}
}