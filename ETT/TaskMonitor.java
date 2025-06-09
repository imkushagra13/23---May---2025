package ETT;

import java.time.LocalDate;
import java.util.List;

public class TaskMonitor extends Thread {
    TaskManager taskManager;

    public TaskMonitor(TaskManager taskManager) {
    }

    public void TaskMonitor(TaskManager taskManager){
        this.taskManager=taskManager;
    }

    @Override
    public void run(){
        while(true){
            if(taskManager!=null) {
                System.out.println("Checking Overdue Taks....");
                taskManager.map.values().stream()
                        .flatMap(List::stream)
                        .filter(task -> task.status.equals("Pending")
                                && task.dueDate.isBefore(LocalDate.now()))
                        .forEach(task -> System.out.println("Overdue Tasks: " + task));
            }else System.out.println("Task Manger is Null");
            try{
                Thread.sleep(60000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
