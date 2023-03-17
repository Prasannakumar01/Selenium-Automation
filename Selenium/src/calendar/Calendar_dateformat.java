package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;

public class Calendar_dateformat {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		// To find the calendar type we are using in the system.
		String type = cal.getCalendarType();
		System.out.println(type);
		System.out.println();
		// To fetch the time of the system
		Date time = cal.getTime();
		System.out.println(time);
		System.out.println();
		TimeZone t = cal.getTimeZone();
		System.out.println(t);
		System.out.println();

		// types of calendars present in the world
		Set<String> c = Calendar.getAvailableCalendarTypes();
		System.out.println("calendar Types");
		for (String caltypes : c) {
			System.out.println(caltypes);
		}
		System.out.println();

		// to print the current year
		int weekyear = cal.getWeekYear();
		System.out.println("Week of the year is " + "" + weekyear);

		int weeksina_Year = cal.getWeeksInWeekYear();

		System.out.println(weeksina_Year);

		SimpleDateFormat sdf = new SimpleDateFormat("D/MM/YYY");
		String formatdate = sdf.format(time);
		System.out.println(formatdate);
		
		cal.add(Calendar.DAY_OF_MONTH,-1);
	Date d=cal.getTime();
	System.out.println(d);

	}

}
