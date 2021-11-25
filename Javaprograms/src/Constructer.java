
public class Constructer {

	public Constructer() {
		
		System.out.println("Main constructer");
	}
	public Constructer(int a) {
		int w=25;
		System.out.println("Sub-constructer");
	}
	
	public int sum(int x,int y) {
		
		int z;
		z=x+y;
		System.out.println(z);
		return z;
		
		
		
	}
	public static void main(String[] args) {

		Constructer con=new Constructer();
		int sumvalue = con.sum(25, 36);
		//System.out.println(sumvalue);
		Constructer con2=new Constructer(45);
		con2.sum(25, 45);

		Constructer con1=new Constructer(2);

	}

}
