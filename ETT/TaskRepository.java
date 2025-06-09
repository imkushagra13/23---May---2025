package ETT;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository<T> {
    List<T> taskList=new ArrayList<>();
    public void addTask(T task){
        taskList.add(task);
    }

    public T findTaskByIndex(int idx) throws TaskNotFoundException{
        if(idx<0||idx>=taskList.size()){
            throw new TaskNotFoundException("Task Not Found");
        }
        return taskList.get(idx);
    }
}
class TaskNotFoundException extends Exception{
    public TaskNotFoundException(String message){
        super(message);
    }
}