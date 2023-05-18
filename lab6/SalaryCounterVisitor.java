public class SalaryCounterVisitor implements Visitor {
    @Override
    public void visit(Company company) {
        int companySalary = 0;
        for (Department department : company.getDepartments()) {
            companySalary += countDepartmentSalary(department);
        }
        System.out.println("Salary across company = " + companySalary);
    }

    @Override
    public void visit(Department department) {
        System.out.println("Salary across department = " + countDepartmentSalary(department));
    }

    private int countDepartmentSalary(Department department) {
        int salaryCounter = 0;
        for (Employee employee : department.getEmployees()) {
            salaryCounter += employee.getSalary();
        }
        return salaryCounter;
    }
}