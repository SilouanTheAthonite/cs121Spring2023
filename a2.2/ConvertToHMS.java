/**
 * Converts time in seconds to a combination of hours, minutes, and seconds
 * @author Bryce Youn5ger
 */
import java.util.Scanner;

 public class ConvertToHMS {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        // @keyterm Scanner

        // Time in seconds
        System.out.print("Enter the number of seconds: ");
        // @keyterm String
        int initialTime = input.nextInt();
        // @keyterm Token

        // Time converted to hours, minutes, and seconds
        int totalHours = initialTime / 3600;
        int totalMinutes = (initialTime % 3600) / 60;
        // @keyterm Modulo
        int totalSeconds = (initialTime % 3600) % 60;

        // Output time in hours, minutes, and seconds
        System.out.print(initialTime + " seconds is: " + totalHours + " hours, " + totalMinutes + " minutes, and " + totalSeconds + " seconds.");




    }
}