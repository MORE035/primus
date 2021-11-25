package arrays;
public class Multiple_Array {

	public static void main(String[] args) {
	/*	int[][]b= {{2,3,5,6},{10,20,56,54}};//print minimum value
		int min=b[0][0];
		for(int i=0;i<2;i++) {
			for(int j=0;j<4;j++) {
		System.out.println(b[i][j]);
		if(b[i][j]<min) {
			min=b[i][j];
		}
	}
		}
		System.out.println(min);
*/
	int a[][]= {{25,35,45,57},{61,25,69,85}};
	int max=a[0][0];
	for(int i=0;i<2;i++) {
		for(int j=0;j<4;j++) {
	System.out.println(a[i][j]);
	if(a[i][j]>max) {
		max=a[i][j];
	}
}
	}
		System.out.println(max);
	}
	
}
