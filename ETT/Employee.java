package ETT;

/// it stores the employee details
public class Employee {
    String id;
    String name;
    String department;

    /// constructor to this employee
    public Employee(String id,String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }

    @Override
    public String toString(){
        return id+" - "+name+" ("+department+")";
    }
}
