public class Main {

    public static void main(String[] args) {
        NotificationSettings notificationSettings = new NotificationSettings(true, true, true);
        Caretaker caretaker = new Caretaker(notificationSettings);
        caretaker.backup();
        caretaker.history();
    
        System.out.println();

        notificationSettings.setNewsNotification(false);
        caretaker.backup();

        notificationSettings.setOffersNotification(false);
        caretaker.backup();
        caretaker.history();

        System.out.println();

        caretaker.undo();
        caretaker.undo();
        System.out.println(notificationSettings.isOffersNotification());
        caretaker.history();
    }
}