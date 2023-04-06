import java.util.Random;
public class TwoDArrays {
    
    public static void main(String[] args){
        // Create twoD array with x col and y row
        // x, y must be >= 4
        int[][] nums = new int[5][3]; // 5 rows, 3 cols

        // Fill array with random numbers
        Random rand = new Random(12);
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                nums[row][col] = rand.nextInt(23);
            }
        }

        // Print the whole array
        for(int row = 0; row < nums.length; row++)
        {
            for(int col = 0; col < nums[row].length; col++)
            {
                System.out.print(nums[row][col] + " ");
            }
        }

        // Print first value in array
        System.out.println("First element: " + nums[0][0]);

        // Print last value in array
        int lastRow = nums.length - 1;
        int lastCol = nums[lastRow].length - 1;
        System.out.println("Last element: " + nums[lastRow][lastCol]);
        
        // Print the 2nd column
        System.out.println("2nd column: ");
        for(int row = 0; row < nums.length; row++)
        {
            System.out.println(nums[row][1]);
        }

        // Print the third row
        System.out.println("Third row: ");
        for(int col = 0; col < nums[2].length; col++)
        {
            System.out.print(nums[2][col] + " ");
        }
        System.out.println();
        for(int elem: nums[2])
        {
            System.out.print(elem + " ");
        }
        System.out.println();

        // Print the diagonal
        System.out.println("Diagonal: ");
        for(int i = 0; i < nums[0].length; i++)
        {
            System.out.print(nums[i][i] + " ");
        }
        System.out.println();
    }
}
