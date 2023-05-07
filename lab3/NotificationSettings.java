public class NotificationSettings implements Preservable {
    private boolean newsNotification;
    private boolean offersNotification;
    private boolean memesNotification;

    public Memento save() {
        return new NotificationSettingsMemento(newsNotification, offersNotification, memesNotification);
    }

    public void restore(Memento memento) {
        NotificationSettingsMemento notificationSettingsMemento = (NotificationSettingsMemento) memento;
        this.newsNotification = notificationSettingsMemento.isNewsNotification();
        this.offersNotification = notificationSettingsMemento.isOffersNotification();
        this.memesNotification = notificationSettingsMemento.isMemesNotification();
    }

    public NotificationSettings(boolean newsNotification, boolean offersNotification, boolean memesNotification) {
        this.newsNotification = newsNotification;
        this.offersNotification = offersNotification;
        this.memesNotification = memesNotification;
    }

    public void setNewsNotification(boolean newsNotification) {
        this.newsNotification = newsNotification;
    }

    public boolean isOffersNotification() {
        return offersNotification;
    }

    public void setOffersNotification(boolean offersNotification) {
        this.offersNotification = offersNotification;
    }

}