import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employeeA1 = new Employee("Junior", 500);
        Employee employeeA2 = new Employee("Middle", 800);
        Employee employeeA3 = new Employee("Senior", 1600);

        Employee employeeB1 = new Employee("HR", 700);
        Employee employeeB2 = new Employee("Cleaner", 250);

        Department departmentA = new Department(Arrays.asList(employeeA1, employeeA2, employeeA3));
        Department departmentB = new Department(Arrays.asList(employeeB1, employeeB2));

        Company company = new Company(Arrays.asList(departmentA, departmentB));
        Visitor salaryCounterVisitor = new SalaryCounterVisitor();

        departmentA.accept(salaryCounterVisitor);
//        Salary across department = 7300

        departmentB.accept(salaryCounterVisitor);
//        Salary across department = 2600

        company.accept(salaryCounterVisitor);
//        Salary across company = 9900
    }
}