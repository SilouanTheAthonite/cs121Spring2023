import java.util.Random;
/**
 * 
 * @author Bryce Younger
 * @semester Spring 2023
 */
public class BubbleSorter {
    
    private int[] arrayValues; // @keyterm, array declaration
    private int i;

    /**
     * Assigns random values to an array whose size is determined by input
     * @param size
     */
    public BubbleSorter(int size){
        Random rand = new Random();
        arrayValues = new int[size]; // @keyterm, array initialization
        for (i = 0; i < arrayValues.length; ++i) // @keyterm, bounds checking
        {
            arrayValues[i] = rand.nextInt();
        }
    }

    /**
     * Converts the random array values into a String constaining a commma-separted list
     */
    @Override
    public String toString(){
        String toReturn = "Array contents: ";
        for (int v: arrayValues)
        {
            toReturn += v + ", ";
        }
        return toReturn;
    }

    /**
     * Sorts the arrayList integers from least to greatest
     */
    public void sort(){
        boolean done = false;
        while (!done)
        {
            done = true;
            for (i = 1; i < arrayValues.length; ++i)
            {
                if (arrayValues[i - 1] > arrayValues[i])
                {
                    swap(i - 1, i);
                    done = false;
                }
            }
        }
    }

    /**
     * Swaps the values of the array at two indexes (x and y)
     * @param x
     * @param y
     */
    private void swap(int x, int y){
        int tempValue = arrayValues[x]; // @keyterm, array element
        arrayValues[x] = arrayValues[y];
        arrayValues[y] = tempValue;
    }
}
