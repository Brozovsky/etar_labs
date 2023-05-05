public class Main {
    public static void main(String[] args) {
        PickupByCustomer pickupByCustomer = new PickupByCustomer();
        RecipientIsAnotherPerson recipientIsAnotherPerson = new RecipientIsAnotherPerson();
        NameInput nameInput = new NameInput();
        PhoneInput phoneInput = new PhoneInput();
        DateSelection dateSelection = new DateSelection();
        TimeSelection timeSelection = new TimeSelection();

        new OrderFormMediator(pickupByCustomer, recipientIsAnotherPerson, nameInput,
                phoneInput, dateSelection, timeSelection);

        pickupByCustomer.checkBox(true);

        System.out.println();
        pickupByCustomer.checkBox(false);

        System.out.println();
        recipientIsAnotherPerson.checkBox(true);
        nameInput.enterName("Diane");
        phoneInput.enterPhone("8 800 555 3535");

        System.out.println();
        recipientIsAnotherPerson.checkBox(false);
        dateSelection.selectDate("04.05.23");
        timeSelection.selectTime("15:00");
    }
}