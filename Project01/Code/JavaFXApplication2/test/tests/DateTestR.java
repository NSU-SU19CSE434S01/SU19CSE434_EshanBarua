package tests;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Test;

public class DateTestR {

		@Test 
		public void currentDay()
		{
		    Date current = new Date(0);
		    System.out.println(current);
		    assertEquals("today:", current, new Date(0));
		}
	}