package basicjava;

public class Nmber_Palindrum {
	public static void main(String ARgs[]) 
	{
		
		int n=25568896;
		int r,res = 0;
		//
		while(n>0) {
			 r=n%10;
			 res=(res*10)+r;
			 n=n/10;
			 
		}
		System.out.println(res);
		
		
	}

}
