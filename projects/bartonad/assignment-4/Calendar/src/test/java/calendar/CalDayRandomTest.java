package calendar;


import org.junit.Test;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=15	;
	
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void randomtest()  throws Throwable  {

		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


		 System.out.println("Start testing...");

		 try{
			 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
				 long randomseed =System.currentTimeMillis();
				 Random random = new Random(randomseed);

				 int startHour=ValuesGenerator.getRandomIntBetween(random, -1, 25);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, -1, 60);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, -1, 32);
				 int startMonth = ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
				 String title="Birthday Party";
				 String description="This is my birthday party.";
				 //Construct a new Appointment object with the initial data
				 Appt appt = new Appt(startHour,
						 startMinute ,
						 startDay ,
						 startMonth ,
						 startYear ,
						 title,
						 description);

				 startHour=ValuesGenerator.getRandomIntBetween(random, -1, 25);
				 startMinute=ValuesGenerator.getRandomIntBetween(random, -1, 60);
				 startDay=ValuesGenerator.getRandomIntBetween(random, -1, 32);
				 startMonth = ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 startYear=ValuesGenerator.RandInt(random);
				 title="Birthday Party";
				 description="This is my birthday party.";
				 Appt appt2 = new Appt(startHour,
						 startMinute ,
						 startDay ,
						 startMonth ,
						 startYear ,
						 title,
						 description);
				 GregorianCalendar day = new GregorianCalendar();
				 CalDay c = new CalDay(day);
				 if(!appt.getValid() && !appt2.getValid())continue;
				 for (int i = 0; i < NUM_TESTS; i++) {
					c.addAppt(appt);
					c.addAppt(appt2);
				 }

				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				 if((iteration%10000)==0 && iteration!=0 )
					 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

			 }
		 }catch(NullPointerException e){

		 }

		 System.out.println("Done testing...");
	 }


	
}
