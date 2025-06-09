package ETT;

import java.time.LocalDate;

public class Task implements Comparable<Task>{
    String id;
    String description;
    String status;
    LocalDate dueDate;
    int priority;

    public Task(String id,String description,String status,LocalDate dueDate,int priority){
        this.id=id;
        this.description=description;
        this.status=status;
        this.dueDate=dueDate;
        this.priority=priority;
    }

    @Override
    public int compareTo(Task obj1){
        return Integer.compare(obj1.priority, this.priority);
    }

    @Override
    public String toString(){
        return id + " - " + description + " | Status: " + status + " | Due: " + dueDate + " | Priority: " + priority;
    }
}

