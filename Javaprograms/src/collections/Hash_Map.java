package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {

	public static void main(String[] args) {

		HashMap<Integer, String>HM= new HashMap<Integer, String>();
		HM.put(0, "vasanth");
		HM.put(1, "Pavan");
		HM.put(2, "Malathi");

		//System.out.println(HM);
		Set HS = HM.entrySet();
		Iterator it = HS.iterator();
		while(it.hasNext()) {
			Map.Entry mm =(Map.Entry) it.next();
			System.out.println(mm.getValue());
			System.out.println(mm.getKey());
		}
		
		

	}

}
