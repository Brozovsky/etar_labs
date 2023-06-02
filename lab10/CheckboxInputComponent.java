public class CheckboxInputComponent implements Component {
    private final String name;

    public CheckboxInputComponent(String name) {
        this.name = name;
    }

    public void render() {
        System.out.println("Rendering checkbox with name '" + name + "'");
    }
}