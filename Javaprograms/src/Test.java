
public class Test {
	{
		System.out.println("instants block");
		
	}
	static {
		
		System.out.println("static block");
		
	}
	Test(){
		
		System.out.println("constructer block");

	}
	public static void main(String[] args) {
		Test t=new Test();
			}

}
 