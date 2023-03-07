import java.util.Scanner;


public class MainJavaPractice {
    
    public static void main(String[] args){

        // Write a while loop that prints out numbers 1 - 10

        int i = 1; // initialization
        while(i <= 10){
            System.out.println(i); // loop body

            i++; // update
        }

        // Write a while loop that asks for numbers and classifies them
        // as even or odd until the user enters a negative number
        Scanner kbd = new Scanner(System.in);

        // initialization
        int num = 0;

        while (num >= 0){
            // Ask for number
            System.out.println("Enter your number: ");
            num = Integer.parseInt(kbd.nextLine());
        }


    }
}
