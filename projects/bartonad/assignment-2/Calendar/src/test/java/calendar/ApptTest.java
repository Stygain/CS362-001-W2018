package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void testConstructor()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	 @Test
	  public void testInvalid()  throws Throwable  {
		 int startHour=28;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
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

		 startHour = -1;
		 Appt appt2 = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);
		 // assertions
		 assertFalse(appt.getValid());
		 assertFalse(appt2.getValid());
	 }
	@Test
	public void testInvalid2()  throws Throwable  {
		int startHour=21;
		int startMinute=65;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
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

		startMinute = -2;
		Appt appt2 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
//		assertFalse(appt.getValid());
//		assertFalse(appt2.getValid());
	}
	@Test
	public void testInvalid3()  throws Throwable  {
		int startHour=21;
		int startMinute=50;
		int startDay=36;
		int startMonth=01;
		int startYear=2018;
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

		startDay=-1;
		Appt appt2 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertFalse(appt.getValid());
		assertFalse(appt2.getValid());
	}
	@Test
	public void testInvalidBranches()  throws Throwable  {
		int startHour=21;
		int startMinute=50;
		int startDay=36;
		int startMonth=01;
		int startYear=2018;
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


		title=null;
		description=null;
		appt.setTitle(title);
		appt.setDescription(description);
		// assertions
		assertFalse(appt.getValid());
	}

	@Test
	public void testSetFunctions()  throws Throwable  {
		int startHour=21;
		int startMinute=30;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Birthday Party";
		String description="This is my birthday party.";
		int newStartHour=12;
		int newStartMinute=45;
		int newStartDay=10;
		int newStartMonth=02;
		int newStartYear=2019;
		String newTitle="Friend Party";
		String newDescription="This is a party for my friends.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		appt.setStartHour(newStartHour);
		appt.setStartMinute(newStartMinute);
		appt.setStartDay(newStartDay);
		appt.setStartMonth(newStartMonth);
		appt.setStartYear(newStartYear);
		appt.setTitle(newTitle);
		appt.setDescription(newDescription);
		// assertions
		assertTrue(appt.getValid());
		assertEquals(12, appt.getStartHour());
		assertEquals(45, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(02, appt.getStartMonth());
		assertEquals(2019, appt.getStartYear());
		assertEquals("Friend Party", appt.getTitle());
		assertEquals("This is a party for my friends.", appt.getDescription());
	}

	@Test
	public void testToString()  throws Throwable  {
		int startHour=21;
		int startMinute=50;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
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

		startDay = 200;
		Appt appt2 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		startDay = 15;
		startHour = 10;
		Appt appt3 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertNull(appt2.toString());
		assertEquals("	1/15/2018 at 9:50pm ,Birthday Party, This is my birthday party.\n", appt.toString());
		assertEquals("	1/15/2018 at 10:50am ,Birthday Party, This is my birthday party.\n", appt3.toString());
	}

	@Test
	public void testCompareTo()  throws Throwable  {
		int startHour=12;
		int startMinute=30;
		int startDay=10;
		int startMonth=03;
		int startYear=2018;
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

		startHour=10;
		startMinute=20;
		startDay=05;
		startMonth=02;
		startYear=2018;
		title="Birthday Party";
		description="This is my birthday party.";
		Appt appt2 = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);
		// assertions
		assertEquals(18, appt.compareTo(appt2));
	}

	@Test
	public void testIsRecurring()  throws Throwable  {
		int startHour=12;
		int startMinute=30;
		int startDay=10;
		int startMonth=03;
		int startYear=2018;
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
		int[] recurDaysArr={2,3,4};
		appt.setRecurrence(recurDaysArr, Appt.RECUR_BY_WEEKLY, 2, Appt.RECUR_NUMBER_NEVER);
		// assertions
		assertFalse(appt.isRecurring());
	}
	
}
