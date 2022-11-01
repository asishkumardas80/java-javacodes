package practice;

public class FindMissingNumberInargBetweer_0to9 {
	//find missing number from the series (0-9)

//		public static void sort(int[] x) {
//			for  (int i=0;i<x.length-1;i++) {
//				for(int j=0;j<x.length-1;j++) {
//					if(x[j]>x[j+1]) {
//						int temp=x[j];
//						x[j]=x[j+1];
//						x[j+1]=temp;
//					}
//					}
//				}
//				//for (int k=0;k<x.length;k++) {ss
//					//System.out.println(x[k]);
//				//}
//		}
		public static void first(int[] x) {//count 0 to9
			
			
					int[] dup=new int[12];
					for(int read :x) {
					dup[read]=1;
					System.out.println(dup.length);
					}
					for(int z=0;z<dup.length;z++) {
						if(dup[z]==0) {
						System.out.println(z);
						}
					
					}
			}	
		
	   public static void main(String[] args) {
		   int x[]= {0,2,3,4,6,7,8,10,11};
		   
		  // Just.sort(x);
		   first(x);
		   
		   
	}	
}
	 

