package Methodoverloading;


class Employee {
    double calculateSalary(double baseSalary){
        return baseSalary + (baseSalary*0.1); //with bonus
    }
    double calculateSalary(double baseSalary, double commission){
        return baseSalary + commission; //with commission
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println("Salary with bonus: " + employee.calculateSalary(5000));
        System.out.println("Salary with commission: " + employee.calculateSalary(5000, 1500));
    }
}
