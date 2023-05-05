public class PickupByCustomer implements OrderUI {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("Pickup by customer: " + value);
    }

    public void checkBox(boolean check) {
        System.out.println("'Pickup by customer' checked: " + check);
        mediator.message("pickup", String.valueOf(check));
    }
}