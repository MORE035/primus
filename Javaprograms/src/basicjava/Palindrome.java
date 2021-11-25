package basicjava;

public class Palindrome {

	public static void main(String[] args) {
		String a="basaha";
		for(int j=0;j<a.length();j=j+2) 
		
		{
			
			System.out.print("");
			
		}
		System.out.println(" ");


		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			
			b=b+a.charAt(i);
			
			
		}
		System.out.println(b);
		System.out.println("End");
	}

}
