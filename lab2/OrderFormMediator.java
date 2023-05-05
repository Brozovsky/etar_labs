public class OrderFormMediator implements Mediator {
    private final PickupByCustomer pickupByCustomer;
    private final RecipientIsAnotherPerson recipientIsAnotherPerson;
    private final NameInput nameInput;
    private final PhoneInput phoneInput;
    private final DateSelection dateSelection;
    private final TimeSelection timeSelection;

    public OrderFormMediator(PickupByCustomer pickupByCustomer,
                             RecipientIsAnotherPerson recipientIsAnotherPerson, NameInput nameInput,
                             PhoneInput phoneInput, DateSelection dateSelection, TimeSelection timeSelection) {

        this.pickupByCustomer = pickupByCustomer;
        this.recipientIsAnotherPerson = recipientIsAnotherPerson;
        this.nameInput = nameInput;
        this.phoneInput = phoneInput;
        this.dateSelection = dateSelection;
        this.timeSelection = timeSelection;

        this.pickupByCustomer.setMediator(this);
        this.recipientIsAnotherPerson.setMediator(this);
        this.nameInput.setMediator(this);
        this.phoneInput.setMediator(this);
        this.dateSelection.setMediator(this);
        this.timeSelection.setMediator(this);
    }

    public void message(String action, String... parameters) {
        if (action.equals("pickup")) {
            if (parameters[0].equals("true")) {
                recipientIsAnotherPerson.setActive(false);
                nameInput.setActive(false);
                phoneInput.setActive(false);
                dateSelection.setActive(false);
                timeSelection.setActive(false);
            } else {
                recipientIsAnotherPerson.setActive(true);
                nameInput.setActive(true);
                phoneInput.setActive(true);
                dateSelection.setActive(true);
                timeSelection.setActive(true);
            }
        }
        if (action.equals("otherReceiver")) {
            if (parameters[0].equals("true")) {
                nameInput.setActive(true);
                phoneInput.setActive(true);
            } else {
                nameInput.setActive(false);
                phoneInput.setActive(false);
            }
        }
        if (action.equals("date")) {
            timeSelection.showAvailableTimeForDate(parameters[0]);
        }
    }
}