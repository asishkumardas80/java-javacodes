package practice;
import java.util.Scanner;
public class ScannerClass {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in); 

	//scanner
	String name = s.next();
	System.out.println(name);
	
	//intiger
	int i = s.nextInt();
	System.out.println(i);
	
	//float
	float f = s.nextFloat();
	System.out.println(f);
	
	
	//boolean
	boolean b= s.nextBoolean();
	System.out.println(b);
	
	
	
	String ss = s.nextLine();
	System.out.println(ss);
}
}
