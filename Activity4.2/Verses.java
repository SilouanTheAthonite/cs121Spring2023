import java.util.Scanner;

/**
 * Lesson 9: Activity - Data Comparisons and Switch Statements
 * 
 * @author CS121 Instructors
 * @author <you>
 */
public class Verses
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Which day is it (1 - 12)? ");
		int day = scan.nextInt();
		String daySuffix = "th";
		
		// TODO: Use a switch statement to set the appropriate suffix for the day
		switch(day)
		{
		case (1):
			daySuffix = "st";
			break;

		case (2):
			daySuffix = "nd";
			break;

		case (3):
			daySuffix = "rd";
			break;

		case (4):
			daySuffix = "th";
			break;

		case (5):
			daySuffix = "th";
			break;

		case (6):
			daySuffix = "th";
			break;

		case (7):
			daySuffix = "th";
			break;

		case (8):
			daySuffix = "th";
			break;

		case (9):
			daySuffix = "th";
			break;

		case (10):
			daySuffix = "th";
			break;

		case (11):
			daySuffix = "th";
			break;

		case (12):
			daySuffix = "th";
			break;

		}
		
		System.out.println("On the " + day + daySuffix + " day of Christmas my true love gave to me");
	
		// TODO: Use a switch statement to control which lines get printed depending on the day
		switch(day)
		{
			case (1):
				System.out.println("A partridge in a pear tree.");
				break;
			
			case (2):
				System.out.println("Two turtle doves, and");
				System.out.println("A partridge in a pear tree.");
				break;

			case (3):
				System.out.println("Three french hens,");
				System.out.println("Two turtle doves, and");
				System.out.println("A partridge in a pear tree.");
				break;

			case (4):
				System.out.println("Four calling birds,");
				System.out.println("Three french hens,");
				System.out.println("Two turtle doves, and");
				System.out.println("A partridge in a pear tree.");
				break;

			case (5):
				System.out.println("Five golden rings,");
				System.out.println("Four calling birds,");
				System.out.println("Three french hens,");
				System.out.println("Two turtle doves, and");
				System.out.println("A partridge in a pear tree.");
				break;

			case (6):
				System.out.println("Six geese a laying,");
				System.out.println("Five golden rings,");
				System.out.println("Four calling birds,");
				System.out.println("Three french hens,");
				System.out.println("Two turtle doves, and");
				System.out.println("A partridge in a pear tree.");
				break;

			case (7):
				System.out.println("Seven swans a swimming,");
				System.out.println("Six geese a laying,");
				System.out.println("Five golden rings,");
				System.out.println("Four calling birds,");
				System.out.println("Three french hens,");
				System.out.println("Two turtle doves, and");
				System.out.println("A partridge in a pear tree.");
				break;

			case (8):
				System.out.println("Eight maids a milking,");
				System.out.println("Seven swans a swimming,");
				System.out.println("Six geese a laying,");
				System.out.println("Five golden rings,");
				System.out.println("Four calling birds,");
				System.out.println("Three french hens,");
				System.out.println("Two turtle doves, and");
				System.out.println("A partridge in a pear tree.");
				break;

			case (9):
				System.out.println("Nine ladies dancing,");
				System.out.println("Eight maids a milking,");
				System.out.println("Seven swans a swimming,");
				System.out.println("Six geese a laying,");
				System.out.println("Five golden rings,");
				System.out.println("Four calling birds,");
				System.out.println("Three french hens,");
				System.out.println("Two turtle doves, and");
				System.out.println("A partridge in a pear tree.");
				break;

			case (10):
				System.out.println("Ten lords a leaping,");
				System.out.println("Nine ladies dancing,");
				System.out.println("Eight maids a milking,");
				System.out.println("Seven swans a swimming,");
				System.out.println("Six geese a laying,");
				System.out.println("Five golden rings,");
				System.out.println("Four calling birds,");
				System.out.println("Three french hens,");
				System.out.println("Two turtle doves, and");
				System.out.println("A partridge in a pear tree.");
				break;

			case (11):
				System.out.println("Eleven pipers piping,");
				System.out.println("Ten lords a leaping,");
				System.out.println("Nine ladies dancing,");
				System.out.println("Eight maids a milking,");
				System.out.println("Seven swans a swimming,");
				System.out.println("Six geese a laying,");
				System.out.println("Five golden rings,");
				System.out.println("Four calling birds,");
				System.out.println("Three french hens,");
				System.out.println("Two turtle doves, and");
				System.out.println("A partridge in a pear tree.");
				break;

			case (12):
				System.out.println("Twelve drummers drumming,");
				System.out.println("Eleven pipers piping,");
				System.out.println("Ten lords a leaping,");
				System.out.println("Nine ladies dancing,");
				System.out.println("Eight maids a milking,");
				System.out.println("Seven swans a swimming,");
				System.out.println("Six geese a laying,");
				System.out.println("Five golden rings,");
				System.out.println("Four calling birds,");
				System.out.println("Three french hens,");
				System.out.println("Two turtle doves, and");
				System.out.println("A partridge in a pear tree.");
				break;
		}
		
		scan.close();
	}
}
