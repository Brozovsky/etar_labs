import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class GuideIterator implements Iterator {
    private final List<Place> places;
    private int pointer = 0;

    public GuideIterator(List<Place> places) {
        this.places = places.stream().sorted(Comparator.comparingInt(Place::getGuideRating))
                .collect(Collectors.toList());
    }

    public boolean hasNext() {
        return pointer < places.size();
    }

    public Place getNext() {
        if (!hasNext()) { throw new IndexOutOfBoundsException(); }
        Place place = places.get(pointer);
        pointer++;
        return place;
    }
}