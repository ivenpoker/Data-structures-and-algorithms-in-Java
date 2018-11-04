package Book_1.Exercises.Exercise_3_13;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee1 = new Employee("James","Bond", 2000);
        Employee employee2 = new Employee("Peter", "Novig", 6000);

        // displaying 'employee1' information...

        System.out.printf("Employee1 first name: %s%n", employee1.getFirstName());
        System.out.printf("Employee1 last name : %s%n", employee1.getLastName());
        System.out.printf("Employee1 monthly: $%.2f%n", employee1.getMonthlySalary());
        System.out.printf("Employee1 yearly salary: $%.2f%n", employee1.getMonthlySalary() * 12); // '12' is the total months in a year

        // displaying 'employee2' information...

        System.out.printf("%n");

        System.out.printf("Employee1 first name: %s%n", employee2.getFirstName());
        System.out.printf("Employee1 last name : %s%n", employee2.getLastName());
        System.out.printf("Employee1 monthly: $%.2f%n", employee2.getMonthlySalary());
        System.out.printf("Employee1 yearly salary: $%.2f%n", employee2.getMonthlySalary() * 12); // '12' is the total months in a year

        System.out.printf("%n");

        // Let us now give a 10% raise for each employee salary

        double employee1Raise = (employee1.getMonthlySalary() * (10.0 / 100)) + employee1.getMonthlySalary();
        double employee2Raise = (employee2.getMonthlySalary() * (10.0 / 100)) + employee2.getMonthlySalary();

        employee1.setMonthlySalary(employee1Raise);
        employee2.setMonthlySalary(employee2Raise);

        System.out.printf("Employee1 new salary: $%.2f, yearly salary: $%.2f%n",
                employee1.getMonthlySalary(), employee1.getMonthlySalary() * 12);
        System.out.printf("Employee2 new salary: $%.2f, yearly salary: $%.2f%n",
                employee2.getMonthlySalary(), employee2.getMonthlySalary() * 12);

    }
}
