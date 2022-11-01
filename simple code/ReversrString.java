package practice;

public class ReversrString {
	public static void main(String[] args) {
		String name = "asish";
		String rev=" ";
		int x = name.length();
		for(int i=x-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			
		}
		System.out.println(rev);
	}

}
