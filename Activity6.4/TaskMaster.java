/**
 * 
 * @semester Spring 2023
 * @author Bryce Younger
 */
public class TaskMaster {
    public static void main(String[] args){

        // Create task1
        Task task1 = new Task("Finish Activity 6.3"); // @keyterm, object declaration
        System.out.println(task1); // @keyterm, object

        // Set task1 to complete
        task1.setComplete(true); // @keyterm, method invocation
        System.out.println("Task 1 is complete: " + task1.isComplete());
        System.out.println(task1);

        // Set task1 category to SCHOOL
        task1.setCategory(Task.Category.SCHOOL);
        System.out.println("Task 1 category " + task1.getCategory() + " category");
        System.out.println(task1);
        System.out.println();

        // Create task2 with priority 10
        Task task2 = new Task("Give Tigger a bath", 10);
        System.out.println(task2);

        // Change priority of task2 with priority 20
        task2.setPriority(20);
        System.out.println("Task 2 priority: " + task2.getPriority());
        System.out.println(task2);
    }
}
