import java.util.Scanner;
public class ArrayPrac {
    
    public static void main(String[] args){

        // Create Scanner, Array
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Get numbers from user
        // ask for number, read number, store the number
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter a number: ");
            numbers[i] = input.nextInt();
        }
        
        // Print numbers in opposite order
        System.out.println("Your numbers, reversed: ");
        for(int i = numbers.length - 1; i >=0; i--){
            System.out.println(numbers[i]);
        }

        // Swap the first and last number
        // Store one of the values
        int temp = numbers[0];
        // Overwrite the value that was stored
        // with the other value
        numbers[0] = numbers[numbers.length - 1];
        // put temp in
        numbers[numbers.length - 1] = temp;


        // Print the array
        for(int elem: numbers){
            System.out.println(elem);
        }


        // Close the scanner
        input.close();
    }
}
