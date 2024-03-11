
public class StringPgm {
	
	public static void main(String[] args) {
		
		String s= "SeleniumAutomationtool";
		int length = s.length();
		System.out.println(length);
	
		
	
		String s2= "P o o r na";
		int length2 = s2.length();
		System.out.println(length2);
	
		String s3= "9095484678";
int length3 = s3.length();
System.out.println(length3);



String s5 ="SeleniumAutomationtool ";
int of = s5.indexOf('e');
System.out.println(of);


String s6 = "j a v a p r o g r a m"; 
int lastIndexOf = s6.lastIndexOf(" ");
 System.out.println(lastIndexOf);

 String s7 = "j a v a p r o g r a m"; 
char charAt = s7.charAt(8);
System.out.println(charAt);

String s8 = "java";
String s9 = "java";

boolean b = s8.endsWith(s9);
System.out.println(b);


//et the email id from the user and verify '@' is present or not?


String s10= "g.purna89@gmail.com";
boolean equals = s10.contains("@");
System.out.println(equals);


//Given String as "Welcome to java class" and verify whether the given string endsWith java


String s11 = "Welcome to java class";
boolean endsWith1 = s11.endsWith("class");
System.out.println(endsWith1);


String s12 = " ";
boolean empty = s12.isEmpty();
System.out.println(empty);

//literal

String s13 = "Nisha"; //String ref = "value"
String s14 = "Nisha";

int code = System.identityHashCode(s13);
System.out.println(code);
int code2 = System.identityHashCode(s14);
System.out.println(code2);


//non

String s15 = new String ("Nisha");
String s16 = new String ("Nisha");

int code3 = System.identityHashCode(s15);
System.out.println(code3);

int code4 = System.identityHashCode(s16);
System.out.println(code4);

//Given String as "Welcome to java class" and split it by space.
//o/p welcome
//to

String s17 = "Welcome to java class";

String[] split = s17.split(" ");

for(int i=0;i<s17.length()-1;i++) {
	
	
	System.out.println(split[i]);
	
}

	
}


}
