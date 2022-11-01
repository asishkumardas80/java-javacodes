package practice;
//sort an array (Bubble sort)  and remove duplicate element 
public class SortArrayAndRemoveDuplicate {
	//method for sort array
	public static void sort(int x[]) {
		for  (int i=0;i<x.length-1;i++) {
				for(int j=0;j<x.length-1;j++) {
					if(x[j]>x[j+1]) {
						int temp=x[j];
						x[j]=x[j+1];
						x[j+1]=temp;
					}
					}
				}
				for (int k=0;k<x.length;k++) {
					System.out.println(x[k]);
				}
		}
	
	//Method for remove duplicate
 public static void removeDuplicate(int x[]) {
		int temp[]= new int [x.length];  // temp length 7 (index number 0 to 6)  // same length as x[]
		
		int j =0;            // use for increment the temp index number
		
		for (int i=0;i<x.length-1;i++) {  // length-1 used for count the exact index number other wise it try to find last index value and  
										  // and give exception
			                              // loop use for compare the array index value
			if(x[i]!=x[i+1]) {            //compare the index value 
			temp[j] = x[i];			                // store the sort value in 
			j++;                                    // Increment the index number
		}
		 }	
		temp[j]=x[x.length-1];            // use to store the last value of the array 
		
		//System.out.println(temp[j]);            // only for checking propose length of temp[j]
		for (int i=0;i<j+1;i++) {         // print the value of i
		                                  // here j+1 for the number of value store in j 
			      						  //and +1 for the the last array value in list directly store in the temp
			System.out.println(temp[i]);   //output 
		}
	}
 public static void main(String[] args) {
	 int y []= {1,1,2,3,4,5,4};
	 SortArrayAndRemoveDuplicate.sort(y);
	 SortArrayAndRemoveDuplicate.removeDuplicate(y);
}
}
