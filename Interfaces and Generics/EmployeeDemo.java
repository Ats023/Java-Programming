//Demonstration of interfaces

interface Employee {
    public int get_empID();
    public int get_empSalary();
}   

class Manager implements Employee {
    private int empID, empSalary;
    Manager(int id, int salary) {
        empID = id;
        empSalary = salary;
    }
    public int get_empID() {
        return empID;
    }
    public int get_empSalary() {
        return empSalary;
    }
    public void inaccessible_method() {
        System.out.println("This method not accessible by an interface reference variable.");
    }
}

class Developer implements Employee {
    private int empID, empSalary;
    Developer(int id, int salary) {
        empID = id;
        empSalary = salary;
    }
    public int get_empID() {
        return empID;
    }
    public int get_empSalary() {
        return empSalary;
    }
    public void inaccessible_method() {
        System.out.println("This method not accessible by an interface reference variable.");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Manager(123, 80000);
        Developer dv = new Developer(264, 50000);
        System.out.printf("Using interface reference variable emp...\nCreated Manager with empID %d and salary %d.\n",emp.get_empID(), emp.get_empSalary());
        System.out.printf("Using developer reference variable dv...\nCreated Manager with empID %d and salary %d.\n",dv.get_empID(), dv.get_empSalary());
    }

}
