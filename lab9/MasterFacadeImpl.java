public class MasterFacadeImpl implements MasterFacade {
    private VideoConverter aviConverter;
    private VideoConverter movConverter;
    private VideoConverter mp4Converter;

    private ApiConnector apiConnector;

    public MasterFacadeImpl(VideoConverter aviConverter, VideoConverter movConverter, VideoConverter mp4Converter,
                            ApiConnector apiConnector) {

        this.aviConverter = aviConverter;
        this.movConverter = movConverter;
        this.mp4Converter = mp4Converter;
        this.apiConnector = apiConnector;
    }

    @Override
    public void doQuery(String url, String apiKey, String query) {
        apiConnector.setUrl(url);
        apiConnector.setApiKey(apiKey);
        apiConnector.doRequest(query);
        apiConnector.closeConnection();
    }

    @Override
    public void convertVideo(String fileName, String filePath) {
        String fileFormat = fileName.substring(fileName.indexOf(".") + 1);
        switch (fileFormat) {
            case "avi":
                aviConverter.convert(filePath);
                break;
            case "mov":
                movConverter.convert(filePath);
                break;
            case "mp4":
                mp4Converter.convert(filePath);
                break;
            default:
                System.out.println("Unsupported format: " + fileFormat);
        }
    }
}