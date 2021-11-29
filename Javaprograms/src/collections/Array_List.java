package collections;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

public class Array_List {

	public static void main(String[] args) {

		ArrayList<String> AL=new ArrayList<String>();
		ArrayList<String> AL1=new ArrayList<String>();

		AL.add("vasanth");
		AL.add("pavan");
		AL.add("Malathi");
		System.out.println(AL);
		AL.remove("vasanh");
		System.out.println(AL);
		
		System.out.println(AL.isEmpty());
		System.out.println(AL.indexOf("pavan"));
		AL.size();
		AL.add(1, "Naresh");
		System.out.println(AL);
		 
		 System.out.println(AL1);

		
	}

}
