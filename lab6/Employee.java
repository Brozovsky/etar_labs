public class Employee {
    private String role;
    private int salary;

    public Employee(String role, int salary) {
        this.role = role;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public int getSalary() {
        return salary;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}