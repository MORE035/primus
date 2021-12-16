package assignments;

public class Palendrum {

	public static void main(String[] args) {
	
	StringBuilder sb=new StringBuilder();
	String actual = sb.append(12344321).toString();
	String rev = sb.reverse().toString();

	if(actual.equals(rev)) {
		
		System.out.println(actual+" palendram number");
	}
	else
	{
		System.out.println(actual+" not palendram number");

		
	}
	}
}
