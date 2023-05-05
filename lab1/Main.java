public class Main {

    public static void main(String[] args) {
        Place odessaOpera = new Place("Odessa Opera and Ballet", 1, 2,
                3);
        Place khortytsia  = new Place("Khortytsia Island", 3, 2, 1);
        Place annunciationCathedral = new Place("Kharkiv Annunciation Cathedral", 1,
                3, 2);

        TouristCollection collection = new TouristCollection();
        collection.add(odessaOpera);
        collection.add(khortytsia);
        collection.add(annunciationCathedral);

        Iterator touristIterator = collection.getTouristIterator();
        while (touristIterator.hasNext()) { System.out.println(touristIterator.getNext()); }
        System.out.println();

        Iterator navigatorIterator = collection.getNavigatorIterator();
        while (navigatorIterator.hasNext()) { System.out.println(navigatorIterator.getNext()); }
        System.out.println();

        Iterator guideIterator = collection.getGuideIterator();
        while (guideIterator.hasNext()) { System.out.println(guideIterator.getNext()); }
    }
}