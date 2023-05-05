public class PhoneInput implements OrderUI {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("Phone input field is active: " + value);
    }

    public void enterPhone(String phone) {
        System.out.println("Customer's phone number: " + phone);
        mediator.message("phone", phone);
    }
}