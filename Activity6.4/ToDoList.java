import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * @semester Spring 2023
 * @author Bryce Younger
 */
public class ToDoList implements ToDoListInterface { // @keyterm inheritance
    
    private String name;
    private ArrayList<Task> tasks;

    /**
     * This method returns the name of a task
     * @return name
     */
    @Override 
    public String getName(){
        return name;
    }

    /**
     * Adds a prexisting task to the ToDo List
     * @param task
     */
    @Override
    public void addTask(Task task){
        // Search tasks
        boolean add = true;
        int i = 0;

        // While I haven't found the object and there are still elements in the list
        while((add) && (i < tasks.size()))
        {
            if(tasks.equals(tasks.get(i))){
                add = false;
            }
            i++;
        }

        if(add){
            tasks.add(task);
        }
        
    }

    /**
     * Adds a task to the ToDo List description
     * @param description
     */
    @Override
    public void addTask(String description){
        Task task = new Task(description);
        addTask(task);
    }

    /**
     * Returns the highest priority task that isn't completed already
     * @return largest
     */
    @Override
    public Task getWork(){
        if(tasks.isEmpty())
        {
            return null;
        }
        else
        {
            Task largest = Collections.max(tasks);
            if (largest.isComplete())
            {
                return null;
            }
            else
            {
                return largest;
            }
        }
    }

    /**
     * Creates a copy of the previously created taskList
     * @return taskList
     */
    @Override
    public ArrayList<Task> getTaskList(){
        ArrayList<Task> taskList = new ArrayList<Task>();
        for(Task t: tasks){
            taskList.add(t);
        }
        return taskList;
    }

    /**
     * Returns the arrayList as a String
     * @return result
     */
    @Override
    public String toString(){
        String result = name + "\n";
        for(Task task : tasks){
            result += task.toString();
        }
        return result;
    }
}
