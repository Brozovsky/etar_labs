public class PasswordInputComponent implements Component {
    private final String name;

    public PasswordInputComponent(String name) { this.name = name; }

    public void render() {
        System.out.println("Rendering password field with name '" + name + "'");
    }
}