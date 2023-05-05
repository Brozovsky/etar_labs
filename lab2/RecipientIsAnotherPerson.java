public class RecipientIsAnotherPerson implements OrderUI {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("'Recipient is another person' is active: " + value);
    }

    public void checkBox(boolean check) {
        System.out.println("'Recipient is another person' checked: " + check);
        mediator.message("otherReceiver", String.valueOf(check));
    }
}