/**
 * Allows the user to input and store advertisement information for a job
 * @author Bryce Younger
 */

import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class AdGenerator {
    
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    // Greeting from the system.
    System.out.println("Welcome to AdGenerator!");
    System.out.println("Please enter your profile information.");
    System.out.println("======================================");
    
    // Input section.
    System.out.print("First name: ");
    String firstName = input.nextLine();
    
    System.out.print("Middle name: ");
    String middleName = input.nextLine();

    System.out.print("Last name: ");
    String lastName = input.nextLine();

    System.out.print("Job title: ");
    String jobTitle = input.nextLine();

    System.out.print("Phone number (10 digit): ");
    String phoneNumber = input.nextLine(); // @keyterm, formatting a number as a string

    System.out.print("Hourly rate: ");
    double hourlyRate = input.nextDouble();

    // Advertisment outputs.
    System.out.println("======================================");
    System.out.println("Need a " + jobTitle + "?");

    String areaCode = phoneNumber.substring(0,3); // @keyterm, invocation of methods from String class
    String firstPhoneNumber = phoneNumber.substring(3,6);
    String lastPhoneNumber = phoneNumber.substring(6,10);
    System.out.println("CALL NOW! (" + areaCode + ") " + firstPhoneNumber + "-" + lastPhoneNumber);

    char middleInitial = middleName.charAt(0); 
    System.out.println("Ask for " + firstName + " " + middleInitial + ". " + lastName);

    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(); // @keyterm, use of a static method
    System.out.println("(Rates start at " + currencyFormat.format(hourlyRate) + "/hr)");
    System.out.println("======================================");

    }
}
