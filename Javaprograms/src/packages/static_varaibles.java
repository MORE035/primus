package packages;

public class static_varaibles {
	public static String name;
	static String Address;
	String city;

	
	public static_varaibles(String name,String  address,String  city) {
		this.name=name;
		this.Address=address;
		System.out.println(name+Address);
	
		
	}
	public void method1() {
		
	System.out.println(name);
		
	}
	public static void staticmethod() {
		
		
		System.out.println(Address);
	}

	public static void main(String[] args) {
		static_varaibles sv=new static_varaibles("vasanth","vemana_colony","hyderabad");
		sv.method1();
		static_varaibles.staticmethod();

	}

}
