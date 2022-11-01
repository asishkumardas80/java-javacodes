package practice;
// sort Array
//bubble short
public class sortArray_BubbleShort {
	public static void main(String[] args) {
	
	int x []= {1,5,10,12};
	
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
}
