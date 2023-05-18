import java.util.List;

public class Department implements Element {
    private final List<Employee> employees;

    public Department(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}