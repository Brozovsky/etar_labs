
public class Place {
    private final String name;
    private final int touristRating;
    private final int navigatorRating;
    private final int guideRating;

    public Place(String name, int touristRating, int navigatorRating, int guideRating) {
        this.name = name;
        this.touristRating = touristRating;
        this.navigatorRating = navigatorRating;
        this.guideRating = guideRating;
    }

    public int getTouristRating() { return touristRating; }
    public int getNavigatorRating() {
        return navigatorRating;
    }
    public int getGuideRating() {
        return guideRating;
    }

    @Override
    public String toString() {
        return "Place: " + name + " | Tourist Rate: " + touristRating + ", Navigator Rate: "
                + navigatorRating + ", Guide Rate: " + guideRating;
    }
}
