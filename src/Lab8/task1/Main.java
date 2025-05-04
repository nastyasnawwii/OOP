package Lab8.task1;

public class Main {
    public static void main(String[] args){
        Employee employee = new Employee("Anastasia", 17, 2500);
        System.out.printf("Name: %s,Age: %d,Salary: %2.f%n", employee.getName(), employee.getAge(), employee.getSalary());
    }
}
