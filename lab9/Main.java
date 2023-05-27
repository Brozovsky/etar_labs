public class Main {
    public static void main(String[] args) {
        VideoConverter aviConverter = new AviConverter();
        VideoConverter movConverter = new MovConverter();
        Mp4Converter mp4Converter = new Mp4Converter();
        ApiConnector apiConnector = new YoutubeApiConnector();

        MasterFacade masterFacade = new MasterFacadeImpl(aviConverter, movConverter, mp4Converter, apiConnector);

        masterFacade.convertVideo("dogbirthday.mp4", "/path/dogbirthday.mp4");
        masterFacade.convertVideo("hiking.mov", "/path/hiking.mov");
        masterFacade.convertVideo("movie.avi", "/path/movie.avi");
        masterFacade.convertVideo("uiuxhomework.gif", "/path/uiuxhomework.gif");
        masterFacade.doQuery("youtube.com/myChannel", "mykey123", "getSubscribersCount");
    }
}