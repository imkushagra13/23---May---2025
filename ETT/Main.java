package ETT;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TaskManager tm=new TaskManager();
        Scanner sc=new Scanner(System.in);

        Employee emp1=new Employee("E001","Raj","IT");
        Employee emp2=new Employee("E002","Amar","HR");
        Employee emp3=new Employee("E003","Dixit","Finance");

        tm.assignTask(emp1,new Task("T101","Debug","Pending", LocalDate.now().plusDays(2),2));
        tm.assignTask(emp2,new Task("T102","Server Isuue","In Progress", LocalDate.now().plusDays(4),1));
        tm.assignTask(emp3,new Task("T103","Interview Scheduled","Hold", LocalDate.now().plusDays(1),3));

       TaskMonitor monitor= new TaskMonitor(tm);
       monitor.start();

        while(true){
            System.out.println("Task Tacker Menu..");
            System.out.println("1. Show All Tasks");
            System.out.println("2. Search Tasks By Keyword");
            System.out.println("3. Exit");
            int choice=sc.nextInt();
            System.out.println();

            switch (choice){
                case 1:
                    tm.showAllTask();
                    break;
                case 2:
                    System.out.println("Enter Keyword");
                    String key=sc.nextLine();
                    tm.findTaskByKeyword(key);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }

        }
    }
}