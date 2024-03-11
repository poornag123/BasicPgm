import java.util.Scanner;

public class VowScaneer {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		
		String name = sc.nextLine();
		System.out.println("The vowles in filed " +name);
		
for (int i=0;i<name.length();i++) {
			
			char ch = name.charAt(i);
			
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				//count++;
				
				System.out.println(ch);

}

}

	}
}



