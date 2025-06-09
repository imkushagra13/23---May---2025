package ETT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskManager {
    Map<Employee, List<Task>> map=new HashMap<>();
    public void assignTask(Employee emp,Task task){
        map.computeIfAbsent(emp,e -> new ArrayList<>()).add(task);
    }
    public List<Task> getTask(Employee emp){
        return map.getOrDefault(emp,new ArrayList<>());
    }

    public void showAllTask(){
        map.forEach((emp,task) -> {
            System.out.println("Task For: "+emp);
            task.forEach(System.out::println);
        });
    }

    public void findTaskByKeyword(String key){
        map.values().stream().flatMap(List::stream).filter(
                task -> task.description.contains(key)
        ).forEach(System.out::println);
    }

}
