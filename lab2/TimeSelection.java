public class TimeSelection implements OrderUI {
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setActive(boolean value) {
        System.out.println("Time selector is active: " + value);
    }

    public void showAvailableTimeForDate(String date) {
        System.out.println("Available time for date - " + date);
    }

    public void selectTime(String time) {
        System.out.println("Order time: " + time);
        mediator.message("time", time);
    }
}