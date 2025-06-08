package LMS;

import java.util.ArrayList;

/// noew we will be extending thread class to check whether the due date has passed or not
public class Overdue extends Thread{
    ArrayList<LendingRecord> records;
    public Overdue(ArrayList<LendingRecord> records){
        this.records=records;
    }
    @Override
    public void run(){ /// this run method check and filter the date in the
        while (true) {
            System.out.println("Overdue books are .......");
            records.stream()
                    .filter(record -> record.returnDate == null &&
                            java.time.LocalDate.parse(record.dueDate)
                                    .isBefore(java.time.LocalDate.now()))
                    .forEach(record -> System.out.println("Overdue Book: "
                            + record.book.title + " Taken by " + record.member.name));

            try{
                Thread.sleep(60000); /// tu run every minute
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
