import java.util.Scanner;

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void calculateBonus(double bonusPercentage) {
        double bonusAmount = salary * (bonusPercentage / 100);
        System.out.println("Bonus calculated: " + bonusAmount);
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
        System.out.println("Salary updated to: " + newSalary);
    }
}

public class EmployeeExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter job title: ");
        String jobTitle = scanner.nextLine();

        System.out.print("Enter initial salary: ");
        double initialSalary = scanner.nextDouble();

        Employee employee = new Employee(name, jobTitle, initialSalary);

        System.out.println("Employee details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: " + employee.getSalary());

        System.out.print("Enter bonus percentage: ");
        double bonusPercentage = scanner.nextDouble();
        employee.calculateBonus(bonusPercentage);

        System.out.print("Enter new salary: ");
        double newSalary = scanner.nextDouble();
        employee.updateSalary(newSalary);

        System.out.println("Updated Employee details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Updated Salary: " + employee.getSalary());

        scanner.close();
    }
}
