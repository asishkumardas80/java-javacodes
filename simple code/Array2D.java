package practice;
	//2d Array
public class Array2D {
	public static void main(String[] args) {
		int x [][]= new int [4][4];
		x[0][0]=10;
		x[0][1]=20;
		x[0][2]=30;
		x[0][3]=40;
		x[1][0]=10;
		x[1][1]=20;
		x[1][2]=30;
		x[1][3]=40;
		x[2][0]=10;
		x[2][1]=20;
		x[2][2]=30;
		x[2][3]=40;
		x[3][0]=10;
		x[3][1]=20;
		x[3][2]=30;
		x[3][3]=40;
		for (int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				System.out.println(x[i][j]);
			}
		}
	}
}
