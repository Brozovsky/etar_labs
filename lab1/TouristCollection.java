import java.util.ArrayList;
import java.util.List;


public class TouristCollection implements Tourist {
    private final List<Place> places = new ArrayList<>();

    public void add(Place place) {
        places.add(place);
    }

    @Override
    public Iterator getTouristIterator() {
        return new TouristIterator(new ArrayList<>(places));
    }
    @Override
    public Iterator getNavigatorIterator() {
        return new NavigatorIterator(new ArrayList<>(places));
    }
    @Override
    public Iterator getGuideIterator() { return new GuideIterator(new ArrayList<>(places)); }
}