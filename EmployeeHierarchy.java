package OOPsPrinciples;

class Employee{
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Manager extends Employee {
    String department;
    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}
public class EmployeeHierarchy {
    public static void main(String[] args) {
        Manager mgr = new Manager("Rashni", 50000, "IT");
        Employee emp = new Employee("Rashni Thapa", 15000);
        emp.displayInfo();
        mgr.displayInfo();
    }
}
