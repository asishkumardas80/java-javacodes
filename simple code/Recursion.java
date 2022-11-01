package practice;
// ****factorial using recursion ****
// recursion meaning method call it self repeatedly
public class Recursion {
	int fact=1;
 public static void main(String[] args) {
	int no=4,res;
	Recursion a1 =new Recursion();
	res=a1.callfact(no);
	System.out.println(res);
}
 	int callfact(int no) {
 		if(no>1) {
 			fact=fact*no;
 			callfact(no-1);
 		}
 		
 		return fact;
 	}
}
