import java.util.Calendar;

public class NotificationSettingsMemento implements Memento {
    private final String name;
    private final Calendar date;

    private final boolean newsNotification;
    private final boolean offersNotification;
    private final boolean memesNotification;

    public NotificationSettingsMemento(boolean newsNotification, boolean offersNotification, boolean memesNotification) {
        this.newsNotification = newsNotification;
        this.offersNotification = offersNotification;
        this.memesNotification = memesNotification;
        this.date = Calendar.getInstance();
        this.name = String.format("News: %b; Offers: %b; Memes: %b", newsNotification, offersNotification, memesNotification);
    }

    public boolean isNewsNotification() {
        return newsNotification;
    }

    public boolean isOffersNotification() {
        return offersNotification;
    }

    public boolean isMemesNotification() {
        return memesNotification;
    }

    public String getName() {
        return name;
    }

}