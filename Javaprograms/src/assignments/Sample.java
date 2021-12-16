package assignments;

import java.util.stream.IntStream;

public class Sample {

	   public static void main(String args[])
	    {
		  StringBuffer str=new StringBuffer();
		  str.append("vasanth@123");
	      //  String str = "GeeksForGeeks";
		  
	        // Creating array of string length
	        char[] ch = new char[str.length()];
	  
	        // Copy character by character into array
	        for (int i = 0; i < str.length(); i++) {
	            ch[i] = str.charAt(i);
	        }
	  
	        // Printing content of array
	        for (char c : ch) {
	            System.out.println(c);
	            
	        }
	    }
	}