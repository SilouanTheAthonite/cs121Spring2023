public class Driver {
    
    public static void main(String[] args){

        // Creates and prints initial Array
        BubbleSorter bubble = new BubbleSorter(12);
        System.out.println("BubbleSorter before call to sort()");
        System.out.println(bubble.toString());

        // Creates a sorted Array from the original, and prints it
        bubble.sort();
        System.out.println("BubbleSorter after call to sort()");
        System.out.println(bubble.toString());
    }
}
