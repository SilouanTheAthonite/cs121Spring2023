import java.util.ArrayList;

/**
 * 
 * @semester Spring 2023
 * @author Bryce Younger
 */
public class ToDoList implements ToDoListInterface {
    
    private String name;
    private ArrayList<Task> tasks;

    @Overide String getName(){
        return name;
    }

    @Override
    public void addTask(Task task){
        // Search tasks
        boolean add = true;
        int i = 0;

        // While I haven't found the object and there are still elements in the list
        while(add && i < tasks.size())
        {
            if(task.equals(tasks.get(i))){
                add = false;
            }
            i++;
        }

        if(add){
            tasks.add(task);
        }
        
    }

    @Override
    public void addTask(String description){
        Task task = new Task(description);
        addTask(task);
    }

    @Override
    public Task getWork(){
        if(tasks.isEmpty())
        {
            return null;
        }
        else
        {

        }
    }

    @Override
    public ArrayList<Task> getTaskList(){
        throw new UnsupportedOperationException("Unimplemented method 'getTaskList'");
    }
    
}
