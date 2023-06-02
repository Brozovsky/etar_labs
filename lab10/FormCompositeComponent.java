import java.util.ArrayList;
import java.util.List;

public class FormCompositeComponent implements CompositeComponent {
    private final String name;
    private final List<Component> components = new ArrayList<>();

    public FormCompositeComponent(String name) {
        this.name = name;
    }

    public void render() {
        System.out.println("Rendering form with name " + name + " and its components: {");
        components.forEach(Component::render);
        System.out.println("}");
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    public List<Component> getChildComponents() {
        return new ArrayList<>(components); //copy
    }
}