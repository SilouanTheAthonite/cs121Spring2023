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

        // Create a new ToDoList
        ToDoList taskList = new ToDoList(); // @keyterm, aggregation and dependency

        // Add task1, and task2 to taskList using addTask(Task t)
        taskList.addTask(task1); // @keyterm encapsulation
        taskList.addTask(task2);

        // Add another task using addTask(String description)
        taskList.addTask("Deliver honey to Pooh bear");

        // Print taskList
        System.out.println(taskList.toString());

        // Call getWork
        System.out.println(taskList.getWork());
    }
}
