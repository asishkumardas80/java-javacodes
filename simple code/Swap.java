package practice;
// *************** swap two number using 3rd variable ************
public class Swap {
public static void main(String[] args) {
	
	int a = 10;
	int b= 20;
	int c =a;
	a=b;
	b=c;
	
	System.out.println(a);
	System.out.println(b);
	
	A a1 =new A();
	a1.test();
}

// *************** using two variable *************
}
class A{
	public void test () {
		int a=100,b=200;
		 a=a+b;
		 b=a-b;
		 a=a-b; 
	System.out.println(a);
	System.out.println(b);
	}
	
	
}
