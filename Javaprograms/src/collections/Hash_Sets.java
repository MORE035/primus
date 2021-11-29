package collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Sets {

	public static void main(String[] args) {
		HashSet<String> HS=new HashSet<String>();

		HS.add("vasanth");
		HS.add("pavan");
		HS.add("Malathi");
		System.out.println(HS);
		HS.add("Naresh");
			Iterator<String> IT=HS.iterator();
			System.out.println(IT.next());
			System.out.println(IT.next());
			System.out.println(IT.next());
			HS.size();

	}

}
