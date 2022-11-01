package practice;
import java.util.Scanner;
// BY USER INPUT (PRE DEFINE SYMBOL)
public class Calculator {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int x =s.nextInt();
		
		System.out.println("enter 2nd number");
		int y = s.nextInt();
		
		System.out.println("1-ADD"+"   "+"2-MINUS"+"3-MULTI"+"4-DIVIDE");
		
		int z =s.nextInt();
		switch(z) {
		case 1 :
			System.out.println(x+y);
			break;
		case 2 :
			System.out.println(x-y);
			break;
		case 3 :
			System.out.println(x*y);
			break;
		case 4 :
			System.out.println(x/y);
			break;
			
			
			
			
		}
		Calculator c1 = new Calculator();
		c1.test();
		
	}
		//use user define symbol 
		public void test() {
			Scanner a1 = new Scanner(System.in);
			System.out.println("Enter 1st number");
			int a =a1.nextInt();
			
			System.out.println("enter 2nd number");
			int b = a1.nextInt();
			
			System.out.println("input symbol(+,-,*,/ ");
			String c = a1.next();
			
			
			
			switch(c){
			case "+" :
				System.out.println(a+b);
				break;
			case "-" :
				System.out.println(a-b);
				break;
			case "*" :
				System.out.println(a*b);
				break;
			case "/" :
				System.out.println(a/b);
				break;
			default :
				System.out.println("invalid symbol");
			}
			}
		
	 
	}
	 
 



