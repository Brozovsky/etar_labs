public class SubmitButtonComponent implements Component {
    private final String name;

    public SubmitButtonComponent(String name) {
        this.name = name;
    }

    public void render() {
        System.out.println("Rendering submit button with name '" + name + "'");
    }
}