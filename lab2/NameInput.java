public class NameInput implements OrderUI {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("Name input field is active: " + value);
    }

    public void enterName(String name) {
        System.out.println("Customer name: " + name);
        mediator.message("name", name);
    }
}