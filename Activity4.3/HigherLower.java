import java.util.Random;
import java.util.Scanner;

/**
 * Lesson 10: Activity - while Loops and Iterators 
 * 
 * @author Java Foundations
 * @author Bryce Younger
 * @version Fall 2018
 */
public class HigherLower
{
	public static void main(String[] args)
	{
		final int MAX = 10;
		int answer;
		int guess;
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		answer = random.nextInt(MAX) + 1; // @keyterm, initial condition
		
		System.out.print("I'm thinking of a number between 1 and " + MAX + ". ");
		System.out.print("Guess what it is: ");
		
//		guess = scan.nextInt(); //Warning! Using nextInt() will screw up your ability
					//to read anything other than ints later on!
		guess = Integer.parseInt(scan.nextLine());	//THIS is how you should read
								//a line of input when an int
								//is expected and you still want
								//to be able to read something
								//else later.

        String response = "y";

        while(response.equals("y")){    // @keyterm, terminating condition                
            while(guess != answer){     // @keyterm, loop
                if (guess > MAX || guess < 0)
                {
                    System.out.print("Your guess is outside of the possible range. It can't be correct. Guess again: ");
                    guess = Integer.parseInt(scan.nextLine());
                }   
                else
                {
                    if (guess > answer) // @keyterm, equality
                    {  
                        System.out.println("Guess lower: ");
                        guess = Integer.parseInt(scan.nextLine());
                    }
                    else if (guess < answer)
                    {
                        System.out.println("Guess higher: ");
                        guess = Integer.parseInt(scan.nextLine());
                    }
                }
        
            }
            
            // When guess == answer
            System.out.println("You got it! Good guessing!");
		
		    System.out.println("Would you like to play again? (y/n)");

            response = scan.nextLine();
            
            if  (response.equals("y"))
            {
                answer = random.nextInt(MAX) + 1;
                System.out.print("I'm thinking of a number between 1 and " + MAX + ". ");
		        System.out.print("Guess what it is: ");
                guess = Integer.parseInt(scan.nextLine());
            }
        }
        System.out.println("Game over. Thank you for playing!");

		scan.close();
	}
}
