package tests;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest{

SimpleDateFormat dformat = new SimpleDateFormat("dd-MM-yyyy");

private int day;
private int month;
private int year;

public DateTest() 
{
    String today;
    Calendar present = Calendar.getInstance();

    day = present.get(Calendar.DAY_OF_MONTH);
    month = present.get(Calendar.MONTH);
    year = present.get(Calendar.YEAR);

    present.setLenient(false);
    present.set(year, month - 1, day, 0, 0);

    today = dformat.format(present.getTime());
    System.out.println(today);
}
}