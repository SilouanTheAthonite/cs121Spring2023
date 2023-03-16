/**
 * Allows for the creation of task list complete with description, priority, completion status, and category.
 * @semester Spring 2023
 * @author Bryce Younger
 */
public class Task implements Comparable<Task>{

    private String description;
    private int priority;
    private boolean complete;
    
    public enum Category {PERSONAL, WORK, SCHOOL, FUN, NONE};
    private Category category; 

    /**
     * Creates a task when given only a description
     * @param description
     */
    public Task(String description){
        this.description = description; // @keyterm, object initialization
        this.priority = 1; // Low priority = 1, High priority = 20
        this.complete = false;
        this.category = Category.NONE;
    }
    
    /**
     * Creates a task when given both a description and integer related to his priority
     * @param description
     * @param priority
     */
    public Task(String description, int priority){
        this.description = description;
        this.priority = priority;
        this.complete = false;
        this.category = Category.NONE;
    }
    
    /**
     * Returns a String representing the state of the task given the boolean input
     * @param complete
     * @return taskStatus
     */
    @Override
    public String toString(){
        String taskStatus;
        
        if(complete)
        {
            taskStatus = "[ ] " + description + ", " + priority + ", " + category;
        }
        else
        {
            taskStatus = "[X] " + description + ", " + priority + ", " + category;
        }

        return taskStatus;
    }

    /**
     * Returns a description of a task
     * @return description
     */
    public String getDescription(){
        return description;
    }

    /**
     * Sets the description of a task
     * @param descript
     */
    public void setDescription(String descript){
        description = descript;
    }

    /**
     * Returns the priority of a task
     * @return priority
     */
    public int getPriority(){
        return priority;
    }

    /**
     * Sets the priority of a task
     * @param prior
     */
    public void setPriority(int prior){
        priority = prior;
    }

    /**
     * Returns whether or not the task is complete
     * @return complete
     */
    public boolean isComplete(){
        return complete;
    }

    /**
     * Sets whether or not the task is complete
     * @param comp
     */
    public void setComplete(boolean comp){
        complete = comp;
    }

    /**
     * Returns the category type of a task
     * @return category
     */
    public Category getCategory(){
        return category;
    }

    /**
     * Sets the category type of a task
     * @param cat
     */
    public void setCategory(Category cat){
        category = cat;
    }

    /**
     * Indicates whether some task is "equal to" this task. Tasks are equal if
     * they have the same description (case insensitive).
     * @param The other task to compare this task to.
     * @return true if the tasks are equal, false otherwise.
     */
    public boolean equals(Task other)
    {
        if(this.description.equalsIgnoreCase(other.description) && this.category.equals(other.category))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
    * Compares two tasks based on their priorities.
    * @param The other task to compare this task to.
    * @return difference between the tasks if they are either both complete or
    * both incomplete, return -1 if this task is complete and the parameter task 
    * is incomplete, returns 1 if parameter task is complete and this task is not     
    * complete.
    */
    @Override
    public int compareTo(Task other)
    {   
	    if(this.complete == other.complete)
	    {
            return this.priority - other.priority;
        }
        else if(this.complete && !other.complete)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

}
