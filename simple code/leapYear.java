package practice;
// ************Leap Year ***********
public class leapYear {
//public static void main(String[] args) {
//	 int y=2016;
//	 if (y%4==0) {
//		 if (y%100==0) {
//			 if (y%400==0) {
//				 System.out.println("leap year");
//			 }else {
//				 System.out.println("not a leap year");
//			 }
//		 }else {
//			 System.out.println("leap year");
//		 }
//	 
//	 }else {
//	 System.out.println("not leap year");
//	}
//}
	
	
	/////////Using if else //////
	public static void main(String[] args) {
		int y=2016;
		if (y%100!=0 && y%4==0 ) {
			if(y%400==0) {
				System.out.println("leap year");
			}else {
				System.out.println("leapyear");
			}
			
		}else {
			System.out.println("not  leap year");
		}
		
		
	}

}