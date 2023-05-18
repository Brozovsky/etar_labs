import java.util.List;

public class Company implements Element {
    private final List<Department> departments;

    public Company(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public List<Department> getDepartments() {
        return departments;
    }
}