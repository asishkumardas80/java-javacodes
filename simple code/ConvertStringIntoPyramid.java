package practice;

public class ConvertStringIntoPyramid {
	public static void main(String[] args) {
		String s = "ASISH";
		char [] ch = s.trim().toCharArray();
		int k=0;
		
		for(int i =1;i<=s.length();i++) {//for line
			for (int j =1;j<=i;j++) {
					System.out.print(ch[k]+" ");
				k++;
				if(k>s.length()-1){       // for reset the index value of the char array
					k=0;
				}
				
			}
			
			System.out.println();
		}
	}
}
