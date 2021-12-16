package assignments;

public class Sort_String_Chr {

	public static void main(String[] args) {
		  String s = "1mMAK OWSHIKkonik##$$yadi133mqk22@@12";
		  String x="";
		  String y="";
		  String z="";
		  for(int i=0; i<s.length(); i++) {
		   int asciivalue1 = s.charAt(i);
		   if((asciivalue1>=32 && asciivalue1<=47)||(asciivalue1>=58 && asciivalue1<=64)){
		    x = x.concat(Character.toString(s.charAt(i)));
		   }
		   else if(asciivalue1>=48 && asciivalue1<=57) {
		    y = y.concat(Character.toString(s.charAt(i)));
		    
		   }
		   else if((asciivalue1>=65 && asciivalue1<=90)||(asciivalue1>=97 && asciivalue1<=122)) {
		    z = z.concat(Character.toString(s.charAt(i)));
		   }
		   
		  }
		  System.out.println(x+"      "+y+"           "+z); // character whose ASCII value to be found  
		   

		 }

		}

