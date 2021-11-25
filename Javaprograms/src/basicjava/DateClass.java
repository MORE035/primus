package basicjava;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateClass {
	public static void main(String[] args) {

		Date DT=new Date();
		int Cureentdate = DT.getDay();

		SimpleDateFormat SD=new SimpleDateFormat("M/d/yyy");
		SimpleDateFormat SD1=new SimpleDateFormat(" d/M/yyy hh:mm:ss");
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getFirstDayOfWeek());
		
		
		
		
		System.out.println(SD.format(DT));
		System.out.println(SD1.format(DT));

		System.out.println(DT.toString());

	}

}
