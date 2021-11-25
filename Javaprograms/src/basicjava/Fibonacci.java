package basicjava;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		int i=1;
		while(i<=10) {
	
		int sum=a+b;
		a=b;
		b=sum;
		System.out.print(" "+b);

		

	i++;

		}
		//System.out.println();
		
		for(int j=0;j<=10;j++) {
			int sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+b);

		}
			
		}
	}


