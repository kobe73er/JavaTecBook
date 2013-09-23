package Calender;

import java.util.Calendar;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		int dayOfYear=cal.get(Calendar.DAY_OF_YEAR);
		System.out.println("Today is the "+dayOfYear+" day of the year!");
		
		cal.set(2013, Calendar.SEPTEMBER,3);
		int dayOfWeek=cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(dayOfWeek);
		
		cal.set(Calendar.YEAR, 2013);
		cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		cal.set(Calendar.DAY_OF_WEEK_IN_MONTH, 1);
		int dayOfMonth=cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(dayOfMonth);
	}

}
