import java.util.List;

public interface CompositeComponent extends Component {
    void addComponent(Component component);
    void removeComponent(Component component);
    List<Component> getChildComponents();
}