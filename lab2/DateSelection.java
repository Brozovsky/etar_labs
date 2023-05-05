public class DateSelection implements OrderUI {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("Date selector is active: " + value);
    }

    public void selectDate(String date) {
        System.out.println("Date order: " + date);
        mediator.message("date", date);
    }
}
