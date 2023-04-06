import java.util.Scanner;
/**
 * Creates a SodaSurvey 
 * @semester Spring 2023
 * @author Bryce Younger
 */
public class SodaSurveyDriver {
    
    public static void main(String[] args){

        // Declare Variables
        SodaSurvey survey;
        Scanner input = new Scanner(System.in);

        // Asks user to input filename
        System.out.println("Input a file name.");
        survey = new SodaSurvey(input.nextLine());

        // Prints a string of the SodaSurvey created from the file
        System.out.println("Survey averages for each person and soda:");
        System.out.print(survey.toString());
    }
}
