package basicjava;

public class String_Buffer {

	public static void main(String[] args) {

		StringBuffer SB=new StringBuffer("Hello");
		SB.append("World");
		System.out.println(SB);
		StringBuilder SBB=new StringBuilder("Hello World");
		String j = SBB.substring(0, 5);
		SBB.deleteCharAt(5);
		System.out.println(SBB);
		System.out.println(j);

	}

}
  